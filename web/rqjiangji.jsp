<%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/16 0016
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String sno = request.getParameter("sno"); out.print("<script>\n" +
        "    \n" +
        "    alert("+sno+");\n" +
        "</script>");   %>
