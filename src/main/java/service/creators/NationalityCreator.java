package service.creators;

import org.jetbrains.annotations.NotNull;

public class NationalityCreator {

    public String createNationality(@NotNull String passportId){
        String nationality=null;
        if(passportId.charAt(11)=='P' | passportId.charAt(11)=='G' ){
            if(passportId.charAt(12)=='B'){
                nationality="Беларус";
            }
        }
        if (passportId.charAt(11)=='B'){
            if(passportId.charAt(12)=='A'){
                nationality="Без гражданства";
            }
        }
        if (passportId.charAt(11)=='B'){
            if(passportId.charAt(12)=='I'){
                nationality="Иностранец";
            }
        }

        return nationality;
    }
}
