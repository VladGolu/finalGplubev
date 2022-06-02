package controller;

import controller.command.Command;
import controller.command.CommandFactory;
import controller.consoles.FrontControllerConsole;
import controller.entity.InvalidCustomerInfo;
import controller.exception.ControllerException;
import controller.reader.DataReader;
import controller.validator.MailValidator;
import controller.validator.MainValidator;
import controller.validator.NameValidator;
import controller.validator.PasswordValidator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import service.validators.InfoValidator;
import service.entity.ValidCustomerInfo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

public class FrontController extends HttpServlet {

    InvalidCustomerInfo invalidCustomerInfo = InvalidCustomerInfo.getINSTANCE();
    NameValidator registrationValidator = new NameValidator();
    NameValidator nameValidator = new NameValidator();
    MailValidator mailValidator = new MailValidator();
    PasswordValidator passwordValidator = PasswordValidator.getINSTANCE();
    MainValidator mainValidator = MainValidator.getINSTANCE();
    private static final Logger LOGGER = Logger.getLogger(FrontController.class);
    InfoValidator infoValidator = new InfoValidator();
    FrontControllerConsole frontControllerConsole = new FrontControllerConsole();
    DataReader dataReader=new DataReader();


    @Override
    protected void doGet(@NotNull HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("doGet");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("doPost");
        InvalidCustomerInfo invalidCustomerInfo = dataReader.readData(req);
        System.out.println("readData----------" + invalidCustomerInfo.getNewCustomerName());

        ValidCustomerInfo validCustomerInfo = mainValidator.validateInfoLOGER(invalidCustomerInfo);
        if (Objects.nonNull(validCustomerInfo)) {
            infoValidator.validInfo(validCustomerInfo);

            Command command = CommandFactory.createCommand(req);
            try {
                String nextPage = command.execute(req, resp);
                req.getRequestDispatcher(nextPage).forward(req, resp);
            } catch (ControllerException e) {
                LOGGER.error("");
            }

        } else {
            getServletContext().getRequestDispatcher("/regmenu.jsp").forward(req, resp);
            LOGGER.error(req.getSession());

        }
    }
}
