package service;

import dao.entity.Customer;
import service.exception.ServiceException;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomerList() throws ServiceException;
    Customer getCustomer(String customerPassportId) throws  ServiceException;

}
