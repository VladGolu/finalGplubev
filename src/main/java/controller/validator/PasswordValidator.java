package controller.validator;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class PasswordValidator {
    private static final Logger LOGGER = Logger.getLogger(PasswordValidator.class);
    private static final int minPasswordSize = 8;
    private static final int maxPasswordSize = 50;
    private static final int passwordConst = 1;
    private static final PasswordValidator INSTANCE = new PasswordValidator();

    public static PasswordValidator getINSTANCE() {
        return INSTANCE;
    }

    public boolean validationPasswordAndRepeatPassword(String password, String repeatPassword) {
        return validationRegister(password)
                & validationSizePassword(password)
                & validationRepeatPassword(password, repeatPassword)
                & validationCountRegPassword(password);
    }

    public boolean validationMinSizePassword(@NotNull String password) {     // минимальный размер check
        return password.length() > minPasswordSize - passwordConst;
    }

    public boolean validationMaxSizePassword(@NotNull String password) {     // максимальный размер check
        return password.length() < maxPasswordSize + passwordConst;
    }



    public boolean validationUpRegisterPassword(@NotNull String password) {         // хотя-бы один символ в верхнем регистре check
        char[] charPassword = password.toCharArray();
        for (char c : charPassword) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validationLowRegisterPassword(@NotNull String password) {         // хотя-бы один символ в нижнем регистре check
        char[] charPassword = password.toCharArray();
        for (char c : charPassword) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validationCountRegPassword(@NotNull String password) {         // хотя-бы один символ число check
        char[] charPassword = password.toCharArray();
        for (char c : charPassword) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validationRegister(String password) {
        return validationUpRegisterPassword(password) & validationLowRegisterPassword(password);
    }

    public boolean validationRepeatPassword(@NotNull String password, String repeatPassword) {
        return password.equals(repeatPassword);
    }

    public boolean validationSizePassword(String password) {                    //  размер check
        return validationMaxSizePassword(password) & validationMinSizePassword(password);
    }
}

