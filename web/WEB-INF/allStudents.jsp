<%--
  Created by IntelliJ IDEA.
  User: Sora
  Date: 2019/8/24
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>所有学生</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/studentsList" method="post">
    <table border="1">
        <tr>
            <td colspan="8">
                按姓名查询: <input type="text" name="sname">
                按性别查询:
                <select name="gender">
                    <option value="">please choose</option>
                    <option value="man">man</option>
                    <option value="woman">woman</option>
                </select>
                &nbsp;
                <input type="submit" value="query">
                <a href="../addStudent.jsp">添加</a>
            </td>
        </tr>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>gender</td>
            <td>phone</td>
            <td>birthday</td>
            <td>bobby</td>
            <td>info</td>
            <td>operate</td>
        </tr>

        <c:forEach items="${ students }" var="stu">
            <tr>
                <td>${stu.sid}</td>
                <td>${stu.sname}</td>
                <td>${stu.gender}</td>
                <td>${stu.phone}</td>
                <td>${stu.birthday}</td>
                <td>${stu.bobby}</td>
                <td>${stu.info}</td>
                <td>
                    <a href="editStudentControl?sid=${stu.sid}">update</a>
                    <a href="${pageContext.request.contextPath}/deleteStudent?sid=${stu.sid}">delete</a>
                </td>
            </tr>
            <%----%>
            <%--<tr>--%>
                <%--<td colspan="8">--%>
                    <%--第${pageBean.currentPage}/${pageBean.totalPage}页--%>
                    <%--每页显示 ${pageBean.pageSize}条--%>
                    <%--总记录数 ${pageBean.totalSize}--%>
                        <%--&lt;%&ndash;如果不在第一页，那么有首页，可以跳转过去。如果在第一页，没有首页两个字&ndash;%&gt;--%>
                    <%--<c:if test="${pageBean.currentPage != 1}">--%>
                        <%--<a href="StudentListServlet02?currentPage=1">首页</a>--%>
                        <%--<a href="StudentListServlet02?currentPage=${pageBean.currentPage-1}">上一页</a>--%>
                    <%--</c:if>--%>
                    <%--<c:forEach begin="1" end="${pageBean.totalPage}" var="i">--%>
                        <%--<c:if test="${pageBean.currentPage == i}">--%>
                            <%--${i}--%>
                        <%--</c:if>--%>
                        <%--<c:if test="${pageBean.currentPage != i}">--%>
                            <%--<a href="StudentListServlet02?currentPage=${i}">${i}</a>--%>
                        <%--</c:if>--%>
                    <%--</c:forEach>--%>

                        <%--&lt;%&ndash;只要不在最后一页，那么就有下一页,有尾页&ndash;%&gt;--%>
                    <%--<c:if test="${pageBean.currentPage != pageBean.totalPage}">--%>
                        <%--<a href="StudentListServlet02?currentPage=${pageBean.currentPage+1}">下一页</a>--%>
                        <%--<a href="StudentListServlet02?currentPage=${pageBean.totalPage}">尾页</a>--%>
                    <%--</c:if>--%>
                <%--</td>--%>
            <%--</tr>--%>
        </c:forEach>
    </table>
</form>
</body>
</html>