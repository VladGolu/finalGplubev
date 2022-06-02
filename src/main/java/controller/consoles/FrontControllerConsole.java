package controller.consoles;

import org.apache.log4j.Logger;

public class FrontControllerConsole {

    private static final Logger LOGGER = Logger.getLogger(FrontControllerConsole.class);

    public void printReaderData(String newCustomerEmail, String newCustomerName, String newCustomerSurName, String newCustomerPatronymic,
                                String newCustomerPassportNumber, String newCustomerPassportSeries, String newCustomerPassportIdNumber,
                                String newCustomerSubjectPassportIssue, String newCustomerPassword, String newCustomerPasswordRepeat,
                                String newCustomerBirthPlace, String newCustomerLiveCity, String newCustomerPensioner,
                                String newCustomerHomeAddress, String newCustomerWorkAddress, String newCustomerInvalid,
                                String newCustomerMilitary, String newCustomerCity, String newCustomerLiveAddress,
                                String newCustomerHomeTelephone, String newCustomerMobileTelephone,
                                String newCustomerWorkPosition, String newCustomerResidenceCity,
                                String newCustomerResidentAddress, String newCustomerFamilyStatus,
                                String newCustomerEveryMonthProfit) {

        LOGGER.info("Чтение входящих данных началось");

        LOGGER.info("email: " + newCustomerEmail);
        LOGGER.info("Имя пользователя " + newCustomerName);
        LOGGER.info("Фамилия пользователя " + newCustomerSurName);
        LOGGER.info("Отчество" + newCustomerPatronymic);
        LOGGER.info("Номер паспорта " + newCustomerPassportNumber);
        LOGGER.info("Серия паспорта" + newCustomerPassportSeries);
        LOGGER.info("Идентификационный номер" + newCustomerPassportIdNumber);
        LOGGER.info("Кем выдан" + newCustomerSubjectPassportIssue);
        LOGGER.info("Пароль пользователя " + newCustomerPassword);
        LOGGER.info("Повтор пароля " + newCustomerPasswordRepeat);
        LOGGER.info("Место рождения" + newCustomerBirthPlace);
        LOGGER.info("Город проживания" + newCustomerLiveCity);
        LOGGER.info("Домашний адрес" + newCustomerHomeAddress);
        LOGGER.info("Рабочий адрес" + newCustomerWorkAddress);
        LOGGER.info("Пенсионер" + newCustomerPensioner);
        LOGGER.info("Инвалидность" + newCustomerInvalid);
        LOGGER.info("Армия" + newCustomerMilitary);
        LOGGER.info("Город" + newCustomerCity);
        LOGGER.info("Адрес проживания" + newCustomerLiveAddress);
        LOGGER.info("Домашний телефон" + newCustomerHomeTelephone);
        LOGGER.info("Мобильный телефон" + newCustomerMobileTelephone);
        LOGGER.info("Должность" + newCustomerWorkPosition);
        LOGGER.info("Город прописки" + newCustomerResidenceCity);
        LOGGER.info("Адрес прописки" + newCustomerResidentAddress);
        LOGGER.info("Состав семьи" + newCustomerFamilyStatus);
        LOGGER.info("Ежемесячный доход" + newCustomerEveryMonthProfit);

        LOGGER.info("Чтение входящих данных закончилось");
    }
}
