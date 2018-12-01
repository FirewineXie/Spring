<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Firewine
  Date: 2018/11/27
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4> Success Page</h4>

time : ${requestScope.time}

<br><br>
names : ${requestScope.names}

<br><br>
user : ${requestScope.user}

<br><br>
session user : ${sessionScope.user}
<br><br>
school : ${requestScope.school}

<br><br>
session school : ${sessionScope.school}
<br><br>

<fmt:message key="i18n.username"></fmt:message>
<br><br>
<fmt:message key="i18n.password"></fmt:message>
</body>
</html>
