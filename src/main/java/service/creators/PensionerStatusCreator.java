package service.creators;

import org.jetbrains.annotations.NotNull;

public class PensionerStatusCreator {

    public Boolean createPensionerStatus(@NotNull String customerPensionerStatus) {
        return customerPensionerStatus.equals("on");
    }
}
