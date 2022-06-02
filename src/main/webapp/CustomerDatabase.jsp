<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 08.05.2022
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="margin-left:1%;margin-top:2%;">
    <c:forEach var="customer" items="${requestScope.customers}" >
        <tr>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerName()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerSurName()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
            <span><c:out value="${customer.getCustomerPatronymic()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerEmail()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerGender()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerPassportNumber()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerPassportSeries()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getSubjectPassportIssue()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getBirthDate()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerPassportId()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerBirthPlace()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerLiveCity()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerPassword()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerHomeAddress()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerWorkAddress()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerCity()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerLiveAddress()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerHomeTelephone()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer. getCustomerMobileTelephone()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerWorkPosition()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerResidenceCity()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerResidentAddress()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerFamilyStatus()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerEveryMonthProfit()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerNationality()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getMilitaryBool()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerInvalidBool()}" /></span>
            </th>
            <th style="width: 170px;height:50px;text-align: center;">
                <span><c:out value="${customer.getCustomerPensionerBool()}" /></span>
            </th>


        </tr>
</c:forEach>
</table>
</body>
</html>
