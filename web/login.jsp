<%@ page import="service.LoginService" %>
<%@ page import="service.impl.LoginServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="user1" class="domain.User"/>
<jsp:setProperty name="user1"   property="*"/>

<%
    if (request.getMethod().equals("POST")){
        LoginService loginService = new LoginServiceImpl();
        if(loginService.login(user1)&&user1.getSf().equals("1")){
            session.setAttribute("sno",user1.getId());
            response.sendRedirect("student_xiuxue.jsp");
        }
        if(loginService.login(user1)&&user1.getSf().equals("2")){

            response.sendRedirect("teacher_xiuxue.jsp");
        }
        if(loginService.login(user1)&&user1.getSf().equals("3")){

            response.sendRedirect("manager.jsp");
        }else out.print("<script>\n" +
                "    \n" +
                "    alert(\"密码错误\");\n" +
                "    \n" +
                "</script>");


    }


%>



<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>登陆</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->

    <style type="text/css">
        body{
            background:#32C2CD;
        }

    </style>
</head>

<body>
<div class="container" style="">

    <div class="row">
        <div class="col-lg-3 col-lg-offset-2" style=" height: 300px;margin-top: 100px;">
            <h1 style="font-size: 70px;color: #fff;text-shadow: 0.05em 0.05em gray">登陆 ...</h1>
            <hr>
            <h2 style="color: #fff;text-shadow: 0.05em 0.05em gray;font-variant: small-caps "><br>欢迎登陆学生信息管理系统</h2>
        </div>
        <div class="col-lg-5 col-lg-offset-2" style="box-shadow: gray 3px 3px 3px; height: 350px;margin-top: 100px; background: #E6E6E6;">
            <form action="login.jsp" method="post">
                <br> <br>
                <div class="form-group">
                    <label>账号</label>
                    <input class="form-control" name="id">

                </div>
                <div class="form-group">
                    <label>密码</label>
                    <input type="password" class="form-control" name="pwd">
                </div>
                <div class="form-group">
                    <label>身份选择</label>
                    <select class="form-control" name="sf">
                        <option value="1">学生</option>
                        <option value="2">教师</option>
                        <option value="3">管理员</option>
                    </select>                                        </div>

        <button class="btn btn-primary btn-lg" type="submit">登入</button>


            </form>
        </div>




    </div>
    <div class="row" style="text-align: center;margin-top: 160px;color: #fff;">

        学生信息管理系统&nbsp;&nbsp; Copyright © 2018  All Rights Reserved
    </div>

</div>

<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="assets/js/bootstrap.min.js"></script>

<!-- Metis Menu Js -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
<script src="assets/js/morris/morris.js"></script>


<script src="assets/js/easypiechart.js"></script>
<script src="assets/js/easypiechart-data.js"></script>

<script src="assets/js/Lightweight-Chart/jquery.chart.js"></script>

<!-- Custom Js -->
<script src="assets/js/custom-scripts.js"></script>


</body>

</html>