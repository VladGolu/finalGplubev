package controller.entity;

public class InvalidCustomerInfo {

    String newCustomerName;                 //имя
    String newCustomerSurName;              //фамилия
    String newCustomerPatronymic;           //отчество
    String newCustomerEmail;                //E-mail
    String newCustomerPassportNumber;       //номер паспорта
    String newCustomerPassportSeries;       //серия паспорта
    String subjectPassportIssue;            //кем выдан
    String newCustomerPassportId;           //Индентификационный номер
    String newCustomerBirthPlace;           //Место рождения
    String newCustomerLiveCity;             //Город проживания
    String newCustomerPassword;             //пароль
    String newCustomerPasswordRepeat;       //повторный пароль
    String newCustomerHomeAddress;          //домашний адрес
    String newCustomerWorkAddress;          //адрес работы
    String newCustomerCity;                 //Город
    String newCustomerLiveAddress;          //Адрес проживания
    String newCustomerHomeTelephone;        //Домашний телефон  валидация на 6 цифр
    String newCustomerMobileTelephone;      //Мобильный телефон
    String newCustomerWorkPosition;         //Должность на работе
    String newCustomerResidenceCity;        //Город прописки
    String newCustomerResidentAddress;      //Адрес прописки
    String newCustomerFamilyStatus;         //Состав семьи
    String newCustomerEveryMonthProfit;     //ежемесячный доход
    String military;                        //Военнообязанный
    String newCustomerInvalid;              //Наличие инвалидности
    String newCustomerPensioner;            //Пенсионер или нет
    String newCustomerHomeTelephoneMask;    // маска для домашнего телефона
    String newCustomerMobileTelephoneMask;  // маска для домашнего телефона


    private static final InvalidCustomerInfo INSTANCE = new InvalidCustomerInfo();

    public static InvalidCustomerInfo getINSTANCE() {
        return INSTANCE;
    }

    public InvalidCustomerInfo(String newCustomerName, String newCustomerSurName, String newCustomerPatronymic, String newCustomerEmail,
                               String newCustomerPassportNumber, String newCustomerPassportSeries, String subjectPassportIssue, String newCustomerPassportId,
                               String newCustomerBirthPlace, String newCustomerLiveCity, String newCustomerPassword, String newCustomerPasswordRepeat,
                               String newCustomerHomeAddress, String newCustomerWorkAddress, String newCustomerCity, String newCustomerLiveAddress,
                               String newCustomerHomeTelephone, String newCustomerMobileTelephone, String newCustomerWorkPosition, String newCustomerResidenceCity,
                               String newCustomerResidentAddress, String newCustomerFamilyStatus, String newCustomerEveryMonthProfit, String military,
                               String newCustomerInvalid, String newCustomerPensioner) {

        this.newCustomerName = newCustomerName;
        this.newCustomerSurName = newCustomerSurName;
        this.newCustomerPatronymic = newCustomerPatronymic;
        this.newCustomerEmail = newCustomerEmail;
        this.newCustomerPassportNumber = newCustomerPassportNumber;
        this.newCustomerPassportSeries = newCustomerPassportSeries;
        this.subjectPassportIssue = subjectPassportIssue;
        this.newCustomerPassportId = newCustomerPassportId;
        this.newCustomerBirthPlace = newCustomerBirthPlace;
        this.newCustomerLiveCity = newCustomerLiveCity;
        this.newCustomerPassword = newCustomerPassword;
        this.newCustomerPasswordRepeat = newCustomerPasswordRepeat;
        this.newCustomerHomeAddress = newCustomerHomeAddress;
        this.newCustomerWorkAddress = newCustomerWorkAddress;
        this.newCustomerCity = newCustomerCity;
        this.newCustomerLiveAddress = newCustomerLiveAddress;
        this.newCustomerHomeTelephone = newCustomerHomeTelephone;
        this.newCustomerMobileTelephone = newCustomerMobileTelephone;
        this.newCustomerWorkPosition = newCustomerWorkPosition;
        this.newCustomerResidenceCity = newCustomerResidenceCity;
        this.newCustomerResidentAddress = newCustomerResidentAddress;
        this.newCustomerFamilyStatus = newCustomerFamilyStatus;
        this.newCustomerEveryMonthProfit = newCustomerEveryMonthProfit;
        this.military = military;
        this.newCustomerInvalid = newCustomerInvalid;
        this.newCustomerPensioner = newCustomerPensioner;
    }

