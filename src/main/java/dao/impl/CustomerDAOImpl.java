package dao.impl;

import dao.CustomerDAO;
import dao.databaseConnection.ConnectionPool;
import dao.entity.Customer;
import dao.exception.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerDAOImpl implements CustomerDAO {

    private final ConnectionPool connectionPool;

    public CustomerDAOImpl(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    private static final String INSERT_CUSTOMER_QUERY = "insert into bank_customer(customer_name,customer_surname, customer_patronymic, customer_gender, customer_email," +
            " customer_passport_number, customer_passport_series, customer_subject_passport_issue, customer_passport_id, customer_birth_place,customer_birth_date," +
            " customer_live_city,customer_password, customer_home_address,customer_work_address, customer_city,customer_live_address, customer_home_telephone," +
            " customer_mobile_telephone,customer_work_position, customer_residence_city, customer_residence_address, customer_family_status, customer_every_month_profit," +
            " customer_military, customer_invalid, customer_pensioner, customer_nationality) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMERS = "SELECT * FROM bank_customer;";
    private static final String SELECT_CUSTOMER = "SELECT * FROM bank_customer WHERE customer_passport_id=?;";
    private static final String SELECT_SIZE = "";

    @Override
    public void insertCustomer(Customer customer) throws DAOException {
        setCustomerInfoToDatabase(customer);
    }

    @Override
    public List<Customer> getCustomerList() throws DAOException {
        return getCusList();
    }

    @Override
    public Customer getCustomer(String customerPassportId) throws DAOException {
        return getCus(customerPassportId);
    }

    private void close(AutoCloseable... autoCloseables) {
        for (AutoCloseable autoCloseable : autoCloseables) {
            if (Objects.nonNull(autoCloseable)) {
                try {
                    autoCloseable.close();
                } catch (Exception e) {
                    e.printStackTrace();//logger
                }
            }
        }
    }


    private void setCustomerInfoToDatabase(Customer customer) throws DAOException {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = connectionPool.provide();
            preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
            //connection.setAutoCommit(false);

            preparedStatement.setString(1, customer.getCustomerName());  //имя
            preparedStatement.setString(2, customer.getCustomerSurName());  //фамилия
            preparedStatement.setString(3, customer.getCustomerPatronymic());  //отчество
            preparedStatement.setString(4, customer.getCustomerGender());  //пол
            preparedStatement.setString(5, customer.getCustomerEmail());  //почта
            preparedStatement.setString(6, customer.getCustomerPassportNumber());  //номер паспорта
            preparedStatement.setString(7, customer.getCustomerPassportSeries());   //серия паспорта
            preparedStatement.setString(8, customer.getSubjectPassportIssue());   //кем выдан
            preparedStatement.setString(9, customer.getCustomerPassportId());   // ID паспорта
            preparedStatement.setString(10, customer.getCustomerBirthPlace()); // место рождения
            preparedStatement.setString(11, customer.getBirthDate()); //дата рождения
            preparedStatement.setString(12, customer.getCustomerLiveCity()); //город проживания
            preparedStatement.setString(13, customer.getCustomerPassword()); //пароль
            preparedStatement.setString(14, customer.getCustomerHomeAddress()); //домашний адрес
            preparedStatement.setString(15, customer.getCustomerWorkAddress()); //рабочий адрес
            preparedStatement.setString(16, customer.getCustomerCity()); //город
            preparedStatement.setString(17, customer.getCustomerLiveAddress()); //адрес проживания
            preparedStatement.setString(18, customer.getCustomerHomeTelephone()); //домашний телефон
            preparedStatement.setString(19, customer.getCustomerMobileTelephone()); //мобильный телефон
            preparedStatement.setString(20, customer.getCustomerWorkPosition()); //должность
            preparedStatement.setString(21, customer.getCustomerResidenceCity()); //город прописки
            preparedStatement.setString(22, customer.getCustomerResidentAddress()); //адрес прописки
            preparedStatement.setString(23, customer.getCustomerFamilyStatus()); //семья
            preparedStatement.setString(24, customer.getCustomerEveryMonthProfit()); //ежемесячный доход
            preparedStatement.setBoolean(25, customer.getMilitaryBool()); //военнообязанный
            preparedStatement.setBoolean(26, customer.getCustomerInvalidBool()); //инвалидность
            preparedStatement.setBoolean(27, customer.getCustomerPensionerBool()); //пенсионер
            preparedStatement.setString(28, customer.getCustomerNationality()); //национальность

            preparedStatement.executeUpdate();

            //connection.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new DAOException("Error in insert method!");
        } finally {
            close(preparedStatement);
            connectionPool.retrieve(connection);
        }

    }

    private List<Customer> getCusList() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        List<Customer> customers = new ArrayList<>();
        try {
            connection = connectionPool.provide();
            preparedStatement = connection.prepareStatement(SELECT_CUSTOMERS);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getString(18),
                        resultSet.getString(19),
                        resultSet.getString(20),
                        resultSet.getString(21),
                        resultSet.getString(22),
                        resultSet.getString(23),
                        resultSet.getString(24),
                        resultSet.getString(25),
                        resultSet.getBoolean(26),
                        resultSet.getBoolean(27),
                        resultSet.getBoolean(28),
                        resultSet.getString(29));
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("ss");
        } catch (DAOException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
            connectionPool.retrieve(connection);
        }
        return customers;
    }

    private Customer getCus(String customerPassportId) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        Customer customer = null;
        try {
            connection = connectionPool.provide();
            preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);
            preparedStatement.setString(1, customerPassportId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customer = new Customer(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        resultSet.getString(13),
                        resultSet.getString(14),
                        resultSet.getString(15),
                        resultSet.getString(16),
                        resultSet.getString(17),
                        resultSet.getString(18),
                        resultSet.getString(19),
                        resultSet.getString(20),
                        resultSet.getString(21),
                        resultSet.getString(22),
                        resultSet.getString(23),
                        resultSet.getString(24),
                        resultSet.getString(25),
                        resultSet.getBoolean(26),
                        resultSet.getBoolean(27),
                        resultSet.getBoolean(28),
                        resultSet.getString(29));
            }
        } catch (SQLException e) {
            System.out.println("ss");
        } catch (DAOException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement, resultSet);
            connectionPool.retrieve(connection);
        }
        return customer;
    }
}
