package service.creators;

import org.jetbrains.annotations.NotNull;

public class MilitaryStatusCreator {

    public Boolean createMilitaryStatus(@NotNull String customerMilitaryStatus) {
        return customerMilitaryStatus.equals("on");
    }
}
