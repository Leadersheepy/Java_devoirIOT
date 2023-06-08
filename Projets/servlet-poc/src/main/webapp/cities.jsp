<%--
  Created by IntelliJ IDEA.
  User: Developpeur
  Date: 27/04/2023
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/w3.css" rel="stylesheet" type="text/css">

<html>
<head>
    <title>Cities</title>
</head>
<body>
<p style="text-align: center">Liste des Villes - center</p>
<div style="text-align: center">
    <table class="w3-table-all">
        <tr>
            <th>Id</th>
            <th>Nom</th>
            <th>Pays</th>
        </tr>
        <c:forEach var="city" items="${cities}" varStatus="status">
            <tr class="w3-hover-blue">
                <td><p>${city.id}</p></td>
                <td><p>${city.city}</p></td>
                <td><p>${city.country.country}</p></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