    public InvalidCustomerInfo() {
    }

    public String getNewCustomerName() {
        return newCustomerName;
    }

    public String getNewCustomerSurName() {
        return newCustomerSurName;
    }

    public String getNewCustomerPatronymic() {
        return newCustomerPatronymic;
    }

    public String getNewCustomerEmail() {
        return newCustomerEmail;
    }

    public String getNewCustomerPassportNumber() {
        return newCustomerPassportNumber;
    }

    public String getNewCustomerPassportSeries() {
        return newCustomerPassportSeries;
    }

    public String getSubjectPassportIssue() {
        return subjectPassportIssue;
    }

    public String getNewCustomerPassportId() {
        return newCustomerPassportId;
    }

    public String getNewCustomerBirthPlace() {
        return newCustomerBirthPlace;
    }

    public String getNewCustomerLiveCity() {
        return newCustomerLiveCity;
    }

    public String getNewCustomerPassword() {
        return newCustomerPassword;
    }

    public String getNewCustomerPasswordRepeat() {
        return newCustomerPasswordRepeat;
    }

    public String getNewCustomerHomeAddress() {
        return newCustomerHomeAddress;
    }

    public String getNewCustomerWorkAddress() {
        return newCustomerWorkAddress;
    }

    public String getNewCustomerCity() {
        return newCustomerCity;
    }

    public String getNewCustomerLiveAddress() {
        return newCustomerLiveAddress;
    }

    public String getNewCustomerHomeTelephone() {
        return newCustomerHomeTelephone;
    }

    public String getNewCustomerMobileTelephone() {
        return newCustomerMobileTelephone;
    }

    public String getNewCustomerWorkPosition() {
        return newCustomerWorkPosition;
    }

    public String getNewCustomerResidenceCity() {
        return newCustomerResidenceCity;
    }

    public String getNewCustomerResidentAddress() {
        return newCustomerResidentAddress;
    }

    public String getNewCustomerFamilyStatus() {
        return newCustomerFamilyStatus;
    }

    public String getNewCustomerEveryMonthProfit() {
        return newCustomerEveryMonthProfit;
    }

    public String getMilitary() {
        return military;
    }

    public String getNewCustomerInvalid() {
        return newCustomerInvalid;
    }

    public String getNewCustomerPensioner() {
        return newCustomerPensioner;
    }

    public void setNewCustomerName(String newCustomerName) {
        this.newCustomerName = newCustomerName;
    }

    public void setNewCustomerSurName(String newCustomerSurName) {
        this.newCustomerSurName = newCustomerSurName;
    }

    public void setNewCustomerPatronymic(String newCustomerPatronymic) {
        this.newCustomerPatronymic = newCustomerPatronymic;
    }

    public void setNewCustomerEmail(String newCustomerEmail) {
        this.newCustomerEmail = newCustomerEmail;
    }

    public void setNewCustomerPassportNumber(String newCustomerPassportNumber) {
        this.newCustomerPassportNumber = newCustomerPassportNumber;
    }

    public void setNewCustomerPassportSeries(String newCustomerPassportSeries) {
        this.newCustomerPassportSeries = newCustomerPassportSeries;
    }

    public void setSubjectPassportIssue(String subjectPassportIssue) {
        this.subjectPassportIssue = subjectPassportIssue;
    }

    public void setNewCustomerPassportId(String newCustomerPassportId) {
        this.newCustomerPassportId = newCustomerPassportId;
    }

    public void setNewCustomerBirthPlace(String newCustomerBirthPlace) {
        this.newCustomerBirthPlace = newCustomerBirthPlace;
    }

