<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/w3.css" rel="stylesheet" type="text/css">

<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet ;-)</a>
<a href="CountryServlet">Liste des Pays</a>
<a href="CityServlet">Liste des Villes</a>
</body>
</html>