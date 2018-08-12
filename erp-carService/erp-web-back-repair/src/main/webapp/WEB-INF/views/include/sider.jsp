<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 左侧菜单栏 -->
<aside class="main-sidebar">
    <section class="sidebar">
        <!-- 菜单 -->
        <ul class="sidebar-menu">
            <li class="header">维修任务</li>
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>维修任务</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/service/task"><i class="fa fa-circle-o"></i>维修任务列表</a></li>
                    <li><a href="/service/task/undone"><i class="fa fa-circle-o"></i>维修任务领取</a></li>
                    <li><a href="/service/task/history"><i class="fa fa-circle-o"></i>维修记录</a></li>
                </ul>
            </li>

            <li class="header">服务项目</li>
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>服务项目</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/service/list"><i class="fa fa-circle-o"></i>服务项目列表</a></li>
                    <li><a href="/service/report"><i class="fa fa-circle-o"></i>统计报表</a></li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<!-- =============================================== -->
    