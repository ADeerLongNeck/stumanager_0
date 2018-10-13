<%@ page import="service.StuService" %>
<%@ page import="service.impl.StuServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
int id = Integer.parseInt(request.getParameter("id"));
    StuService stuService = new StuServiceImpl();
    stuService.dengji(id);
    out.print("<script>\n" +
            "    \n" +
            "    alert(\"登记成功!\");\n" +
            "</script>");

    out.print("<a href=\"student_fuxue.jsp\">返回</a>");

%>

