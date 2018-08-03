<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ERP | 账号管理</title>
    <%@include file="../../include/css.jsp"%>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="../../include/header.jsp"%>

    <!-- =============================================== -->

    <jsp:include page="../../include/sider.jsp">
        <jsp:param name="menu" value="manage_employee"/>
    </jsp:include>

    <!-- =============================================== -->

    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                账号管理
            </h1>
            <c:if test="${not empty message}">
                ${message}
            </c:if>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box box-primary">
                <div class="box-body">
                    <form class="form-inline">
                        <input id="nameMobile" type="text" name="nameMobile" placeholder="账号或手机号码" class="form-control" value="${param.nameMobile}">
                        <select name="roleId" class="form-control">
                            <option value="" id="allType">所有账号</option>
                            <option value="" >test</option>
                        </select>
                        <button class="btn btn-primary">搜索</button>
                        <button id="resetSearchBtn" class="btn btn-default">重置</button>
                    </form>
                </div>
            </div>

            <div class="box box-primary">
                <div class="box-header">
                    <div class="box-tools">
                            <a href="/manage/employee/new" class="btn btn-primary btn-sm">
                                <i class="fa fa-plus"></i> 新增员工
                            </a>
                    </div>
                </div>
                <div class="box-body">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>账号</th>
                            <th>手机号码</th>
                            <th>角色</th>
                            <th>状态</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${employeeList}" var="employee">
                                <tr>
                                    <td>${employee.employeeName}</td>
                                    <td>${employee.employeeTel}</td>
                                    <td><c:forEach items="${employee.roleList}" var="role">
                                        ${role.roleName}
                                    </c:forEach></td>
                                    <td>${employee.employeeState=="2"?'正常':"禁用"}</td>
                                    <td>
                                        <a href="/manage/employee/update/${employee.id}" class="btn btn-success btn-xs">更新</a>
                                        <a rel="${employee.id}"  class="btn btn-danger btn-xs deleteEmployeeBtn">删除</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
</div>
<!-- ./wrapper -->

<%@include file="../../include/js.jsp"%>
<script>

    $(function () {
        $(".deleteEmployeeBtn").click(function () {
            var id = $(this).attr("rel");
            console.log(id);
            $.ajax({
                type:"GET",
                url:"/manage/employee/delete/"+id,
                success:function (res) {
                    if (res.status=="0") {
                        layer.msg("删除成功",{icon:1,time:1000},function () {
                            history.go(0);
                        });
                    }else{
                        layer.msg(res.data.message);
                    }
                },
                error:function () {
                    layer.msg("系统异常，请稍后再试！");
                }
            });
        });

        $("#resetSearchBtn").click(function () {
            $("#nameMobile").val("");
            $("#allType").attr("select");
        });
    });
</script>
</body>
</html>