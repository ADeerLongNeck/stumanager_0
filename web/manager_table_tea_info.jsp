<%@ page import="domain.Teacher" %>
<%@ page import="service.TeaService" %>
<%@ page import="service.impl.TeaServiceImpl" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<% response.setContentType("text/html;charset=UTF-8"); %>
<%
    request.setCharacterEncoding("utf-8");
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>管理员后台</title>
    <!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Morris Chart Styles-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>

<body>

<jsp:useBean id="tea2" class="domain.Teacher"/>
<jsp:setProperty name="tea2"   property="*"/>
<%!
    Teacher teacher;

    public Teacher getData(int sno){

        TeaService stuService = new TeaServiceImpl();
        Teacher teacher=stuService.getTea(sno);

        return teacher;
    }
    public void pp(){
        System.out.println("222222222222222222222222222222222222");
    }
%>

<%
    if (request.getMethod().equals("POST")){
        request.setCharacterEncoding("utf-8");
        TeaService stuService = new TeaServiceImpl();
        if (tea2!=null){
            stuService.updateTea(tea2);
            out.println("<script>\n" +
                    "    alert(\""+tea2.getTname()+"老师的信息修改成功！\");\n" +
                    "</script>");
        }
        //   request.getRequestDispatcher("manager_table_stu_info.jsp?sno="+stu2.getSno()).forward(request, response);
        response.sendRedirect("manager_table_tea_info.jsp?sno="+tea2.getTno());

    }else{
        request.setCharacterEncoding("utf-8");
        int sno = Integer.parseInt(request.getParameter("sno"));
        teacher = getData(sno);

    }


%>




<div id="wrapper">
    <nav class="navbar navbar-default top-navbar" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><i class="fa fa-gear"></i> <strong>学生信息管理系统</strong></a>
        </div>

        <ul class="nav navbar-top-links navbar-right">


            <!-- /.dropdown -->
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">

                    <li class="divider"></li>
                    <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> 退出登录</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
    </nav>
    <!--/. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div id="sideNav" href=""><i class="fa fa-caret-right"></i></div>
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">


                <li>
                    <a href="manager.jsp"><i class="fa fa-dashboard"></i> 学生信息</a>
                </li>
                <li>
                    <a  class="active-menu" href="manager_teacher.jsp"><i class="fa fa-desktop"></i> 教师信息</a>
                </li>




            </ul>

        </div>

    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div id="page-inner">


            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        教师信息 <small>管理教师信息</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">后台</a></li>
                        <li><a href="#">全部教师信息</a></li>
                        <li class="active">具体信息</li>

                    </ol>
                </div>
            </div>


            <!-- /. ROW  -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            具体信息
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form role="form" method="post" action="manager_table_tea_info.jsp">

                                        <div class="form-group">
                                            <label>教师工号</label>
                                            <input id="tno" name="tno" class="form-control" value="<%= teacher.getTno() %>">

                                        </div>
                                        <div class="form-group">
                                            <label>姓名</label>
                                            <input id="tname" name="tname" class="form-control" value="<%= teacher.getTname() %>">

                                        </div>

                                        <div class="form-group">
                                            <label>所属学院</label>

                                            <select id="ssxy"  name="ssxy" class="form-control">
                                                <option <%if(teacher.getSsxy().equals("信息学院")) out.print("selected=\"selected\""); %> value="信息学院">信息学院</option>
                                                <option <%if(teacher.getSsxy().equals("土建学院")) out.print("selected=\"selected\""); %>  value="土建学院">土建学院</option>
                                                <option <%if(teacher.getSsxy().equals("外国语学院")) out.print("selected=\"selected\""); %>  value="外国语学院">外国语学院</option>
                                            </select>

                                        </div>

                                        <BUTTON class="btn btn-primary" type="submit">保存</BUTTON>
                                        <a class="btn btn-danger" href="del.jsp?no=<%=teacher.getTno()%>&table=tea">删除</a>
                                    </form>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /. ROW  -->


            <footer><p>后台·管理</p>


            </footer>
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->
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