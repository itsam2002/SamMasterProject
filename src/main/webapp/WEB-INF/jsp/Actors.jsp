<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Current Time Example</title>
</head>
<body>
    <h3>Current Time is:</h3>
    <%-- JSP Expression to output a Java Date object --%>
    <strong><%= new java.util.Date() %></strong>
</body>
</html>