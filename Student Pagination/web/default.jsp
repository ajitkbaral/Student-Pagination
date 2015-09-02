<%-- 
    Document   : default
    Created on : Apr 7, 2015, 7:11:22 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! This is the default.jsp page. This page shows pagination functionality</h1>
        <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <th>ID</th>
            <th>Std First Name</th>
            <th>Std Last Name</th>
            <th>Std Email</th>
            <th>Std Phone</th>
        </tr>
 
        <c:forEach var="student" items="${requestScope.studentList}">
            <tr>
                <td>${student.getId()}</td>
                <td>${student.getFirstName()}</td>
                <td>${student.getLastName()}</td>
                <td>${student.getEmail()}</td>
                <td>${student.getPhone()}</td>
            </tr>
        </c:forEach>
    </table>
 
    <%--For displaying Previous link except for the 1st page --%>
    <c:if test="${requestScope.currentPage != 1}">
        <td><a href="?page=${requestScope.currentPage - 1}">Previous</a></td>
    </c:if>
 
    <%--For displaying Page numbers. 
    The when condition does not display a link for the current page--%>
    <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <c:forEach begin="1" end="${requestScope.noOfPages}" var="i">
                <c:choose>
                    <c:when test="${requestScope.currentPage eq i}">
                        <td>${i}</td>
                    </c:when>
                    <c:otherwise>
                        <td><a href="?page=${i}">${i}</a></td>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </tr>
    </table>
     
    <%--For displaying Next link --%>
    <c:if test="${requestScope.currentPage lt requestScope.noOfPages}">
        <td><a href="?page=${requestScope.currentPage + 1}">Next</a></td>
    </c:if>
    </body>
</html>
