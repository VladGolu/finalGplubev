package controller.reader;

import controller.consoles.FrontControllerConsole;
import controller.entity.InvalidCustomerInfo;
import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;

public class DataReader {

    FrontControllerConsole frontControllerConsole = new FrontControllerConsole();

    public InvalidCustomerInfo readData(@NotNull HttpServletRequest req) {

        String newCustomerEmail = req.getParameter("customerEmail");
        String newCustomerName = req.getParameter("customerName");
        String newCustomerSurName = req.getParameter("customerSurName");
        String newCustomerPassportNumber = req.getParameter("customerPassportNumber");
        String newCustomerPassword = req.getParameter("customerPassword");
        String newCustomerPasswordRepeat = req.getParameter("customerPasswordRepeat");
        String newCustomerPatronymic = req.getParameter("customerPatronymic");
        String newCustomerPassportSeries = req.getParameter("customerPassportSeries");
        String newCustomerSubjectPassportIssue = req.getParameter("customerSubjectPassportIssue");
        String newCustomerPassportIdNumber = req.getParameter("customerPassportIdNumber");
        String newCustomerBirthPlace = req.getParameter("newCustomerBirthPlace");
        String newCustomerLiveCity = req.getParameter("newCustomerLiveCity");
        String newCustomerHomeAddress = req.getParameter("newCustomerHomeAddress");
        String newCustomerWorkAddress = req.getParameter("newCustomerWorkAddress");
        String newCustomerPensioner = req.getParameter("NewCustomerPensioner");
        String newCustomerInvalid = req.getParameter("newCustomerInvalid");
        String newCustomerMilitary = req.getParameter("newCustomerMilitary");
        String newCustomerCity = req.getParameter("newCustomerCity");
        String newCustomerLiveAddress = req.getParameter("newCustomerLiveAddress");
        String newCustomerHomeTelephone = req.getParameter("newCustomerHomeTelephone");
        String newCustomerMobileTelephone = req.getParameter("newCustomerMobileTelephone");
        String newCustomerWorkPosition = req.getParameter("newCustomerWorkPosition");
        String newCustomerEveryMonthProfit = req.getParameter("newCustomerEveryMonthProfit");
        String newCustomerResidenceCity = req.getParameter("newCustomerResidenceCity");
        String newCustomerResidentAddress = req.getParameter("newCustomerResidentAddress");
        String newCustomerFamilyStatus = req.getParameter("newCustomerFamilyStatus");

        if (newCustomerMilitary == null) {
            newCustomerMilitary = "off";
        }
        if (newCustomerPensioner == null) {
            newCustomerPensioner = "off";
        }
        if (newCustomerInvalid == null) {
            newCustomerInvalid = "off";
        }
        if (newCustomerFamilyStatus == null) {
            newCustomerFamilyStatus = "off";
        }
        frontControllerConsole.printReaderData(newCustomerEmail, newCustomerName, newCustomerSurName, newCustomerPatronymic, newCustomerPassportNumber,
                newCustomerPassportSeries, newCustomerPassportIdNumber, newCustomerSubjectPassportIssue, newCustomerPassword, newCustomerPasswordRepeat,
                newCustomerBirthPlace, newCustomerLiveCity, newCustomerPensioner, newCustomerHomeAddress, newCustomerWorkAddress, newCustomerInvalid,
                newCustomerMilitary, newCustomerCity, newCustomerLiveAddress, newCustomerHomeTelephone, newCustomerMobileTelephone, newCustomerWorkPosition,
                newCustomerResidenceCity, newCustomerResidentAddress, newCustomerFamilyStatus, newCustomerEveryMonthProfit);

        return new InvalidCustomerInfo(newCustomerName, newCustomerSurName, newCustomerPatronymic, newCustomerEmail, newCustomerPassportNumber, newCustomerPassportSeries, newCustomerSubjectPassportIssue,
                newCustomerPassportIdNumber, newCustomerBirthPlace, newCustomerLiveCity, newCustomerPassword, newCustomerPasswordRepeat, newCustomerHomeAddress, newCustomerWorkAddress, newCustomerCity,
                newCustomerLiveAddress, newCustomerHomeTelephone, newCustomerMobileTelephone, newCustomerWorkPosition, newCustomerResidenceCity, newCustomerResidentAddress, newCustomerFamilyStatus,
                newCustomerEveryMonthProfit, newCustomerMilitary, newCustomerInvalid, newCustomerPensioner);
    }
}