    public void setNewCustomerLiveCity(String newCustomerLiveCity) {
        this.newCustomerLiveCity = newCustomerLiveCity;
    }

    public void setNewCustomerPassword(String newCustomerPassword) {
        this.newCustomerPassword = newCustomerPassword;
    }

    public void setNewCustomerPasswordRepeat(String newCustomerPasswordRepeat) {
        this.newCustomerPasswordRepeat = newCustomerPasswordRepeat;
    }

    public void setNewCustomerHomeAddress(String newCustomerHomeAddress) {
        this.newCustomerHomeAddress = newCustomerHomeAddress;
    }

    public void setNewCustomerWorkAddress(String newCustomerWorkAddress) {
        this.newCustomerWorkAddress = newCustomerWorkAddress;
    }

    public void setNewCustomerCity(String newCustomerCity) {
        this.newCustomerCity = newCustomerCity;
    }

    public void setNewCustomerLiveAddress(String newCustomerLiveAddress) {
        this.newCustomerLiveAddress = newCustomerLiveAddress;
    }

    public void setNewCustomerHomeTelephone(String newCustomerHomeTelephone) {
        this.newCustomerHomeTelephone = newCustomerHomeTelephone;
    }

    public void setNewCustomerMobileTelephone(String newCustomerMobileTelephone) {
        this.newCustomerMobileTelephone = newCustomerMobileTelephone;
    }

    public void setNewCustomerWorkPosition(String newCustomerWorkPosition) {
        this.newCustomerWorkPosition = newCustomerWorkPosition;
    }

    public void setNewCustomerResidenceCity(String newCustomerResidenceCity) {
        this.newCustomerResidenceCity = newCustomerResidenceCity;
    }

    public void setNewCustomerResidentAddress(String newCustomerResidentAddress) {
        this.newCustomerResidentAddress = newCustomerResidentAddress;
    }

    public void setNewCustomerFamilyStatus(String newCustomerFamilyStatus) {
        this.newCustomerFamilyStatus = newCustomerFamilyStatus;
    }

