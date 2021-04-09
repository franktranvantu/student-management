<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="${contextPath}/resources/css/student.css">
</head>
<body>
    <h1>Student Management</h1>
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
            <td colspan="2">Actions</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.mobile}</td>
                <td>${student.country}</td>
                <td><a href="show-update-student/${student.id}">Update</a></td>
                <td><a href="delete-student/${student.id}" onclick="if (!confirm('Are you sure you want to delete this student?')) return false">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
