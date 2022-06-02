package dao;

import dao.databaseConnection.ConnectionPool;
import dao.databaseConnection.DataBaseConfigReader;
import dao.impl.CustomerDAOImpl;

public class DAOFactory {

    private static final DataBaseConfigReader dataBaseConfigReader = new DataBaseConfigReader();
    private static final ConnectionPool connectionPool = new ConnectionPool(dataBaseConfigReader);

    private static final DAOFactory INSTANCE = new DAOFactory();
    private final CustomerDAO customerDAO;

    private DAOFactory(){
        this.customerDAO = new CustomerDAOImpl(connectionPool);
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public static DAOFactory getINSTANCE() {
        return INSTANCE;
    }
}
