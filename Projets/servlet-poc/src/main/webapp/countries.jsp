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
    <title>Countries</title>
</head>
<script>
    function myFunction(id) {
        var x = document.getElementById(id);
        if (x.className.indexOf("w3-show") == -1) {
            x.className += " w3-show";
        } else {
            x.className = x.className.replace(" w3-show", "");
        }
    }
</script>
<body>
<p style="text-align: center">Liste des pays </p>
<div style="text-align: center">
    <table class="w3-table-all">
        <tr>
            <th>Id</th>
            <th>Nom</th>
        </tr>
        <c:forEach var="country" items="${countries}" varStatus="status">
            <tr class="w3-hover-blue">
                <td><p>${country.id}</p></td>
                <td><p>${country.country}</p></td>
                <button onclick="myFunction('cty${status.count}')" class="w3-btn w3-block w3-black">${country.country}</button>
                <div id="cty${status.count}" class="w3-container w3-hide">
                        <c:forEach var="city" items="${country.cities}" varStatus="stat">
                            <p>${city.city}</p>
                        </c:forEach>
                </div>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
