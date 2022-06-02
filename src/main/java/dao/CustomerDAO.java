package dao;

import dao.entity.Customer;
import dao.exception.DAOException;

import java.util.List;

public interface CustomerDAO {

    void insertCustomer(Customer customer) throws DAOException;

    List<Customer> getCustomerList() throws DAOException;

     Customer getCustomer(String customerPassportId)throws DAOException;

}
