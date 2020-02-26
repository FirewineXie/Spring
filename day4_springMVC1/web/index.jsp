<%--
  Created by IntelliJ IDEA.
  User: Firewine
  Date: 2018/11/27
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>



  <a href="helloworld">Hello World</a>

  <br><br>

  <a href="springmvc/testtestRequestMapping">testRequestMapping</a>

  <br><br>

  <a href="springmvc/testMethod">test Method</a>

  <br><br>
  <form action="springmvc/testMethod" method="POST">
    <input type="submit" value="submit">
  </form>
  <br><br>

  <a href="springmvc/testParamsAndHeaders?username=sss&age=10">testParamsAndHeaders</a>


  <br><br>

  <a href="springmvc//testAntPath/mmnvc/abc">testAntPath</a>

  <br><br>

  <a href="springmvc/testPathVariable/1">test PathVariable </a>


  <br><br>
  <a href="springmvc/testRest/1">Test Rest GET</a>


  <br><br>
  <form method="post" action="springmvc/testRest">
    <input type="submit"  value="TestTest POST">

  </form>


  <br><br>

  <form action="springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="TestRest PUT"/>
  </form>
  <br><br>

  <form action="springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="TestRest DELETE"/>
  </form>
  <br><br>

  <a href="springmvc/testRequestParam?username=ssh&age=11">Test testRequestParam</a>
  <br><br>

  <a href="springmvc/testRequestHeader">Test testRequestHeader</a>

  <br><br>

  <a href="springmvc/testCookieValue">Test testCookieValue</a>

  <br><br>

 <form action="springmvc/testPojo" method="post">
   username : <input type="text" name="username">
   <br>
   password : <input type="password" name="password">
   <br>
   email : <input type="text" name="email">

   <br>
   age : <input type="text" name="age">

   <br>
   city : <input type="text" name="address.city">

   <br>
   province : <input type="text" name="address.province">

   <br>
   <input type="submit" value="Submit">
 </form>
<br><br>

<a href="springmvc/testServletAPI">Test ServletAPI</a>
<br><br>
  <a href="springmvc/testModelAndView">Test ModelAndView</a>

  <br><br>
  <a href="springmvc/testMap">Test  testMap</a>

  <br><br>
  <a href="springmvc/testSessionAttributes">Test  testSessionAttributes</a>

<br><br>
  <!--
      模拟修改操作
      1. 原始数据 ： 1， Tom，123456，tom@121.com ，12
      2. 密码不能修改，
      4. 表单回显，模拟操作直接在表达填写对应的属性值

  -->
  <form action="springmvc/testModelAttribute" method="Post">
    <input type="hidden" name="id" value="1"/>
    username: <input type="text" name="username" value="Tom"/>
    <br>
    email: <input type="text" name="email" value="tom@121.com"/>
    <br>
    age: <input type="text" name="age" value="12"/>
    <br>
    <input type="submit" value="Submit"/>
  </form>
  <br><br>
  <a href="springmvc/testViewAndViewResolver">Test  testViewAndViewResolver</a>

  <br><br>
  <a href="springmvc/testView">Test testView</a>

  <br><br>
  <a href="springmvc/testRedirect">Test testRedirect</a>
  </body>
</html>
