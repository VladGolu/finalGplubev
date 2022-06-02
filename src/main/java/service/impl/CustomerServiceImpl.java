package service.impl;

import dao.CustomerDAO;
import dao.DAOFactory;
import dao.entity.Customer;
import dao.exception.DAOException;
import service.CustomerService;
import service.exception.ServiceException;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private static final DAOFactory daoFactory = DAOFactory.getINSTANCE();
    private static final CustomerDAO customerDAO = daoFactory.getCustomerDAO();

    @Override
    public List<Customer> getCustomerList() throws ServiceException {
        try {
            return customerDAO.getCustomerList();
        } catch (DAOException e){
            throw new ServiceException(e);
        }
    }
    @Override
    public Customer getCustomer(String customerPassportId) throws  ServiceException{
        try{
            return customerDAO.getCustomer(customerPassportId);
        }catch (DAOException e){
            throw new ServiceException(e);
        }
    }
}
