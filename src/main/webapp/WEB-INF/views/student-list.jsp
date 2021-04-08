<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h1 align="center">Student Management</h1>
    <div align="center">
        <form action="show-create-student">
            <button>Create Student</button>
        </form>
        <table border="1">
            <thead>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Mobile</td>
                <td>Country</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.mobile}</td>
                    <td>${student.country}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
