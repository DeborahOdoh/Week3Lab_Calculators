<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 4:25:34 AM
    Author     : odohd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <p>${result}</p>
        <a href="arithmetic" class="arithmetic">Arithmetic Calculator</a>
            
    </body>
</html>