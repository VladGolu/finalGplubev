package controller.command.impl;

import controller.command.Command;
import controller.exception.ControllerException;
import org.apache.log4j.Logger;
import service.CustomerService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCustomersCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(GetCustomersCommand.class);
    private static final ServiceFactory serviceFactory = ServiceFactory.getINSTANCE();
    private final CustomerService customerService = serviceFactory.getCustomerService();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ControllerException {
        try {
            LOGGER.info("GetCustomersCommand is in process");
            request.setAttribute("customers", customerService.getCustomerList());
            return "/CustomerDatabase.jsp";
        } catch (ServiceException e) {
            LOGGER.error(e.getMessage());
            throw new ControllerException(e);
        }
    }

}
