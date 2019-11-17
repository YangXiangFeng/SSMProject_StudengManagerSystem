<%@ page import="pojo.Student" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Sora
  Date: 2019/8/27
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Update Information</title>
</head>
<body>
<form method="post" action="/updateStudentControl">
    <table border="1">
        <tr>
            <input type="hidden" name="sid" value="${ student.sid }">
        </tr>

        <tr>
            <td>name</td>
            <td><input type="text" name="sname" value="${ student.sname }"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="update"></td>
        </tr>
    </table>
</form>
</body>
</html>