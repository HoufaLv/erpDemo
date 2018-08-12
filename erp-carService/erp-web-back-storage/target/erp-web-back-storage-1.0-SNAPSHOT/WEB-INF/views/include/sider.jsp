<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 左侧菜单栏 -->
<aside class="main-sidebar">
    <section class="sidebar">
        <!-- 菜单 -->
        <ul class="sidebar-menu">
            <li class="header">系统功能</li>

            <!-- 库存管理 -->
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-home"></i> <span>库存管理</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/storage/parts"><i class="fa fa-circle-o"></i>配件管理</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>类型管理</a></li>
                    <li><a href="/storage/parts/new"><i class="fa fa-circle-o"></i>配件入库</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>入库查询</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>出库查询</a></li>
                </ul>
            </li>

            <!-- 统计报表 -->
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>统计报表</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="#"><i class="fa fa-circle-o"></i>报表统计</a></li>
                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<!-- =============================================== -->
    