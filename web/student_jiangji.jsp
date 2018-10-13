<%@ page import="service.XiuXueService" %>
<%@ page import="service.impl.XiuXueServiceImpl" %>
<%@ page import="domain.XiuXue" %>
<%@ page import="java.util.List" %>
<%@ page import="service.JiangjiService" %>
<%@ page import="service.impl.JiangjiServiceImpl" %>
<%@ page import="domain.Jiangji" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>学生</title>
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
                    <a  href="student_xiuxue.jsp"><i class="fa fa-bar-chart-o"></i>休学管理</a>
                </li>
                <li>
                    <a  href="student_fuxue.jsp"><i class="fa fa-qrcode"></i>复学管理</a>
                </li>

                <li>
                    <a class="active-menu"  href="student_jiangji.jsp"><i class="fa fa-table"></i>降级管理</a>
                </li>

                <li>
                    <a  href="ruxue.jsp"><i class="fa fa-bar-chart-o"></i>入学登记</a>
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
                        降级管理 <small>管理降级信息</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">后台</a></li>
                        <li class="active">全部降级信息</li>
                    </ol>
                </div>
            </div>


            <!-- /. ROW

            <div class="row">
                <div class="col-md-12">
                    <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            数据
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>

                                        <th>学号</th>
                                        <th>学生</th>

                                        <th>审核状态</th>

                                    </tr>
                                    </thead>
                                    <tbody>
                                    <%
                                        int sno = (int) session.getAttribute("sno");
                                        JiangjiService jiangjiService = new JiangjiServiceImpl();
                                        Jiangji item = jiangjiService.get(sno);
                                        if(item!=null){
                                            //  System.out.println(item.toString());
                                            out.print(" <tr>\n" +
                                                    "                                        <td><a href=\"student_table_jiangji_info.jsp?sno="+item.getSno()+"\">"+item.getSno()+"</a></td>\n" +
                                                    "                                        <td>"+item.getSname()+"</td>\n" +

                                                    "                                        <td>"+item.getShzt()+"</td>\n" +
                                                    "                                    </tr>");
                                        }




                                    %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
            <%

                JiangjiService jiangjiService2 = new JiangjiServiceImpl();
                Jiangji item2 = jiangjiService.get(sno);
                if (item2==null){
                    out.print("   <a href=\"http://localhost:8080/student_table_jiangji_info.jsp?sno=1\" class=\"btn btn-primary\">申请降级</a>");
                }


            %>
                    <!-- End  Kitchen Sink -->
                </div>
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