    public void setNewCustomerEveryMonthProfit(String newCustomerEveryMonthProfit) {
        this.newCustomerEveryMonthProfit = newCustomerEveryMonthProfit;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public void setNewCustomerInvalid(String newCustomerInvalid) {
        this.newCustomerInvalid = newCustomerInvalid;
    }

    public void setNewCustomerPensioner(String newCustomerPensioner) {
        newCustomerPensioner = newCustomerPensioner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvalidCustomerInfo that = (InvalidCustomerInfo) o;

        if (newCustomerName != null ? !newCustomerName.equals(that.newCustomerName) : that.newCustomerName != null)
            return false;
        if (newCustomerSurName != null ? !newCustomerSurName.equals(that.newCustomerSurName) : that.newCustomerSurName != null)
            return false;
        if (newCustomerPatronymic != null ? !newCustomerPatronymic.equals(that.newCustomerPatronymic) : that.newCustomerPatronymic != null)
            return false;
        if (newCustomerEmail != null ? !newCustomerEmail.equals(that.newCustomerEmail) : that.newCustomerEmail != null)
            return false;
        if (newCustomerPassportNumber != null ? !newCustomerPassportNumber.equals(that.newCustomerPassportNumber) : that.newCustomerPassportNumber != null)
            return false;
        if (newCustomerPassportSeries != null ? !newCustomerPassportSeries.equals(that.newCustomerPassportSeries) : that.newCustomerPassportSeries != null)
            return false;
        if (subjectPassportIssue != null ? !subjectPassportIssue.equals(that.subjectPassportIssue) : that.subjectPassportIssue != null)
            return false;
        if (newCustomerPassportId != null ? !newCustomerPassportId.equals(that.newCustomerPassportId) : that.newCustomerPassportId != null)
            return false;
        if (newCustomerBirthPlace != null ? !newCustomerBirthPlace.equals(that.newCustomerBirthPlace) : that.newCustomerBirthPlace != null)
            return false;
        if (newCustomerLiveCity != null ? !newCustomerLiveCity.equals(that.newCustomerLiveCity) : that.newCustomerLiveCity != null)
            return false;
        if (newCustomerPassword != null ? !newCustomerPassword.equals(that.newCustomerPassword) : that.newCustomerPassword != null)
            return false;
        if (newCustomerPasswordRepeat != null ? !newCustomerPasswordRepeat.equals(that.newCustomerPasswordRepeat) : that.newCustomerPasswordRepeat != null)
            return false;
        if (newCustomerHomeAddress != null ? !newCustomerHomeAddress.equals(that.newCustomerHomeAddress) : that.newCustomerHomeAddress != null)
            return false;
        if (newCustomerWorkAddress != null ? !newCustomerWorkAddress.equals(that.newCustomerWorkAddress) : that.newCustomerWorkAddress != null)
            return false;
        if (newCustomerCity != null ? !newCustomerCity.equals(that.newCustomerCity) : that.newCustomerCity != null)
            return false;
        if (newCustomerLiveAddress != null ? !newCustomerLiveAddress.equals(that.newCustomerLiveAddress) : that.newCustomerLiveAddress != null)
            return false;
        if (newCustomerHomeTelephone != null ? !newCustomerHomeTelephone.equals(that.newCustomerHomeTelephone) : that.newCustomerHomeTelephone != null)
            return false;
        if (newCustomerMobileTelephone != null ? !newCustomerMobileTelephone.equals(that.newCustomerMobileTelephone) : that.newCustomerMobileTelephone != null)
            return false;
        if (newCustomerWorkPosition != null ? !newCustomerWorkPosition.equals(that.newCustomerWorkPosition) : that.newCustomerWorkPosition != null)
            return false;
        if (newCustomerResidenceCity != null ? !newCustomerResidenceCity.equals(that.newCustomerResidenceCity) : that.newCustomerResidenceCity != null)
            return false;
        if (newCustomerResidentAddress != null ? !newCustomerResidentAddress.equals(that.newCustomerResidentAddress) : that.newCustomerResidentAddress != null)
            return false;
        if (newCustomerFamilyStatus != null ? !newCustomerFamilyStatus.equals(that.newCustomerFamilyStatus) : that.newCustomerFamilyStatus != null)
            return false;
        if (newCustomerEveryMonthProfit != null ? !newCustomerEveryMonthProfit.equals(that.newCustomerEveryMonthProfit) : that.newCustomerEveryMonthProfit != null)
            return false;
        if (military != null ? !military.equals(that.military) : that.military != null) return false;
        if (newCustomerInvalid != null ? !newCustomerInvalid.equals(that.newCustomerInvalid) : that.newCustomerInvalid != null)
            return false;
        return newCustomerPensioner != null ? newCustomerPensioner.equals(that.newCustomerPensioner) : that.newCustomerPensioner == null;
    }

    @Override
    public int hashCode() {
        int result = newCustomerName != null ? newCustomerName.hashCode() : 0;
        result = 31 * result + (newCustomerSurName != null ? newCustomerSurName.hashCode() : 0);
        result = 31 * result + (newCustomerPatronymic != null ? newCustomerPatronymic.hashCode() : 0);
        result = 31 * result + (newCustomerEmail != null ? newCustomerEmail.hashCode() : 0);
        result = 31 * result + (newCustomerPassportNumber != null ? newCustomerPassportNumber.hashCode() : 0);
        result = 31 * result + (newCustomerPassportSeries != null ? newCustomerPassportSeries.hashCode() : 0);
        result = 31 * result + (subjectPassportIssue != null ? subjectPassportIssue.hashCode() : 0);
        result = 31 * result + (newCustomerPassportId != null ? newCustomerPassportId.hashCode() : 0);
        result = 31 * result + (newCustomerBirthPlace != null ? newCustomerBirthPlace.hashCode() : 0);
        result = 31 * result + (newCustomerLiveCity != null ? newCustomerLiveCity.hashCode() : 0);
        result = 31 * result + (newCustomerPassword != null ? newCustomerPassword.hashCode() : 0);
        result = 31 * result + (newCustomerPasswordRepeat != null ? newCustomerPasswordRepeat.hashCode() : 0);
        result = 31 * result + (newCustomerHomeAddress != null ? newCustomerHomeAddress.hashCode() : 0);
        result = 31 * result + (newCustomerWorkAddress != null ? newCustomerWorkAddress.hashCode() : 0);
        result = 31 * result + (newCustomerCity != null ? newCustomerCity.hashCode() : 0);
        result = 31 * result + (newCustomerLiveAddress != null ? newCustomerLiveAddress.hashCode() : 0);
        result = 31 * result + (newCustomerHomeTelephone != null ? newCustomerHomeTelephone.hashCode() : 0);
        result = 31 * result + (newCustomerMobileTelephone != null ? newCustomerMobileTelephone.hashCode() : 0);
        result = 31 * result + (newCustomerWorkPosition != null ? newCustomerWorkPosition.hashCode() : 0);
        result = 31 * result + (newCustomerResidenceCity != null ? newCustomerResidenceCity.hashCode() : 0);
        result = 31 * result + (newCustomerResidentAddress != null ? newCustomerResidentAddress.hashCode() : 0);
        result = 31 * result + (newCustomerFamilyStatus != null ? newCustomerFamilyStatus.hashCode() : 0);
        result = 31 * result + (newCustomerEveryMonthProfit != null ? newCustomerEveryMonthProfit.hashCode() : 0);
        result = 31 * result + (military != null ? military.hashCode() : 0);
        result = 31 * result + (newCustomerInvalid != null ? newCustomerInvalid.hashCode() : 0);
        result = 31 * result + (newCustomerPensioner != null ? newCustomerPensioner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InvalidCustomerInfo{" +
                "newCustomerName='" + newCustomerName + '\'' +
                ", newCustomerSurName='" + newCustomerSurName + '\'' +
                ", newCustomerPatronymic='" + newCustomerPatronymic + '\'' +
                ", newCustomerEmail='" + newCustomerEmail + '\'' +
                ", newCustomerPassportNumber='" + newCustomerPassportNumber + '\'' +
                ", newCustomerPassportSeries='" + newCustomerPassportSeries + '\'' +
                ", subjectPassportIssue='" + subjectPassportIssue + '\'' +
                ", newCustomerPassportId='" + newCustomerPassportId + '\'' +
                ", newCustomerBirthPlace='" + newCustomerBirthPlace + '\'' +
                ", newCustomerLiveCity='" + newCustomerLiveCity + '\'' +
                ", newCustomerPassword='" + newCustomerPassword + '\'' +
                ", newCustomerPasswordRepeat='" + newCustomerPasswordRepeat + '\'' +
                ", newCustomerHomeAddress='" + newCustomerHomeAddress + '\'' +
                ", newCustomerWorkAddress='" + newCustomerWorkAddress + '\'' +
                ", newCustomerCity='" + newCustomerCity + '\'' +
                ", newCustomerLiveAddress='" + newCustomerLiveAddress + '\'' +
                ", newCustomerHomeTelephone='" + newCustomerHomeTelephone + '\'' +
                ", newCustomerMobileTelephone='" + newCustomerMobileTelephone + '\'' +
                ", newCustomerWorkPosition='" + newCustomerWorkPosition + '\'' +
                ", newCustomerResidenceCity='" + newCustomerResidenceCity + '\'' +
                ", newCustomerResidentAddress='" + newCustomerResidentAddress + '\'' +
                ", newCustomerFamilyStatus='" + newCustomerFamilyStatus + '\'' +
                ", newCustomerEveryMonthProfit='" + newCustomerEveryMonthProfit + '\'' +
                ", military=" + military +
                ", newCustomerInvalid=" + newCustomerInvalid +
                ", NewCustomerPensioner=" + newCustomerPensioner +
                '}';
    }
}
