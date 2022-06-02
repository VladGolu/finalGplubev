package controller.validator;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassportIdNumberValidator {

    private static final int passportNumberSize = 14;
    private static final int february = 2;
    private static final PassportIdNumberValidator INSTANCE = new PassportIdNumberValidator();
    private static final Logger LOGGER = Logger.getLogger(PassportIdNumberValidator.class);

    private PassportIdNumberValidator(){}

    public static PassportIdNumberValidator getINSTANCE() {
        return INSTANCE;
    }

    public boolean mainPassportValidate(String passportIdNumber){

        return checkSizePassportNumber(passportIdNumber) & validateFirstSymbolPassportNumber(passportIdNumber) & validateSecondAndThirdSymbolPassportNumber(passportIdNumber)
                & validateFourthAndFifthSymbolPassportNumber(passportIdNumber) & validateSixthAndSeventhSymbolPassportNumber(passportIdNumber)
                & validateEightSymbolPassportNumber(passportIdNumber) & validateNinthAndTenthAndEleventhSymbolPassportNumber(passportIdNumber)
                & validateTwelfthAndThirteenthSymbolPassportNumber(passportIdNumber) & validateFourteenthSymbolPassportNumber(passportIdNumber);
    }

    public boolean  mainPassportValidateLOGER(String passportNumber){LOGGER.info(passportNumber.charAt(0));
        if(checkSizePassportNumber(passportNumber)){
            LOGGER.info("размер верный");
            if (validateFirstSymbolPassportNumber(passportNumber)){
                LOGGER.info("первый символ верный");
                if (validateSecondAndThirdSymbolPassportNumber(passportNumber)){
                    LOGGER.info("2 и 3");
                    if (validateFourthAndFifthSymbolPassportNumber(passportNumber)){
                        LOGGER.info("4 и 5");
                        if (validateSixthAndSeventhSymbolPassportNumber(passportNumber)){
                            LOGGER.info("6 и 7");
                            if (validateEightSymbolPassportNumber(passportNumber)){
                                LOGGER.info("8");
                                if (validateNinthAndTenthAndEleventhSymbolPassportNumber(passportNumber)){
                                    LOGGER.info("9 и 10 и 11");
                                    if (validateTwelfthAndThirteenthSymbolPassportNumber(passportNumber)){
                                        LOGGER.info("12 и 13");
                                        if (validateFourteenthSymbolPassportNumber(passportNumber)){
                                            LOGGER.info("14");
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
     return false;
    }

    public boolean checkSizePassportNumber(@NotNull String passportNumber) {
        return passportNumber.length() == passportNumberSize;
    }

    public boolean validateFirstSymbolPassportNumber(@NotNull String passportNumber) {
        int i = Integer.parseInt(String.valueOf(passportNumber.charAt(0)));
        return i > 0 & i < 7;
    }

    public boolean validateSecondAndThirdSymbolPassportNumber(@NotNull String passportNumber) {    //день рождения
        int secondSymbol = Integer.parseInt(String.valueOf(passportNumber.charAt(1)));
        int thirdSymbol = Integer.parseInt(String.valueOf(passportNumber.charAt(2)));

        if(Integer.parseInt(String.valueOf(passportNumber.charAt(4)))==february){                 //февраль
            LOGGER.info("1");
            if (secondSymbol <3){
                LOGGER.info("2");

                if(secondSymbol ==0 | secondSymbol ==1){
                    LOGGER.info("3");
                    if(thirdSymbol <10){
                        return true;
                    }
                }
                if (secondSymbol ==2){
                    LOGGER.info("4");
                    if(thirdSymbol <9){
                        return true;
                    }
                }
            }
        }
        if (secondSymbol < 4) {
            LOGGER.info("5");
            if (secondSymbol == 0 | secondSymbol == 2) {
                LOGGER.info("6");
                if (thirdSymbol < 10) {
                    return true;
                }
            }
            if (secondSymbol == 3) {
                LOGGER.info("7");
              if (thirdSymbol < 2) {
                return true;
              }
            }
        }
        return false;
    }

    public boolean validateFourthAndFifthSymbolPassportNumber(@NotNull String passportNumber) {
        int fourthSymbol = Integer.parseInt(String.valueOf(passportNumber.charAt(3)));
        if (fourthSymbol == 0) {
            if (Integer.parseInt(String.valueOf(passportNumber.charAt(4))) < 10) {
                return true;
            }
        }
        if (fourthSymbol == 1) {
            return passportNumber.charAt(4) < 3;
        }
        return false;
    }

    public boolean validateSixthAndSeventhSymbolPassportNumber(@NotNull String passportNumber) {
        if (Integer.parseInt(String.valueOf(passportNumber.charAt(5))) < 10) {
            return Integer.parseInt(String.valueOf(passportNumber.charAt(6))) < 10;
        }
        return false;
    }

    public boolean validateEightSymbolPassportNumber(@NotNull String passportNumber) {
        return passportNumber.charAt(7)=='A' | passportNumber.charAt(7)=='B' | passportNumber.charAt(7)=='C' | passportNumber.charAt(7)=='K'
                | passportNumber.charAt(7)=='E' | passportNumber.charAt(7)=='M' | passportNumber.charAt(7)=='H';
    }

    public boolean validateNinthAndTenthAndEleventhSymbolPassportNumber(@NotNull String passportNumber) {
        if(Integer.parseInt(String.valueOf(passportNumber.charAt(8)))<10){
            if(Integer.parseInt(String.valueOf(passportNumber.charAt(9)))<10){
                return Integer.parseInt(String.valueOf(passportNumber.charAt(10))) < 10;
            }
        }
        return false;
    }

    public boolean validateTwelfthAndThirteenthSymbolPassportNumber(@NotNull String passportNumber){
        int twelfthSymbol = passportNumber.charAt(11);
        int ThirteenthSymbol = passportNumber.charAt(12);
        if(ThirteenthSymbol =='B'){

            if (twelfthSymbol =='G' | twelfthSymbol =='P'){
                return true;
            }
        }
        if(twelfthSymbol=='B'){
            if (ThirteenthSymbol =='I' || ThirteenthSymbol =='A'){
                return true;
            }
        }
        return false;
    }

    public boolean validateFourteenthSymbolPassportNumber(@NotNull String passportNumber) {
        return Integer.parseInt(String.valueOf(passportNumber.charAt(13))) < 10;
    }

}

