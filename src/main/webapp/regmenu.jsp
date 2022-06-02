
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<!DOCTYPE html>-->
<html>
<head>
    <link rel="stylesheet" href="css/index.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8">
    <header class="header">
        <div class="header_conteiner">
            <div class="header_inener">
                <div class="header_logo">
                </div>
                <div>
                    <nav>
                        <ul class="topmenu">
                            <li><a href="Features.jsp">Stocks</a></li>
                            <li><a href="">Works</a></li>
                            <li><a href="" class="down">Menu</a>
                                <ul class="submenu">

                                    <li><a href="Gallery.jsp">Gallery</a></li>
                                    <li><a href="OurTeam.jsp">OurTeam</a></li>
                                    <li><a href="">Tags</a></li>
                                </ul>
                            </li>
                            <li><a href="" class="down">Account</a>
                                <ul class="submenu">
                                    <li><a href="regmenu.jsp">Registration</a></li>
                                    <li><a href="EnterMenu.jsp">Enter</a></li>

                                </ul>
                            </li>
                            <li><a href="">Currency</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>

    </header>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: rgb(150, 150, 150);
        }

        * {
            box-sizing: border-box;
        }

        /* Add padding to containers */
        .container {
            margin-top: 6.5%;
            padding: 16px;
            background-color: rgb(182, 182, 182);
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Overwrite default styles of hr */
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for the submit button */
        .registerbtn {
            background-color: #4CAF50;
            color: rgb(255, 255, 255);
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }

        /* Add a blue text color to links */
        a {
            color: dodgerblue;
        }

        /* Set a grey background color and center the text of the "sign in" section */
        .signin {
            background-color: #f1f1f1;
            text-align: center;
        }
    </style>
</head>
<body>

<form action="FrontController" method="post">
    <input type="hidden" name="command" value="GET_REGISTER_COMMAND">
    <div class="container">
        <%--@declare id="email"--%><%--@declare id="psw-repeat"--%><%--@declare id="psw"--%><%--@declare id="name"--%>
        <%--@declare id="surname"--%><%--@declare id="customerpassportnumber"--%><%--@declare id="customerpassword"--%><%--@declare id="customerpasswordrepeat"--%><%--@declare id="customername"--%><%--@declare id="customersurname"--%><%--@declare id="customerpatronymic"--%><%--@declare id="customersubjectpassportissue"--%><%--@declare id="newcustomerbirthplace"--%><%--@declare id="newcustomerlivecity"--%><%--@declare id="newcustomerhomeaddress"--%><%--@declare id="newcustomerworkaddress"--%><%--@declare id="newcustomercity"--%><%--@declare id="newcustomerliveaddress"--%><%--@declare id="newcustomerworkposition"--%><%--@declare id="newcustomereverymonthprofit"--%><%--@declare id="newcustomerresidencecity"--%><%--@declare id="newcustomerresidentaddress"--%><%--@declare id="newcustomerhometelephone"--%><%--@declare id="newcustomermobiletelephone"--%><%--@declare id="customerpassportseries"--%><%--@declare id="newcustomerinvalid"--%><%--@declare id="newcustomermilitary"--%><%--@declare id="newcustomerpensioner"--%><%--@declare id="newcustomerfamilystatus"--%><h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>


        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="customerEmail" required>

        <label for="customerName"><b>Customer name</b></label>
        <input type="text" placeholder="Enter Name" name="customerName" required>

        <label for="customerSurName"><b>Customer surname</b></label>
        <input type="text" placeholder="Enter Surname" name="customerSurName" required>

            <label for="customerPatronymic"><b>Customer patronymic</b></label>
            <input type="text" placeholder="Enter Patronymic" name="customerPatronymic" required>

        <label for="customerPassportNumber"><b>Passport ID number</b></label>
        <input type="text" placeholder="Enter passport ID number" name="customerPassportIdNumber" required>

            <label for="customerPassportNumber"><b>Passport number</b></label>
            <input type="text" placeholder="Enter passport number" name="customerPassportNumber" required>
            <label for="customerPassportSeries"><b>Passport number</b></label>
            <input type="text" placeholder="Enter passport series" name="customerPassportSeries" required>
            <label for="customerSubjectPassportIssue"><b>Кем выдан</b></label>
            <input type="text" placeholder="Enter passport customer subject passport issue" name="customerSubjectPassportIssue" required>
            <label for="newCustomerBirthPlace"><b>Место рождения</b></label>
            <input type="text" placeholder="Enter passport customer birth place" name="newCustomerBirthPlace" required>
            <label for="newCustomerLiveCity"><b>Город проживания</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerLiveCity" required>
            <label for="newCustomerHomeAddress"><b>Домашний адрес</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerHomeAddress" required>
            <label for="newCustomerWorkAddress"><b>Рабочий адрес</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerWorkAddress" required>
            <label for="newCustomerCity"><b>Город</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerCity" required>
            <label for="newCustomerLiveAddress"><b>Адрес проживания</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerLiveAddress" required>
            <label for="newCustomerWorkPosition"><b>Должность</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerWorkPosition" required>
            <label for="newCustomerEveryMonthProfit"><b>Заработок</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerEveryMonthProfit" required>
            <label for="newCustomerResidenceCity"><b>Город прописки</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerResidenceCity" required>
            <label for="newCustomerResidentAddress"><b>Адрес прописки</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerResidentAddress" required>
            <label for="newCustomerResidentAddress"><b>Адрес прописки</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerResidentAddress" required>
            <label for="newCustomerMobileTelephone"><b>Мобильный телефон</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerMobileTelephone" required>
            <label for="newCustomerHomeTelephone"><b>Домашний телефон</b></label>
            <input type="text" placeholder="Enter passport customer live city" name="newCustomerHomeTelephone" required>

            <label for="newCustomerInvalid"><b>Инвалидность</b></label>
            <input type="checkbox"  name="newCustomerInvalid">
            <label for="newCustomerMilitary"><b>Военнообязанный</b></label>
            <input type="checkbox"  name="newCustomerMilitary">
            <label for="NewCustomerPensioner"><b>Пенсионер</b></label>
            <input type="checkbox"  name="NewCustomerPensioner">
            <label for="newCustomerFamilyStatus"><b>Полная семья?</b></label>
            <input type="checkbox"  name="newCustomerFamilyStatus">


        <label for="customerPassword"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="customerPassword" required>

        <label for="customerPasswordRepeat"><b>Repeat Password</b></label>
        <input type="password" placeholder="Repeat Password" name="customerPasswordRepeat" required>
        <hr>
        <p>By creating an account you agree to our <a href="index.jsp">Terms & Privacy</a>.</p>

        <button type="submit" class="registerbtn">Register</button>
    </div>

    <div class="container signin">
        <p>Already have an account? <a href="EnterMenu.jsp">Sign in</a>.</p>
    </div>
</form>

</body>
</html>
