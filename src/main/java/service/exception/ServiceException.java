package service.exception;

import dao.exception.DAOException;
import org.apache.log4j.Logger;

public class ServiceException extends Exception{

    private final static Logger LOGGER = Logger.getLogger(DAOException.class);

    public ServiceException() {
        super();
        LOGGER.error("ERROR_OCCUPIED");
    }

    public ServiceException(String message) {
        super(message);
        LOGGER.error(message);
    }

    public ServiceException(Exception e) {
        super(e);
        LOGGER.error(e);
    }

    public ServiceException(String message, Exception e) {
        super(message, e);
        LOGGER.error(message, e);
    }

}
