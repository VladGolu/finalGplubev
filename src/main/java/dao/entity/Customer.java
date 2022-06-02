package dao.entity;

public class Customer {

    String CustomerName;                 //имя
    String CustomerSurName;              //фамилия
    String CustomerPatronymic;           //отчество
    String customerGender;                  //пол
    String customerEmail;                //E-mail
    String customerPassportNumber;       //номер паспорта
    String customerPassportSeries;       //серия паспорта
    String BirthDate;
    String SubjectPassportIssue;            //кем выдан
    String CustomerPassportId;           //Индентификационный номер
    String CustomerBirthPlace;           //Место рождения
    String CustomerLiveCity;             //Город проживания
    String CustomerPassword;             //пароль
    String CustomerPasswordRepeat;       //повторный пароль
    String CustomerHomeAddress;          //домашний адрес
    String CustomerWorkAddress;          //адрес работы
    String CustomerCity;                 //Город
    String CustomerLiveAddress;          //Адрес проживания
    String CustomerHomeTelephone;        //Домашний телефон
    String CustomerMobileTelephone;      //Мобильный телефон
    String CustomerWorkPosition;         //Должность на работе
    String CustomerResidenceCity;        //Город прописки
    String CustomerResidentAddress;      //Адрес прописки
    String CustomerFamilyStatus;         //Состав семьи
    String CustomerEveryMonthProfit;     //ежемесячный доход
    String customerNationality;              //Гражданство
    Boolean militaryBool;                        //Военнообязанный
    Boolean CustomerInvalidBool;              //Наличие инвалидности
    Boolean CustomerPensionerBool;

    public Customer(String customerName, String customerSurName, String customerPatronymic, String customerGender, String customerEmail,
                    String customerPassportNumber, String customerPassportSeries, String birthDate, String subjectPassportIssue,
                    String customerPassportId, String customerBirthPlace, String customerLiveCity, String customerPassword,
                    String customerPasswordRepeat, String customerHomeAddress, String customerWorkAddress, String customerCity,
                    String customerLiveAddress, String customerHomeTelephone, String customerMobileTelephone, String customerWorkPosition,
                    String customerResidenceCity, String customerResidentAddress, String customerFamilyStatus, String customerEveryMonthProfit,
                    String customerNationality, Boolean militaryBool, Boolean customerInvalidBool, Boolean customerPensionerBool) {

        CustomerName = customerName;
        CustomerSurName = customerSurName;
        CustomerPatronymic = customerPatronymic;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerPassportNumber = customerPassportNumber;
        this.customerPassportSeries = customerPassportSeries;
        BirthDate = birthDate;
        SubjectPassportIssue = subjectPassportIssue;
        CustomerPassportId = customerPassportId;
        CustomerBirthPlace = customerBirthPlace;
        CustomerLiveCity = customerLiveCity;
        CustomerPassword = customerPassword;
        CustomerPasswordRepeat = customerPasswordRepeat;
        CustomerHomeAddress = customerHomeAddress;
        CustomerWorkAddress = customerWorkAddress;
        CustomerCity = customerCity;
        CustomerLiveAddress = customerLiveAddress;
        CustomerHomeTelephone = customerHomeTelephone;
        CustomerMobileTelephone = customerMobileTelephone;
        CustomerWorkPosition = customerWorkPosition;
        CustomerResidenceCity = customerResidenceCity;
        CustomerResidentAddress = customerResidentAddress;
        CustomerFamilyStatus = customerFamilyStatus;
        CustomerEveryMonthProfit = customerEveryMonthProfit;
        this.customerNationality = customerNationality;
        this.militaryBool = militaryBool;
        CustomerInvalidBool = customerInvalidBool;
        CustomerPensionerBool = customerPensionerBool;

    }

