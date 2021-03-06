<%@ page import="domain.XiuXue" %>
<%@ page import="service.XiuXueService" %>
<%@ page import="service.impl.XiuXueServiceImpl" %>
<%@ page import="domain.FuXue" %>
<%@ page import="service.FuXueService" %>
<%@ page import="service.impl.FuXueServiceImpl" %>
<%@ page import="domain.Jiangji" %>
<%@ page import="service.JiangjiService" %>
<%@ page import="service.impl.JiangjiServiceImpl" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Li
  Date: 2018/10/13 0013
  Time: 1:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("utf-8");
%>

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


<jsp:useBean id="fu" class="domain.XiuXue"/>
<jsp:setProperty name="fu"   property="*"/>
<%!
    XiuXue jiangji;
    int sno2;
//
//    public  XiuXue getData(int sno){
//
//        XiuXueService fuXueService = new  XiuXueServiceImpl();
//        XiuXue fuXue= fuXueService.get(sno);
//
//        return fuXue;
//    }
    public void pp(){
        System.out.println("222222222222222222222222222222222222");
    }
%>

<%
    if (request.getMethod().equals("POST")){
        request.setCharacterEncoding("utf-8");
        XiuXueService fuXueService = new XiuXueServiceImpl();
        if (fu!=null){
            fu.setSno(Integer.parseInt(String.valueOf(session.getAttribute("sno"))));
            if(fuXueService.applyXiuxue(fu)){
                response.sendRedirect("student_xiuxue.jsp");
            }
            else out.print("<script>\n" +
                    "    alert(\"已经在休学状态中，不可申请！\");\n" +
                    "</script>");
        }
        //   request.getRequestDispatcher("manager_table_stu_info.jsp?sno="+stu2.getSno()).forward(request, response);


    }else{
        request.setCharacterEncoding("utf-8");
        int sno = Integer.parseInt(request.getParameter("sno"));
     //  jiangji = getData(sno);
       sno2= Integer.parseInt(request.getParameter("sno"));

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
                    <a class="active-menu"    href="student_xiuxue.jsp"><i class="fa fa-bar-chart-o"></i>休学管理</a>
                </li>
                <li>
                    <a href="student_fuxue.jsp"><i class="fa fa-qrcode"></i>复学管理</a>
                </li>

                <li>
                    <a href="student_jiangji.jsp"><i class="fa fa-table"></i>降级管理</a>
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
                        休学管理 <small>申请休学</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">后台</a></li>
                        <li><a href="#">全部休学信息</a></li>
                        <li class="active">具体信息</li>

                    </ol>
                </div>
            </div>


            <!-- /. ROW  -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           申请休学
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form role="form" action="student_table_xiuxue_info.jsp" method="post">



                                        <div class="form-group">
                                            <label>学号</label>
                                            <input id="sno" disabled="disabled" name="sno" class="form-control" value="<%=session.getAttribute("sno")%>" >

                                        </div>


                                        <div class="form-group">
                                            <label>申请原因</label>
                                            <input id="sqyy"  name="sqyy" class="form-control"  value="">

                                        </div>
                                        <%
                                            Date d = new Date();
                                            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                                            String now = df.format(d);
                                        %>
                                        <div class="form-group">

                                            <input id="sqdate" type="hidden"    name="sqdate" class="form-control"  value="<%=now%>">

                                        </div>

                                        <div class="form-group">
                                            <label>复学日期</label>
                                            <input id="fxdate" type="date"  name="fxdate" class="form-control"  value="">
                                        </div>

                                        <div class="form-group">

                                            <input id="shzt"  name="shzt" class="form-control"  value="待审核"  type="hidden">

                                        </div>
                                        <input id="shren"  name="shren" class="form-control"  value="无"  type="hidden">
                                        <input id="shbz"  name="shbz" class="form-control"  value="无"  type="hidden">
                                        <button  type="submit" class="btn btn-primary">保存</button>

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