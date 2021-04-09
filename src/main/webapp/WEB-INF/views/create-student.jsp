<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h1 align="center">${action} Student</h1>
    <div align="center">
        <form:form action="${contextPath}/save-student" method="post" modelAttribute="student">
            <form:hidden path="id" />
            <p>
                <label for="name">Name:</label>
                <from:input path="name" id="name" />
            </p>
            <p>
                <label for="mobile">Mobile:</label>
                <from:input path="mobile" id="mobile" />
            </p>
            <p>
                <label for="country">Country:</label>
                <from:input path="country" id="country" />
            </p>
            <p>
                <button>${action}</button>
            </p>
        </form:form>
    </div>
</body>
</html>
