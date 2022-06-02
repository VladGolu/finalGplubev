package service.entity;

import java.util.Date;

public class ValidCustomerInfo {

    String validCustomerName;                 //имя
    String validCustomerSurName;              //фамилия
    String validCustomerPatronymic;           //отчество
    String customerGender;                  //пол
    String validCustomerEmail;                //E-mail
    String validCustomerPassportNumber;       //номер паспорта
    String validCustomerPassportSeries;       //серия паспорта
    String BirthDate;                       // дата рождения
    Date validBirthDate;
    String validSubjectPassportIssue;            //кем выдан
    String validCustomerPassportId;           //Индентификационный номер
    String validCustomerBirthPlace;           //Место рождения
    String validCustomerLiveCity;             //Город проживания
    String validCustomerPassword;             //пароль
    String validCustomerPasswordRepeat;       //повторный пароль
    String validCustomerHomeAddress;          //домашний адрес
    String validCustomerWorkAddress;          //адрес работы
    String validCustomerCity;                 //Город
    String validCustomerLiveAddress;          //Адрес проживания
    String validCustomerHomeTelephone;        //Домашний телефон
    String validCustomerMobileTelephone;      //Мобильный телефон
    String validCustomerWorkPosition;         //Должность на работе
    String validCustomerResidenceCity;        //Город прописки
    String validCustomerResidentAddress;      //Адрес прописки
    String validCustomerFamilyStatus;         //Состав семьи
    String newCustomerEveryMonthProfit;     //ежемесячный доход
    String military;                        //Военнообязанный
    String validCustomerInvalid;              //Наличие инвалидности
    String validCustomerPensioner;            //Пенсионер или нет
    String customerNationality;              //Гражданство
    Boolean militaryBool;                        //Военнообязанный
    Boolean newCustomerInvalidBool;              //Наличие инвалидности
    Boolean NewCustomerPensionerBool;

    public ValidCustomerInfo() {
    }

    public ValidCustomerInfo(String newCustomerName, String newCustomerSurName, String newCustomerPatronymic, String newCustomerEmail,
                             String newCustomerPassportNumber, String newCustomerPassportSeries, String subjectPassportIssue, String newCustomerPassportId,
                             String newCustomerBirthPlace, String newCustomerLiveCity, String newCustomerPassword, String newCustomerPasswordRepeat,
                             String newCustomerHomeAddress, String newCustomerWorkAddress, String newCustomerCity, String newCustomerLiveAddress,
                             String newCustomerHomeTelephone, String newCustomerMobileTelephone, String newCustomerWorkPosition, String newCustomerResidenceCity,
                             String newCustomerResidentAddress, String newCustomerFamilyStatus, String newCustomerEveryMonthProfit, String military,
                             String newCustomerInvalid, String newCustomerPensioner) {

        this.validCustomerName = newCustomerName;
        this.validCustomerSurName = newCustomerSurName;
        this.validCustomerPatronymic = newCustomerPatronymic;
        this.validCustomerEmail = newCustomerEmail;
        this.validCustomerPassportNumber = newCustomerPassportNumber;
        this.validCustomerPassportSeries = newCustomerPassportSeries;
        this.validSubjectPassportIssue = subjectPassportIssue;
        this.validCustomerPassportId = newCustomerPassportId;
        this.validCustomerBirthPlace = newCustomerBirthPlace;
        this.validCustomerLiveCity = newCustomerLiveCity;
        this.validCustomerPassword = newCustomerPassword;
        this.validCustomerPasswordRepeat = newCustomerPasswordRepeat;
        this.validCustomerHomeAddress = newCustomerHomeAddress;
        this.validCustomerWorkAddress = newCustomerWorkAddress;
        this.validCustomerCity = newCustomerCity;
        this.validCustomerLiveAddress = newCustomerLiveAddress;
        this.validCustomerHomeTelephone = newCustomerHomeTelephone;
        this.validCustomerMobileTelephone = newCustomerMobileTelephone;
        this.validCustomerWorkPosition = newCustomerWorkPosition;
        this.validCustomerResidenceCity = newCustomerResidenceCity;
        this.validCustomerResidentAddress = newCustomerResidentAddress;
        this.validCustomerFamilyStatus = newCustomerFamilyStatus;
        this.newCustomerEveryMonthProfit = newCustomerEveryMonthProfit;
        this.military = military;
        this.validCustomerInvalid = newCustomerInvalid;
        this.validCustomerPensioner = newCustomerPensioner;
    }

    public String getValidCustomerName() {
        return validCustomerName;
    }

