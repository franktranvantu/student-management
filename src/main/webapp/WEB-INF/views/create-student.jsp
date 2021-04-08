<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h1 align="center">Add Student</h1>
    <div align="center">
        <form:form action="create-student" method="post" modelAttribute="student">
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
                <button>Create</button>
            </p>
        </form:form>
    </div>
</body>
</html>
