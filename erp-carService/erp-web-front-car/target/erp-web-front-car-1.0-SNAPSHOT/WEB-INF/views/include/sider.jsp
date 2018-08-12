<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 左侧菜单栏 -->
<aside class="main-sidebar">
    <section class="sidebar">
        <!-- 菜单 -->
        <ul class="sidebar-menu">
            <li class="header">系统功能</li>
            <!-- 汽车服务 -->
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-share-alt active"></i> <span>汽车服务</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/order/undone/list"><i class="fa fa-arrow-right"></i>订单查询</a></li>
                    <li><a href="/order/new"><i class="fa fa-arrow-right"></i>新增订单</a></li>
                </ul>
            </li>

            <!-- 客户服务 -->
            <li class="treeview active">
                <a href="#">
                    <i class="fa fa-child active"></i> <span>客户服务</span>
                    <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="/customer/list"><i class="fa fa-arrow-right"></i>客户查询</a></li>
                    <li><a href="/customer/new"><i class="fa fa-arrow-right"></i>新增客户</a></li>
                </ul>
            </li>

        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<!-- =============================================== -->
    