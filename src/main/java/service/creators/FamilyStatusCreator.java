package service.creators;

import org.jetbrains.annotations.NotNull;

public class FamilyStatusCreator {

    public String createFamilyStatus(@NotNull String customerPensionerStatus) {
        String pensionerStatus;
        if (customerPensionerStatus.equals("on")) {
            pensionerStatus = "Полная";
        } else {
            pensionerStatus = "Не полная";
        }
        return pensionerStatus;
    }
}
