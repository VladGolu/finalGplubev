package controller.validator;


import controller.entity.InvalidCustomerInfo;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {

    private static final Logger LOGGER = Logger.getLogger(NameValidator.class);
    private static final String nameRusRegXp = "[а-яА-Яё]+";       // to do добавить символы
    private static final String nameEngRegXp = "[a-zA-Z]+";       // to do добавить символы
    private static final NameValidator INSTANCE = new NameValidator();

    public static NameValidator getINSTANCE() {
        return INSTANCE;
    }

    public boolean mainValidationName(String name, String surname, String patronymic) {
        return validationCustomerName(name) & validationCustomerSurName(surname) & validationCustomerPatronymic(patronymic);
    }

    public boolean validationCustomerName(String name) {
        boolean flag = false;
        if (verificationName(name)) {
            LOGGER.info("Имя введено верно");
            flag = true;
        } else {
            LOGGER.info("Имя введено не верно");
        }
        return flag;
    }

    public boolean validationCustomerSurName(@NotNull String surname) {

        boolean flag = false;
        if ((verificationName(surname))) {
            LOGGER.info("Фамилия введена верно");
            flag = true;
        } else {
            LOGGER.info("Фамилия введена не верно");
        }
        return flag;
    }

    public boolean validationCustomerPatronymic(String patronymic){
        boolean flag = false;
        if ((verificationName(patronymic))) {
            LOGGER.info("Отчество введено верно");
            flag = true;
        } else {
            LOGGER.info("Отчество введено не верно");
        }
        return flag;
    }

    public boolean checkBigLetterInFirstSymbolOfName(@NotNull String name) {
        char[] charsOfName = name.toCharArray();
        if (Character.isUpperCase(name.charAt(0)))
            for (int symbolOfName = 1; symbolOfName < charsOfName.length; symbolOfName++) {
                if (Character.isLowerCase(name.charAt(symbolOfName))) {
                    LOGGER.info("Проверка на нижний регистр пройдена");
                    return true;
                } else {
                    LOGGER.info("Найдена большая буква внутри имени или фамилии");
                    return false;
                }
            }
        LOGGER.info("Первая буква не является большой");
        return false;
    }

    public boolean checkRusSymbolName(@NotNull String name) {
        Pattern p = Pattern.compile(nameEngRegXp);
        Matcher m = p.matcher(name);

        return !m.matches();
    }

    public boolean checkEngSymbolName(@NotNull String name) {
        Pattern p = Pattern.compile(nameRusRegXp);
        Matcher m = p.matcher(name);

        return !m.matches();
    }

    public boolean checkEngAndRusName(String name) {
        return checkEngSymbolName(name) | checkRusSymbolName(name);
    }

    public boolean verificationName(String name) {
        return checkEngAndRusName(name) & checkBigLetterInFirstSymbolOfName(name);
    }


}
