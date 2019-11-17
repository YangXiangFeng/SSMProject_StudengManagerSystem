<%--
  Created by IntelliJ IDEA.
  User: Sora
  Date: 2019/8/26
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h3>添加学生页面</h3>
<form method="post" action="addStudentControl">
    <table border="1">
        <tr>
            <td>id</td>

            <td><input type="text" name="sid"></td>
        </tr>
        <tr>
            <td>name</td>

            <td><input type="text" name="sname"></td>
        </tr>
        <tr>
            <td>gender</td>
            <td>
                <input type="radio" name="gender" value="man">man
                <input type="radio" name="gender" value="woman">woman
            </td>
        </tr>
        <tr>
            <td>phone</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>birthday</td>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <td>hobby</td>
            <td>
                <input type="checkbox" name="hobby" value="swimming">swimming
                <input type="checkbox" name="hobby" value="writing">writing
            </td>
        </tr>
        <tr>
            <td>info</td>
            <td>
                <input type="<textarea>" name="info" cols="30" rows="3"></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="add"></td>
        </tr>
    </table>
</form>
</body>
</html>