    public Customer(String customerName, String customerEmail, String customerPassportId, String customerSurName, String customerPassword, String customerGender,
                    String customerPatronymic, String customerPassportNumber, String subjectPassportIssue, String birthDate, String customerBirthPlace, String customerLiveCity,
             String c) {
        this.CustomerName = customerName;
        this.customerEmail = customerEmail;
        this.CustomerPassportId = customerPassportId;
        this.CustomerSurName = customerSurName;
        this.CustomerPassword = customerPassword;
        this.customerGender = customerGender;
        this.CustomerPatronymic = customerPatronymic;
        this.customerPassportNumber = customerPassportNumber;
        this.SubjectPassportIssue = subjectPassportIssue;
        this.BirthDate = birthDate;
        this.CustomerBirthPlace = customerBirthPlace;
        this.CustomerLiveCity = customerLiveCity;
    }

    public Customer(String customerName, String customerSurName, String customerPatronymic, String customerGender,
                    String customerEmail, String customerPassportNumber, String customerPassportSeries, String birthDate,
                    String subjectPassportIssue, String customerPassportId, String customerBirthPlace, String customerLiveCity,
                    String customerPassword, String customerHomeAddress, String customerWorkAddress, String customerCity,
                    String customerLiveAddress, String customerHomeTelephone, String customerMobileTelephone,
                    String customerWorkPosition, String customerResidenceCity, String customerResidentAddress,
                    String customerEveryMonthProfit, String customerNationality, Boolean pensionerStatus,
                    Boolean invalidStatus, Boolean militaryStatus, String customerFamilyStatus) {
        CustomerName = customerName;
        CustomerSurName = customerSurName;
        CustomerPatronymic = customerPatronymic;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerPassportNumber = customerPassportNumber;
        this.customerPassportSeries = customerPassportSeries;
        BirthDate = birthDate;
        SubjectPassportIssue = subjectPassportIssue;
        CustomerPassportId = customerPassportId;
        CustomerBirthPlace = customerBirthPlace;
        CustomerLiveCity = customerLiveCity;
        CustomerPassword = customerPassword;
        CustomerHomeAddress = customerHomeAddress;
        CustomerWorkAddress = customerWorkAddress;
        CustomerCity = customerCity;
        CustomerLiveAddress = customerLiveAddress;
        CustomerHomeTelephone = customerHomeTelephone;
        CustomerMobileTelephone = customerMobileTelephone;
        CustomerWorkPosition = customerWorkPosition;
        CustomerResidenceCity = customerResidenceCity;
        CustomerResidentAddress = customerResidentAddress;
        CustomerEveryMonthProfit = customerEveryMonthProfit;
        this.customerNationality = customerNationality;
        this.CustomerInvalidBool =invalidStatus;
        this.CustomerPensionerBool=pensionerStatus;
        this.militaryBool=militaryStatus;
        this.CustomerFamilyStatus=customerFamilyStatus;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerSurName() {
        return CustomerSurName;
    }

    public void setCustomerSurName(String customerSurName) {
        CustomerSurName = customerSurName;
    }

    public String getCustomerPatronymic() {
        return CustomerPatronymic;
    }

    public void setCustomerPatronymic(String customerPatronymic) {
        CustomerPatronymic = customerPatronymic;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassportNumber() {
        return customerPassportNumber;
    }

    public void setCustomerPassportNumber(String customerPassportNumber) {
        this.customerPassportNumber = customerPassportNumber;
    }

    public String getCustomerPassportSeries() {
        return customerPassportSeries;
    }

    public void setCustomerPassportSeries(String customerPassportSeries) {
        this.customerPassportSeries = customerPassportSeries;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getSubjectPassportIssue() {
        return SubjectPassportIssue;
    }

    public void setSubjectPassportIssue(String subjectPassportIssue) {
        SubjectPassportIssue = subjectPassportIssue;
    }

    public String getCustomerPassportId() {
        return CustomerPassportId;
    }

    public void setCustomerPassportId(String customerPassportId) {
        CustomerPassportId = customerPassportId;
    }

    public String getCustomerBirthPlace() {
        return CustomerBirthPlace;
    }

    public void setCustomerBirthPlace(String customerBirthPlace) {
        CustomerBirthPlace = customerBirthPlace;
    }

    public String getCustomerLiveCity() {
        return CustomerLiveCity;
    }

    public void setCustomerLiveCity(String customerLiveCity) {
        CustomerLiveCity = customerLiveCity;
    }

    public String getCustomerPassword() {
        return CustomerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        CustomerPassword = customerPassword;
    }

    public String getCustomerPasswordRepeat() {
        return CustomerPasswordRepeat;
    }

    public void setCustomerPasswordRepeat(String customerPasswordRepeat) {
        CustomerPasswordRepeat = customerPasswordRepeat;
    }

    public String getCustomerHomeAddress() {
        return CustomerHomeAddress;
    }

    public void setCustomerHomeAddress(String customerHomeAddress) {
        CustomerHomeAddress = customerHomeAddress;
    }

    public String getCustomerWorkAddress() {
        return CustomerWorkAddress;
    }

    public void setCustomerWorkAddress(String customerWorkAddress) {
        CustomerWorkAddress = customerWorkAddress;
    }

    public String getCustomerCity() {
        return CustomerCity;
    }

    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }

    public String getCustomerLiveAddress() {
        return CustomerLiveAddress;
    }

    public void setCustomerLiveAddress(String customerLiveAddress) {
        CustomerLiveAddress = customerLiveAddress;
    }

    public String getCustomerHomeTelephone() {
        return CustomerHomeTelephone;
    }

    public void setCustomerHomeTelephone(String customerHomeTelephone) {
        CustomerHomeTelephone = customerHomeTelephone;
    }

    public String getCustomerMobileTelephone() {
        return CustomerMobileTelephone;
    }

    public void setCustomerMobileTelephone(String customerMobileTelephone) {
        CustomerMobileTelephone = customerMobileTelephone;
    }

    public String getCustomerWorkPosition() {
        return CustomerWorkPosition;
    }

    public void setCustomerWorkPosition(String customerWorkPosition) {
        CustomerWorkPosition = customerWorkPosition;
    }

    public String getCustomerResidenceCity() {
        return CustomerResidenceCity;
    }

    public void setCustomerResidenceCity(String customerResidenceCity) {
        CustomerResidenceCity = customerResidenceCity;
    }

    public String getCustomerResidentAddress() {
        return CustomerResidentAddress;
    }

    public void setCustomerResidentAddress(String customerResidentAddress) {
        CustomerResidentAddress = customerResidentAddress;
    }

    public String getCustomerFamilyStatus() {
        return CustomerFamilyStatus;
    }

    public void setCustomerFamilyStatus(String customerFamilyStatus) {
        CustomerFamilyStatus = customerFamilyStatus;
    }

    public String getCustomerEveryMonthProfit() {
        return CustomerEveryMonthProfit;
    }

    public void setCustomerEveryMonthProfit(String customerEveryMonthProfit) {
        CustomerEveryMonthProfit = customerEveryMonthProfit;
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

    public Boolean getCustomerInvalidBool() {
        return CustomerInvalidBool;
    }

    public void setCustomerInvalidBool(Boolean customerInvalidBool) {
        CustomerInvalidBool = customerInvalidBool;
    }

    public Boolean getCustomerPensionerBool() {
        return CustomerPensionerBool;
    }

    public void setCustomerPensionerBool(Boolean customerPensionerBool) {
        CustomerPensionerBool = customerPensionerBool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (CustomerName != null ? !CustomerName.equals(customer.CustomerName) : customer.CustomerName != null)
            return false;
        if (CustomerSurName != null ? !CustomerSurName.equals(customer.CustomerSurName) : customer.CustomerSurName != null)
            return false;
        if (CustomerPatronymic != null ? !CustomerPatronymic.equals(customer.CustomerPatronymic) : customer.CustomerPatronymic != null)
            return false;
        if (customerGender != null ? !customerGender.equals(customer.customerGender) : customer.customerGender != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(customer.customerEmail) : customer.customerEmail != null)
            return false;
        if (customerPassportNumber != null ? !customerPassportNumber.equals(customer.customerPassportNumber) : customer.customerPassportNumber != null)
            return false;
        if (customerPassportSeries != null ? !customerPassportSeries.equals(customer.customerPassportSeries) : customer.customerPassportSeries != null)
            return false;
        if (BirthDate != null ? !BirthDate.equals(customer.BirthDate) : customer.BirthDate != null) return false;
        if (SubjectPassportIssue != null ? !SubjectPassportIssue.equals(customer.SubjectPassportIssue) : customer.SubjectPassportIssue != null)
            return false;
        if (CustomerPassportId != null ? !CustomerPassportId.equals(customer.CustomerPassportId) : customer.CustomerPassportId != null)
            return false;
        if (CustomerBirthPlace != null ? !CustomerBirthPlace.equals(customer.CustomerBirthPlace) : customer.CustomerBirthPlace != null)
            return false;
        if (CustomerLiveCity != null ? !CustomerLiveCity.equals(customer.CustomerLiveCity) : customer.CustomerLiveCity != null)
            return false;
        if (CustomerPassword != null ? !CustomerPassword.equals(customer.CustomerPassword) : customer.CustomerPassword != null)
            return false;
        if (CustomerPasswordRepeat != null ? !CustomerPasswordRepeat.equals(customer.CustomerPasswordRepeat) : customer.CustomerPasswordRepeat != null)
            return false;
        if (CustomerHomeAddress != null ? !CustomerHomeAddress.equals(customer.CustomerHomeAddress) : customer.CustomerHomeAddress != null)
            return false;
        if (CustomerWorkAddress != null ? !CustomerWorkAddress.equals(customer.CustomerWorkAddress) : customer.CustomerWorkAddress != null)
            return false;
        if (CustomerCity != null ? !CustomerCity.equals(customer.CustomerCity) : customer.CustomerCity != null)
            return false;
        if (CustomerLiveAddress != null ? !CustomerLiveAddress.equals(customer.CustomerLiveAddress) : customer.CustomerLiveAddress != null)
            return false;
        if (CustomerHomeTelephone != null ? !CustomerHomeTelephone.equals(customer.CustomerHomeTelephone) : customer.CustomerHomeTelephone != null)
            return false;
        if (CustomerMobileTelephone != null ? !CustomerMobileTelephone.equals(customer.CustomerMobileTelephone) : customer.CustomerMobileTelephone != null)
            return false;
        if (CustomerWorkPosition != null ? !CustomerWorkPosition.equals(customer.CustomerWorkPosition) : customer.CustomerWorkPosition != null)
            return false;
        if (CustomerResidenceCity != null ? !CustomerResidenceCity.equals(customer.CustomerResidenceCity) : customer.CustomerResidenceCity != null)
            return false;
        if (CustomerResidentAddress != null ? !CustomerResidentAddress.equals(customer.CustomerResidentAddress) : customer.CustomerResidentAddress != null)
            return false;
        if (CustomerFamilyStatus != null ? !CustomerFamilyStatus.equals(customer.CustomerFamilyStatus) : customer.CustomerFamilyStatus != null)
            return false;
        if (CustomerEveryMonthProfit != null ? !CustomerEveryMonthProfit.equals(customer.CustomerEveryMonthProfit) : customer.CustomerEveryMonthProfit != null)
            return false;
        if (customerNationality != null ? !customerNationality.equals(customer.customerNationality) : customer.customerNationality != null)
            return false;
        if (militaryBool != null ? !militaryBool.equals(customer.militaryBool) : customer.militaryBool != null)
            return false;
        if (CustomerInvalidBool != null ? !CustomerInvalidBool.equals(customer.CustomerInvalidBool) : customer.CustomerInvalidBool != null)
            return false;
        return CustomerPensionerBool != null ? CustomerPensionerBool.equals(customer.CustomerPensionerBool) : customer.CustomerPensionerBool == null;
    }

    @Override
    public int hashCode() {
        int result = CustomerName != null ? CustomerName.hashCode() : 0;
        result = 31 * result + (CustomerSurName != null ? CustomerSurName.hashCode() : 0);
        result = 31 * result + (CustomerPatronymic != null ? CustomerPatronymic.hashCode() : 0);
        result = 31 * result + (customerGender != null ? customerGender.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (customerPassportNumber != null ? customerPassportNumber.hashCode() : 0);
        result = 31 * result + (customerPassportSeries != null ? customerPassportSeries.hashCode() : 0);
        result = 31 * result + (BirthDate != null ? BirthDate.hashCode() : 0);
        result = 31 * result + (SubjectPassportIssue != null ? SubjectPassportIssue.hashCode() : 0);
        result = 31 * result + (CustomerPassportId != null ? CustomerPassportId.hashCode() : 0);
        result = 31 * result + (CustomerBirthPlace != null ? CustomerBirthPlace.hashCode() : 0);
        result = 31 * result + (CustomerLiveCity != null ? CustomerLiveCity.hashCode() : 0);
        result = 31 * result + (CustomerPassword != null ? CustomerPassword.hashCode() : 0);
        result = 31 * result + (CustomerPasswordRepeat != null ? CustomerPasswordRepeat.hashCode() : 0);
        result = 31 * result + (CustomerHomeAddress != null ? CustomerHomeAddress.hashCode() : 0);
        result = 31 * result + (CustomerWorkAddress != null ? CustomerWorkAddress.hashCode() : 0);
        result = 31 * result + (CustomerCity != null ? CustomerCity.hashCode() : 0);
        result = 31 * result + (CustomerLiveAddress != null ? CustomerLiveAddress.hashCode() : 0);
        result = 31 * result + (CustomerHomeTelephone != null ? CustomerHomeTelephone.hashCode() : 0);
        result = 31 * result + (CustomerMobileTelephone != null ? CustomerMobileTelephone.hashCode() : 0);
        result = 31 * result + (CustomerWorkPosition != null ? CustomerWorkPosition.hashCode() : 0);
        result = 31 * result + (CustomerResidenceCity != null ? CustomerResidenceCity.hashCode() : 0);
        result = 31 * result + (CustomerResidentAddress != null ? CustomerResidentAddress.hashCode() : 0);
        result = 31 * result + (CustomerFamilyStatus != null ? CustomerFamilyStatus.hashCode() : 0);
        result = 31 * result + (CustomerEveryMonthProfit != null ? CustomerEveryMonthProfit.hashCode() : 0);
        result = 31 * result + (customerNationality != null ? customerNationality.hashCode() : 0);
        result = 31 * result + (militaryBool != null ? militaryBool.hashCode() : 0);
        result = 31 * result + (CustomerInvalidBool != null ? CustomerInvalidBool.hashCode() : 0);
        result = 31 * result + (CustomerPensionerBool != null ? CustomerPensionerBool.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerSurName='" + CustomerSurName + '\'' +
                ", CustomerPatronymic='" + CustomerPatronymic + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPassportNumber='" + customerPassportNumber + '\'' +
                ", customerPassportSeries='" + customerPassportSeries + '\'' +
                ", BirthDate=" + BirthDate +
                ", SubjectPassportIssue='" + SubjectPassportIssue + '\'' +
                ", CustomerPassportId='" + CustomerPassportId + '\'' +
                ", CustomerBirthPlace='" + CustomerBirthPlace + '\'' +
                ", CustomerLiveCity='" + CustomerLiveCity + '\'' +
                ", CustomerPassword='" + CustomerPassword + '\'' +
                ", CustomerPasswordRepeat='" + CustomerPasswordRepeat + '\'' +
                ", CustomerHomeAddress='" + CustomerHomeAddress + '\'' +
                ", CustomerWorkAddress='" + CustomerWorkAddress + '\'' +
                ", CustomerCity='" + CustomerCity + '\'' +
                ", CustomerLiveAddress='" + CustomerLiveAddress + '\'' +
                ", CustomerHomeTelephone='" + CustomerHomeTelephone + '\'' +
                ", CustomerMobileTelephone='" + CustomerMobileTelephone + '\'' +
                ", CustomerWorkPosition='" + CustomerWorkPosition + '\'' +
                ", CustomerResidenceCity='" + CustomerResidenceCity + '\'' +
                ", CustomerResidentAddress='" + CustomerResidentAddress + '\'' +
                ", CustomerFamilyStatus='" + CustomerFamilyStatus + '\'' +
                ", CustomerEveryMonthProfit='" + CustomerEveryMonthProfit + '\'' +
                ", customerNationality='" + customerNationality + '\'' +
                ", militaryBool=" + militaryBool +
                ", CustomerInvalidBool=" + CustomerInvalidBool +
                ", CustomerPensionerBool=" + CustomerPensionerBool +
                '}';
    }
}
