<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.spring.struts2.beans.Person" %><%--
  Created by IntelliJ IDEA.
  User: xyjwork
  Date: 2018/11/13
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <%
   //1. 从application 域对象中得到IOC容器的实例
   ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
   //2. 从IOC容器中得到bean
   Person person = context.getBean(Person.class);
   //3. 使用bean
   person.hello();
 %>
  </body>
</html>
