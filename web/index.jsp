<%@ page import="service.StuService" %>
<%@ page import="service.impl.StuServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="domain.Student" %>


<%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/12 0012
  Time: 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%

    %>
  </head>
  <body>
   <%

       StuService stuService = new StuServiceImpl();
       List<Student> list = stuService.getStudent();
       for (Student item : list) {
         //  System.out.println(item.toString());
           out.print(item.getSname());

       }
   %>

  </body>
</html>
