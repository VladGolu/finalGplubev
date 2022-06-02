package service.creators;

import org.jetbrains.annotations.NotNull;
import service.entity.ValidCustomerInfo;

public class GenderCreator {
    ValidCustomerInfo validCustomerInfo = new ValidCustomerInfo();

    public String createGender(@NotNull String passportNumber) {
        String gender = null;
        System.out.println("из пола" + passportNumber);
        int firstSymbol = Integer.parseInt(String.valueOf(passportNumber.charAt(0)));
        if (firstSymbol == 1 || firstSymbol == 3
                || firstSymbol == 5) {
            gender = "Мужчина";

        }
        if (firstSymbol == 2 || firstSymbol == 4 || firstSymbol == 6) {
            validCustomerInfo.setCustomerGender("Женский");
            gender = "Женщина";
        }
        return gender;
    }
}
