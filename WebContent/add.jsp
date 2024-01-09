<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="index.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<h2>Enter values</h2>
<form action="add" method="post">
Num1: <input type="text" name="num1">
Num2: <input type="text" name="num2">

<input type="submit" value="Add">
<br>

<% 
if(request.getAttribute("result")!=null){
out.println(request.getAttribute("result"));
}
%>
</form>
</body>
</html>