<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/servlet" method="get">
    <h1>Calculator</h1>
    <table>
        <tr>
            <td>Num 1</td>
            <td>
                <input type="number" name="num1" value="${num1}">
            </td>
        </tr>
        <tr>
            <td>Num 2</td>
            <td>
                <input type="number" name="num2" value="${num2}">
            </td>
        </tr>
        <tr>
            <td>Select</td>
            <td>
                <select name="op">
                    <option>+</option>
                    <option>-</option>
                    <option>*</option>
                    <option>/</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit" name="">Result</button>
            </td>
        </tr>
        <tr>
            <td>Result</td>
            <td>
                <input type="text" value="${result }">
            </td>
        </tr>
    </table>
</form>
</body>
</html>