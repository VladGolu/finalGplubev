package controller.command.impl;

import controller.command.Command;
import controller.entity.InvalidCustomerInfo;
import controller.exception.ControllerException;
import dao.entity.Customer;
import org.apache.log4j.Logger;
import service.CustomerService;
import service.entity.ValidCustomerInfo;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(GetCustomersCommand.class);
    private static final ServiceFactory serviceFactory = ServiceFactory.getINSTANCE();
    private final CustomerService customerService = serviceFactory.getCustomerService();
    ValidCustomerInfo validCustomerInfo;

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ControllerException {
        try {
            LOGGER.info("GetCustomersCommand is in process");

            if(validCustomerInfo.getValidCustomerPassportId().equals("5070202M000PB0")) {
                request.setAttribute("customers", customerService.getCustomerList());
                return "/AdminDatabase.jsp";
            }else{
                request.setAttribute("customer", customerService.getCustomer(request.getParameter("customerPassportIdNumber")));
                return "/CustomerDatabase.jsp";
            }
        } catch (ServiceException e) {
            LOGGER.error(e.getMessage());
            throw new ControllerException(e);
        }
    }
}
