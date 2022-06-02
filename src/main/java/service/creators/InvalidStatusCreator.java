package service.creators;

import org.jetbrains.annotations.NotNull;

public class InvalidStatusCreator {

    public Boolean createHandicapped(@NotNull String customerHandicappedStatus) {
        return customerHandicappedStatus.equals("on");
    }
}
