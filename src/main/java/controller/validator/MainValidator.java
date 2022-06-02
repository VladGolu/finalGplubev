package controller.validator;

import controller.FrontController;
import controller.entity.InvalidCustomerInfo;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import service.entity.ValidCustomerInfo;

public class MainValidator {

    PasswordValidator passwordValidator = PasswordValidator.getINSTANCE();
    NameValidator nameValidator = NameValidator.getINSTANCE();
    PassportIdNumberValidator passportIdNumberValidator = PassportIdNumberValidator.getINSTANCE();
    MailValidator mailValidator = MailValidator.getINSTANCE();
    private static final Logger LOGGER = Logger.getLogger(MailValidator.class);

    private static final MainValidator INSTANCE = new MainValidator();

    public static MainValidator getINSTANCE() {
        return INSTANCE;
    }

    public boolean validateInfo(@NotNull InvalidCustomerInfo invalidCustomerInfo) {
        return nameValidator.mainValidationName(invalidCustomerInfo.getNewCustomerName(), invalidCustomerInfo.getNewCustomerSurName(), invalidCustomerInfo.getNewCustomerPatronymic())
                & mailValidator.validateEmail(invalidCustomerInfo.getNewCustomerEmail())
                & passwordValidator.validationPasswordAndRepeatPassword(invalidCustomerInfo.getNewCustomerPassword(), invalidCustomerInfo.getNewCustomerPasswordRepeat())
                & passportIdNumberValidator.mainPassportValidate(invalidCustomerInfo.getNewCustomerPassportId());
    }

    public ValidCustomerInfo validateInfoLOGER(@NotNull InvalidCustomerInfo invalidCustomerInfo) {
        ValidCustomerInfo validCustomerInfo = null;
        if (nameValidator.mainValidationName(invalidCustomerInfo.getNewCustomerName(), invalidCustomerInfo.getNewCustomerSurName(), invalidCustomerInfo.getNewCustomerPatronymic())) {
            LOGGER.info("Имя  фамилия отчество верны");
            if (mailValidator.validateEmail(invalidCustomerInfo.getNewCustomerEmail())) {
                LOGGER.info("Почта верна");
                if (passwordValidator.validationPasswordAndRepeatPassword(invalidCustomerInfo.getNewCustomerPassword(), invalidCustomerInfo.getNewCustomerPasswordRepeat())) {
                    LOGGER.info("Пароль верный");
                    if (passportIdNumberValidator.mainPassportValidateLOGER(invalidCustomerInfo.getNewCustomerPassportId())) {
                        LOGGER.info("Паспорт верный");
                        validCustomerInfo = new ValidCustomerInfo(invalidCustomerInfo.getNewCustomerName(),
                                invalidCustomerInfo.getNewCustomerSurName(), invalidCustomerInfo.getNewCustomerPatronymic(),
                                invalidCustomerInfo.getNewCustomerEmail(), invalidCustomerInfo.getNewCustomerPassportNumber(),
                                invalidCustomerInfo.getNewCustomerPassportSeries(), invalidCustomerInfo.getSubjectPassportIssue(),
                                invalidCustomerInfo.getNewCustomerPassportId(), invalidCustomerInfo.getNewCustomerBirthPlace(),
                                invalidCustomerInfo.getNewCustomerLiveCity(), invalidCustomerInfo.getNewCustomerPassword(),
                                invalidCustomerInfo.getNewCustomerPasswordRepeat(), invalidCustomerInfo.getNewCustomerHomeAddress(),
                                invalidCustomerInfo.getNewCustomerWorkAddress(), invalidCustomerInfo.getNewCustomerCity(),
                                invalidCustomerInfo.getNewCustomerLiveAddress(), invalidCustomerInfo.getNewCustomerHomeTelephone(),
                                invalidCustomerInfo.getNewCustomerMobileTelephone(), invalidCustomerInfo.getNewCustomerWorkPosition(),
                                invalidCustomerInfo.getNewCustomerResidenceCity(), invalidCustomerInfo.getNewCustomerResidentAddress(),
                                invalidCustomerInfo.getNewCustomerFamilyStatus(), invalidCustomerInfo.getNewCustomerEveryMonthProfit(),
                                invalidCustomerInfo.getMilitary(), invalidCustomerInfo.getNewCustomerInvalid(), invalidCustomerInfo.getNewCustomerPensioner());
                    }
                }
            }
        }
        return validCustomerInfo;
    }


}