    public void setValidCustomerName(String validCustomerName) {
        this.validCustomerName = validCustomerName;
    }

    public String getValidCustomerSurName() {
        return validCustomerSurName;
    }

    public void setValidCustomerSurName(String validCustomerSurName) {
        this.validCustomerSurName = validCustomerSurName;
    }

    public String getValidCustomerPatronymic() {
        return validCustomerPatronymic;
    }

    public void setValidCustomerPatronymic(String validCustomerPatronymic) {
        this.validCustomerPatronymic = validCustomerPatronymic;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getValidCustomerEmail() {
        return validCustomerEmail;
    }

    public void setValidCustomerEmail(String validCustomerEmail) {
        this.validCustomerEmail = validCustomerEmail;
    }
    public void setValidDate(Date date) {
        this.validBirthDate= date;
    }

    public String getValidCustomerPassportNumber() {
        return validCustomerPassportNumber;
    }

    public void setValidCustomerPassportNumber(String validCustomerPassportNumber) {
        this.validCustomerPassportNumber = validCustomerPassportNumber;
    }

    public String getValidCustomerPassportSeries() {
        return validCustomerPassportSeries;
    }

    public void setValidCustomerPassportSeries(String validCustomerPassportSeries) {
        this.validCustomerPassportSeries = validCustomerPassportSeries;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getValidSubjectPassportIssue() {
        return validSubjectPassportIssue;
    }

    public void setValidSubjectPassportIssue(String validSubjectPassportIssue) {
        this.validSubjectPassportIssue = validSubjectPassportIssue;
    }

    public String getValidCustomerPassportId() {
        return validCustomerPassportId;
    }

    public void setValidCustomerPassportId(String validCustomerPassportId) {
        this.validCustomerPassportId = validCustomerPassportId;
    }

    public String getValidCustomerBirthPlace() {
        return validCustomerBirthPlace;
    }

    public void setValidCustomerBirthPlace(String validCustomerBirthPlace) {
        this.validCustomerBirthPlace = validCustomerBirthPlace;
    }

    public String getValidCustomerLiveCity() {
        return validCustomerLiveCity;
    }

    public void setValidCustomerLiveCity(String validCustomerLiveCity) {
        this.validCustomerLiveCity = validCustomerLiveCity;
    }

    public String getValidCustomerPassword() {
        return validCustomerPassword;
    }

    public void setValidCustomerPassword(String validCustomerPassword) {
        this.validCustomerPassword = validCustomerPassword;
    }

    public String getValidCustomerPasswordRepeat() {
        return validCustomerPasswordRepeat;
    }

    public void setValidCustomerPasswordRepeat(String validCustomerPasswordRepeat) {
        this.validCustomerPasswordRepeat = validCustomerPasswordRepeat;
    }

    public String getValidCustomerHomeAddress() {
        return validCustomerHomeAddress;
    }

    public void setValidCustomerHomeAddress(String validCustomerHomeAddress) {
        this.validCustomerHomeAddress = validCustomerHomeAddress;
    }

    public String getValidCustomerWorkAddress() {
        return validCustomerWorkAddress;
    }

    public void setValidCustomerWorkAddress(String validCustomerWorkAddress) {
        this.validCustomerWorkAddress = validCustomerWorkAddress;
    }

    public String getValidCustomerCity() {
        return validCustomerCity;
    }

    public void setValidCustomerCity(String validCustomerCity) {
        this.validCustomerCity = validCustomerCity;
    }

    public String getValidCustomerLiveAddress() {
        return validCustomerLiveAddress;
    }

    public void setValidCustomerLiveAddress(String validCustomerLiveAddress) {
        this.validCustomerLiveAddress = validCustomerLiveAddress;
    }

    public String getValidCustomerHomeTelephone() {
        return validCustomerHomeTelephone;
    }

    public void setValidCustomerHomeTelephone(String validCustomerHomeTelephone) {
        this.validCustomerHomeTelephone = validCustomerHomeTelephone;
    }

    public String getValidCustomerMobileTelephone() {
        return validCustomerMobileTelephone;
    }

    public void setValidCustomerMobileTelephone(String validCustomerMobileTelephone) {
        this.validCustomerMobileTelephone = validCustomerMobileTelephone;
    }

    public String getValidCustomerWorkPosition() {
        return validCustomerWorkPosition;
    }

    public void setValidCustomerWorkPosition(String validCustomerWorkPosition) {
        this.validCustomerWorkPosition = validCustomerWorkPosition;
    }

    public String getValidCustomerResidenceCity() {
        return validCustomerResidenceCity;
    }

    public void setValidCustomerResidenceCity(String validCustomerResidenceCity) {
        this.validCustomerResidenceCity = validCustomerResidenceCity;
    }

    public String getValidCustomerResidentAddress() {
        return validCustomerResidentAddress;
    }

    public void setValidCustomerResidentAddress(String validCustomerResidentAddress) {
        this.validCustomerResidentAddress = validCustomerResidentAddress;
    }

    public String getValidCustomerFamilyStatus() {
        return validCustomerFamilyStatus;
    }

    public void setValidCustomerFamilyStatus(String validCustomerFamilyStatus) {
        this.validCustomerFamilyStatus = validCustomerFamilyStatus;
    }

    public String getNewCustomerEveryMonthProfit() {
        return newCustomerEveryMonthProfit;
    }

    public void setNewCustomerEveryMonthProfit(String newCustomerEveryMonthProfit) {
        this.newCustomerEveryMonthProfit = newCustomerEveryMonthProfit;
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getValidCustomerInvalid() {
        return validCustomerInvalid;
    }

    public void setValidCustomerInvalid(String validCustomerInvalid) {
        this.validCustomerInvalid = validCustomerInvalid;
    }

    public String getValidCustomerPensioner() {
        return validCustomerPensioner;
    }

    public void setValidCustomerPensioner(String validCustomerPensioner) {
        this.validCustomerPensioner = validCustomerPensioner;
    }

    public String getCustomerNationality() {
        return customerNationality;
    }

    public void setCustomerNationality(String customerNationality) {
        this.customerNationality = customerNationality;
    }

    public Boolean getMilitaryBool() {
        return militaryBool;
    }

    public void setMilitaryBool(Boolean militaryBool) {
        this.militaryBool = militaryBool;
    }

    public Boolean getNewCustomerInvalidBool() {
        return newCustomerInvalidBool;
    }

    public void setNewCustomerInvalidBool(Boolean newCustomerInvalidBool) {
        this.newCustomerInvalidBool = newCustomerInvalidBool;
    }

    public Boolean getNewCustomerPensionerBool() {
        return NewCustomerPensionerBool;
    }

    public void setNewCustomerPensionerBool(Boolean newCustomerPensionerBool) {
        NewCustomerPensionerBool = newCustomerPensionerBool;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidCustomerInfo that = (ValidCustomerInfo) o;

        if (validCustomerName != null ? !validCustomerName.equals(that.validCustomerName) : that.validCustomerName != null)
            return false;
        if (validCustomerSurName != null ? !validCustomerSurName.equals(that.validCustomerSurName) : that.validCustomerSurName != null)
            return false;
        if (validCustomerPatronymic != null ? !validCustomerPatronymic.equals(that.validCustomerPatronymic) : that.validCustomerPatronymic != null)
            return false;
        if (customerGender != null ? !customerGender.equals(that.customerGender) : that.customerGender != null)
            return false;
        if (validCustomerEmail != null ? !validCustomerEmail.equals(that.validCustomerEmail) : that.validCustomerEmail != null)
            return false;
        if (validCustomerPassportNumber != null ? !validCustomerPassportNumber.equals(that.validCustomerPassportNumber) : that.validCustomerPassportNumber != null)
            return false;
        if (validCustomerPassportSeries != null ? !validCustomerPassportSeries.equals(that.validCustomerPassportSeries) : that.validCustomerPassportSeries != null)
            return false;
        if (BirthDate != null ? !BirthDate.equals(that.BirthDate) : that.BirthDate != null) return false;
        if (validSubjectPassportIssue != null ? !validSubjectPassportIssue.equals(that.validSubjectPassportIssue) : that.validSubjectPassportIssue != null)
            return false;
        if (validCustomerPassportId != null ? !validCustomerPassportId.equals(that.validCustomerPassportId) : that.validCustomerPassportId != null)
            return false;
        if (validCustomerBirthPlace != null ? !validCustomerBirthPlace.equals(that.validCustomerBirthPlace) : that.validCustomerBirthPlace != null)
            return false;
        if (validCustomerLiveCity != null ? !validCustomerLiveCity.equals(that.validCustomerLiveCity) : that.validCustomerLiveCity != null)
            return false;
        if (validCustomerPassword != null ? !validCustomerPassword.equals(that.validCustomerPassword) : that.validCustomerPassword != null)
            return false;
        if (validCustomerPasswordRepeat != null ? !validCustomerPasswordRepeat.equals(that.validCustomerPasswordRepeat) : that.validCustomerPasswordRepeat != null)
            return false;
        if (validCustomerHomeAddress != null ? !validCustomerHomeAddress.equals(that.validCustomerHomeAddress) : that.validCustomerHomeAddress != null)
            return false;
        if (validCustomerWorkAddress != null ? !validCustomerWorkAddress.equals(that.validCustomerWorkAddress) : that.validCustomerWorkAddress != null)
            return false;
        if (validCustomerCity != null ? !validCustomerCity.equals(that.validCustomerCity) : that.validCustomerCity != null)
            return false;
        if (validCustomerLiveAddress != null ? !validCustomerLiveAddress.equals(that.validCustomerLiveAddress) : that.validCustomerLiveAddress != null)
            return false;
        if (validCustomerHomeTelephone != null ? !validCustomerHomeTelephone.equals(that.validCustomerHomeTelephone) : that.validCustomerHomeTelephone != null)
            return false;
        if (validCustomerMobileTelephone != null ? !validCustomerMobileTelephone.equals(that.validCustomerMobileTelephone) : that.validCustomerMobileTelephone != null)
            return false;
        if (validCustomerWorkPosition != null ? !validCustomerWorkPosition.equals(that.validCustomerWorkPosition) : that.validCustomerWorkPosition != null)
            return false;
        if (validCustomerResidenceCity != null ? !validCustomerResidenceCity.equals(that.validCustomerResidenceCity) : that.validCustomerResidenceCity != null)
            return false;
        if (validCustomerResidentAddress != null ? !validCustomerResidentAddress.equals(that.validCustomerResidentAddress) : that.validCustomerResidentAddress != null)
            return false;
        if (validCustomerFamilyStatus != null ? !validCustomerFamilyStatus.equals(that.validCustomerFamilyStatus) : that.validCustomerFamilyStatus != null)
            return false;
        if (newCustomerEveryMonthProfit != null ? !newCustomerEveryMonthProfit.equals(that.newCustomerEveryMonthProfit) : that.newCustomerEveryMonthProfit != null)
            return false;
        if (military != null ? !military.equals(that.military) : that.military != null) return false;
        if (validCustomerInvalid != null ? !validCustomerInvalid.equals(that.validCustomerInvalid) : that.validCustomerInvalid != null)
            return false;
        if (validCustomerPensioner != null ? !validCustomerPensioner.equals(that.validCustomerPensioner) : that.validCustomerPensioner != null)
            return false;
        if (customerNationality != null ? !customerNationality.equals(that.customerNationality) : that.customerNationality != null)
            return false;
        if (militaryBool != null ? !militaryBool.equals(that.militaryBool) : that.militaryBool != null) return false;
        if (newCustomerInvalidBool != null ? !newCustomerInvalidBool.equals(that.newCustomerInvalidBool) : that.newCustomerInvalidBool != null)
            return false;
        return NewCustomerPensionerBool != null ? NewCustomerPensionerBool.equals(that.NewCustomerPensionerBool) : that.NewCustomerPensionerBool == null;
    }

    @Override
    public int hashCode() {
        int result = validCustomerName != null ? validCustomerName.hashCode() : 0;
        result = 31 * result + (validCustomerSurName != null ? validCustomerSurName.hashCode() : 0);
        result = 31 * result + (validCustomerPatronymic != null ? validCustomerPatronymic.hashCode() : 0);
        result = 31 * result + (customerGender != null ? customerGender.hashCode() : 0);
        result = 31 * result + (validCustomerEmail != null ? validCustomerEmail.hashCode() : 0);
        result = 31 * result + (validCustomerPassportNumber != null ? validCustomerPassportNumber.hashCode() : 0);
        result = 31 * result + (validCustomerPassportSeries != null ? validCustomerPassportSeries.hashCode() : 0);
        result = 31 * result + (BirthDate != null ? BirthDate.hashCode() : 0);
        result = 31 * result + (validSubjectPassportIssue != null ? validSubjectPassportIssue.hashCode() : 0);
        result = 31 * result + (validCustomerPassportId != null ? validCustomerPassportId.hashCode() : 0);
        result = 31 * result + (validCustomerBirthPlace != null ? validCustomerBirthPlace.hashCode() : 0);
        result = 31 * result + (validCustomerLiveCity != null ? validCustomerLiveCity.hashCode() : 0);
        result = 31 * result + (validCustomerPassword != null ? validCustomerPassword.hashCode() : 0);
        result = 31 * result + (validCustomerPasswordRepeat != null ? validCustomerPasswordRepeat.hashCode() : 0);
        result = 31 * result + (validCustomerHomeAddress != null ? validCustomerHomeAddress.hashCode() : 0);
        result = 31 * result + (validCustomerWorkAddress != null ? validCustomerWorkAddress.hashCode() : 0);
        result = 31 * result + (validCustomerCity != null ? validCustomerCity.hashCode() : 0);
        result = 31 * result + (validCustomerLiveAddress != null ? validCustomerLiveAddress.hashCode() : 0);
        result = 31 * result + (validCustomerHomeTelephone != null ? validCustomerHomeTelephone.hashCode() : 0);
        result = 31 * result + (validCustomerMobileTelephone != null ? validCustomerMobileTelephone.hashCode() : 0);
        result = 31 * result + (validCustomerWorkPosition != null ? validCustomerWorkPosition.hashCode() : 0);
        result = 31 * result + (validCustomerResidenceCity != null ? validCustomerResidenceCity.hashCode() : 0);
        result = 31 * result + (validCustomerResidentAddress != null ? validCustomerResidentAddress.hashCode() : 0);
        result = 31 * result + (validCustomerFamilyStatus != null ? validCustomerFamilyStatus.hashCode() : 0);
        result = 31 * result + (newCustomerEveryMonthProfit != null ? newCustomerEveryMonthProfit.hashCode() : 0);
        result = 31 * result + (military != null ? military.hashCode() : 0);
        result = 31 * result + (validCustomerInvalid != null ? validCustomerInvalid.hashCode() : 0);
        result = 31 * result + (validCustomerPensioner != null ? validCustomerPensioner.hashCode() : 0);
        result = 31 * result + (customerNationality != null ? customerNationality.hashCode() : 0);
        result = 31 * result + (militaryBool != null ? militaryBool.hashCode() : 0);
        result = 31 * result + (newCustomerInvalidBool != null ? newCustomerInvalidBool.hashCode() : 0);
        result = 31 * result + (NewCustomerPensionerBool != null ? NewCustomerPensionerBool.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ValidCustomerInfo{" +
                "validCustomerName='" + validCustomerName + '\'' +
                ", validCustomerSurName='" + validCustomerSurName + '\'' +
                ", validCustomerPatronymic='" + validCustomerPatronymic + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", validCustomerEmail='" + validCustomerEmail + '\'' +
                ", validCustomerPassportNumber='" + validCustomerPassportNumber + '\'' +
                ", validCustomerPassportSeries='" + validCustomerPassportSeries + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", validSubjectPassportIssue='" + validSubjectPassportIssue + '\'' +
                ", validCustomerPassportId='" + validCustomerPassportId + '\'' +
                ", validCustomerBirthPlace='" + validCustomerBirthPlace + '\'' +
                ", validCustomerLiveCity='" + validCustomerLiveCity + '\'' +
                ", validCustomerPassword='" + validCustomerPassword + '\'' +
                ", validCustomerPasswordRepeat='" + validCustomerPasswordRepeat + '\'' +
                ", validCustomerHomeAddress='" + validCustomerHomeAddress + '\'' +
                ", validCustomerWorkAddress='" + validCustomerWorkAddress + '\'' +
                ", validCustomerCity='" + validCustomerCity + '\'' +
                ", validCustomerLiveAddress='" + validCustomerLiveAddress + '\'' +
                ", validCustomerHomeTelephone='" + validCustomerHomeTelephone + '\'' +
                ", validCustomerMobileTelephone='" + validCustomerMobileTelephone + '\'' +
                ", validCustomerWorkPosition='" + validCustomerWorkPosition + '\'' +
                ", validCustomerResidenceCity='" + validCustomerResidenceCity + '\'' +
                ", validCustomerResidentAddress='" + validCustomerResidentAddress + '\'' +
                ", validCustomerFamilyStatus='" + validCustomerFamilyStatus + '\'' +
                ", newCustomerEveryMonthProfit='" + newCustomerEveryMonthProfit + '\'' +
                ", military='" + military + '\'' +
                ", validCustomerInvalid='" + validCustomerInvalid + '\'' +
                ", validCustomerPensioner='" + validCustomerPensioner + '\'' +
                ", customerNationality='" + customerNationality + '\'' +
                ", militaryBool=" + militaryBool +
                ", newCustomerInvalidBool=" + newCustomerInvalidBool +
                ", NewCustomerPensionerBool=" + NewCustomerPensionerBool +
                '}';
    }
}
