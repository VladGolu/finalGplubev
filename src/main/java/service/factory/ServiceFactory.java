package service.factory;

import service.CustomerService;
import service.impl.CustomerServiceImpl;

public class ServiceFactory {

    private static final ServiceFactory INSTANCE = new ServiceFactory();
    private final CustomerService customerService;

    public ServiceFactory() {
        this.customerService = new CustomerServiceImpl();
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public static ServiceFactory getINSTANCE() {
        return INSTANCE;
    }
}
