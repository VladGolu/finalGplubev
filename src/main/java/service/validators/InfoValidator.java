package service.validators;

import dao.CustomerDAO;
import dao.databaseConnection.ConnectionPool;
import dao.databaseConnection.DataBaseConfigReader;
import dao.entity.Customer;
import dao.exception.DAOException;
import dao.impl.CustomerDAOImpl;
import org.jetbrains.annotations.NotNull;
import service.creators.*;
import service.entity.ValidCustomerInfo;

public class InfoValidator {
    BirthDateCreator birthDateCreator = new BirthDateCreator();
    GenderCreator genderCreator = new GenderCreator();
    DataBaseConfigReader dataBaseConfigReader = new DataBaseConfigReader();
    CustomerDAO customerDAO = new CustomerDAOImpl(new ConnectionPool(dataBaseConfigReader));
    NationalityCreator nationalityCreator = new NationalityCreator();
    PensionerStatusCreator pensionerStatusCreator = new PensionerStatusCreator();
    MilitaryStatusCreator militaryStatusCreator = new MilitaryStatusCreator();
    InvalidStatusCreator invalidStatusCreator = new InvalidStatusCreator();
    FamilyStatusCreator familyStatusCreator = new FamilyStatusCreator();

    public void validInfo(@NotNull ValidCustomerInfo validCustomerInfo) {
        System.out.println(validCustomerInfo.getValidCustomerName());
        System.out.print(validCustomerInfo.getValidCustomerPassportId());

        Customer customer = new Customer(validCustomerInfo.getValidCustomerName(), validCustomerInfo.getValidCustomerSurName(),
                validCustomerInfo.getValidCustomerPatronymic(), genderCreator.createGender(validCustomerInfo.getValidCustomerPassportId()),
                validCustomerInfo.getValidCustomerEmail(), validCustomerInfo.getValidCustomerPassportNumber(),
                validCustomerInfo.getValidCustomerPassportSeries(), birthDateCreator.createBirthDate(validCustomerInfo.getValidCustomerPassportId()),
                validCustomerInfo.getValidSubjectPassportIssue(), validCustomerInfo.getValidCustomerPassportId(),
                validCustomerInfo.getValidCustomerBirthPlace(), validCustomerInfo.getValidCustomerLiveCity(),
                validCustomerInfo.getValidCustomerPassword(), validCustomerInfo.getValidCustomerHomeAddress(),
                validCustomerInfo.getValidCustomerWorkAddress(), validCustomerInfo.getValidCustomerCity(),
                validCustomerInfo.getValidCustomerLiveAddress(), validCustomerInfo.getValidCustomerHomeTelephone(),
                validCustomerInfo.getValidCustomerMobileTelephone(), validCustomerInfo.getValidCustomerWorkPosition(),
                validCustomerInfo.getValidCustomerResidenceCity(), validCustomerInfo.getValidCustomerResidentAddress(),
                validCustomerInfo.getNewCustomerEveryMonthProfit(), nationalityCreator.createNationality(validCustomerInfo.getValidCustomerPassportId()),
                pensionerStatusCreator.createPensionerStatus(validCustomerInfo.getValidCustomerPensioner()),
                invalidStatusCreator.createHandicapped(validCustomerInfo.getValidCustomerInvalid()),
                militaryStatusCreator.createMilitaryStatus(validCustomerInfo.getMilitary()),
                familyStatusCreator.createFamilyStatus(validCustomerInfo.getValidCustomerFamilyStatus()));

        System.out.println(customer.getCustomerName() + "__________________________");
        System.out.println(customer.getCustomerPassportId() + "__________________________");
        System.out.println(customer.getCustomerGender() + "__________________________");
        try {
            customerDAO.insertCustomer(customer);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}

