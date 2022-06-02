package controller.validator;

import controller.entity.InvalidCustomerInfo;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {
    private static final MailValidator INSTANCE = new MailValidator();
    private static final Logger LOGGER = Logger.getLogger(MailValidator.class);

    public boolean validateEmail(final String email) {
        Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static MailValidator getINSTANCE() {
        return INSTANCE;
    }
}
