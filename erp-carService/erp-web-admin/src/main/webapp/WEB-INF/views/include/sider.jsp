<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 左侧菜单栏 -->
<aside class="main-sidebar">
    <section class="sidebar">
        <!-- 菜单 -->
        <ul class="sidebar-menu">
            <li class="header">系统功能</li>
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>系统管理</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/manage/employee"><i class="fa fa-circle-o"></i>账户管理</a></li>
                    <li><a href="/manage/permission"><i class="fa fa-circle-o"></i>权限管理</a></li>
                    <li><a href="/manage/role"><i class="fa fa-circle-o"></i>角色管理</a></li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<!-- =============================================== -->
    