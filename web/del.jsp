<%@ page import="service.impl.StuServiceImpl" %>
<%@ page import="service.StuService" %>
<%@ page import="domain.Student" %>
<%@ page import="service.TeaService" %>
<%@ page import="service.impl.TeaServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
int no = Integer.parseInt(request.getParameter("no"));
String table = request.getParameter("table");
StuService stuService = new StuServiceImpl();
if(table.equals("stu")){
    Student student = new Student();
    student.setSno(no);
    stuService.deleteStudent(student);
    response.sendRedirect("manager.jsp");
}
    if(table.equals("tea")){
        TeaService teaService = new TeaServiceImpl();
        teaService.deleteTea(no);
        response.sendRedirect("manager_teacher.jsp");
    }





%>