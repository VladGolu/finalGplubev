package service.creators;

import org.jetbrains.annotations.NotNull;

public class BirthDateCreator {

    public String createBirthDate(@NotNull String passportNumber) {
        //char[] date = passportNumber.toCharArray();
        StringBuilder birthDate = new StringBuilder(passportNumber.substring(1, 7));
        return birthDate.insert(2, '.').insert(5, '.').toString();
        //return (date[1]-'0' + date[2]-'0') + "." + (date[3]-'0' + date[4]-'0') + "." + (date[5]-'0' + date[6]-'0');
    }
}
