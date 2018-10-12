<%@ page import="service.StuService" %>
<%@ page import="service.impl.StuServiceImpl" %>
<%@ page import="domain.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/12 0012
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




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


<jsp:useBean id="stu" class="domain.Student"/>
<jsp:setProperty name="stu"   property="*"/>
<%
   // out.print("=================="+stu.getSname());

if (request.getMethod().equals("POST")){
    StuService stuService = new StuServiceImpl();
    if (stu!=null){
        stuService.addStudent(stu);
        out.println("<script>\n" +
                "    alert(\""+stu.getSname()+"同学的信息添加成功！\");\n" +
                "</script>");
    }

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
                    <a class="active-menu" href="manager.jsp"><i class="fa fa-dashboard"></i> 学生信息</a>
                </li>
                <li>
                    <a href="manager_teacher.html"><i class="fa fa-desktop"></i> 教师信息</a>
                </li>
                <li>
                    <a href="chart.html"><i class="fa fa-bar-chart-o"></i>休学管理</a>
                </li>
                <li>
                    <a href="tab-panel.html"><i class="fa fa-qrcode"></i>复学管理</a>
                </li>

                <li>
                    <a href="table.html"><i class="fa fa-table"></i>降级管理</a>
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
                        学生信息 <small>添加学生信息</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">后台</a></li>
                        <li><a href="#">全部学生信息</a></li>
                        <li class="active">添加学生信息</li>

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
                                    <form role="form" action="addstu.jsp" method="post">

                                        <div class="form-group">
                                            <label>学号</label>
                                            <input id="sno" name="sno" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>学生姓名</label>
                                            <input id="sname" name="sname"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>专业</label>
                                            <input id="szy"  name="szy" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>学院</label>
                                            <input id="sxy"  name="sxy" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>出生年月日</label>
                                            <input id="csdate" name="csdate"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>入学年份</label>
                                            <input id="rxdate" name="rxdate"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>毕业年份</label>
                                            <input id="bydate" name="bydate"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>政治面貌</label>
                                            <input id="zzmm" name="zzmm"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>家庭住址</label>
                                            <input id="jtzz"  name="jtzz" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>民族</label>
                                            <input id="mz"  name="mz" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>监护人及联系方式</label>
                                            <input id="jhr"  name="jhr" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>性别</label>
                                            <input id="sex"  name="sex" class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>身份证号</label>
                                            <input id="sfzno" name="sfzno"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>联系方式</label>
                                            <input id="phone" name="phone"  class="form-control">

                                        </div>
                                        <div class="form-group">
                                            <label>备注</label>
                                            <input id="extra"  name="extra" class="form-control">

                                        </div>
                                        <BUTTON type="submit"  class="btn btn-primary">添加</BUTTON>


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