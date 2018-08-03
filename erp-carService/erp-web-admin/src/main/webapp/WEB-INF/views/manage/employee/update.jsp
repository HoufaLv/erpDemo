<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>员工管理 | 更新员工</title>
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
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">更新员工信息</h3>
                </div>
                <div class="box-body">
                    <form  method="post" class="form-horizontal" id="updateRoleForm">
                        <div class="box-body">
                            <div class="form-group">
                                <label for="employeeName" class="col-sm-2 control-label">用户名</label>
                                <div class="col-sm-10">
                                    <input autofocus type="text" value="${employee.employeeName}" class="form-control" name="employeeName" id="employeeName" placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="employeeTel" class="col-sm-2 control-label">手机号</label>
                                <div class="col-sm-10">
                                    <input type="number" value="${employee.employeeTel}" class="form-control" name="employeeTel" id="employeeTel" placeholder="请输入手机号">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="employeeEmail" class="col-sm-2 control-label">邮箱</label>
                                <div class="col-sm-10">
                                    <input type="text" value="${employee.employeeEmail}" class="form-control" name="employeeEmail" id="employeeEmail" placeholder="请输入邮箱">
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">员工照片</label>
                                <div class="col-sm-10">

                                    <div class="box-body">
                                        <h4 style="background-color:#f7f7f7; font-size: 18px; text-align: center; padding: 7px 10px; margin-top: 0;">
                                            员工照片
                                        </h4>
                                        <div class="media">
                                            <div class="media-left">
                                                <h1>此处应该有正面照片</h1>
                                            </div>
                                            <div class="media-right">
                                                <h1>此处应该有背面照片</h1>
                                            </div>
                                            <div class="media-footer">
                                                <button class="btn btn-primary pull-right"> <i class="fa fa-fw fa-cloud-upload"></i>  &nbsp;上传照片</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label  class="col-sm-2 control-label">员工头像</label>
                                <div class="col-sm-10">

                                    <div class="box-body">
                                        <h4 style="background-color:#f7f7f7; font-size: 18px; text-align: center; padding: 7px 10px; margin-top: 0;">
                                            员工头像
                                        </h4>
                                        <div class="media">
                                            <div class="media-left">
                                                <h1>此处应该有用户头像</h1>
                                            </div>
                                            <div class="media-footer">
                                                <button class="btn btn-primary pull-right"> <i class="fa fa-fw fa-cloud-upload"></i>  &nbsp;上传头像</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">选择角色</label>
                                <%--将所有角色列表展示在这里，如果当前账户拥有某个角色，则打勾--%>
                                <div class="col-sm-10">
                                    <c:forEach items="${roleList}" var="role">
                                        <c:set var="flag" value="false"/>
                                        <c:forEach items="${employee.roleList}" var="employeeRole">
                                            <c:if test="${employeeRole.roleName == role.roleName}">
                                                <c:set var="flag" value="true"/>
                                            </c:if>
                                        </c:forEach>
                                            <input name="roleIds" type="checkbox" ${flag=='true'?'checked':''} value="${role.id}"/>&nbsp;&nbsp;${role.roleName} &nbsp;&nbsp;
                                    </c:forEach>
                                </div>

                            </div>
                        </div>
                        <!-- /.box-body -->
                        <!-- /.box-footer -->
                    </form>

                    <div class="box-footer">
                        <a href="/manage/employee" class="btn btn-default"><i class="fa fa-fw fa-arrow-left"></i> &nbsp;返回</a>
                        <button id="updateEmployeeBtn" class="btn btn-primary pull-right"> <i class="fa fa-fw fa-plus-square"></i>  &nbsp;更新员工</button>
                    </div>
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
        $("#updateEmployeeBtn").click(function () {
            $("#updateRoleForm").submit();
        });
    });
</script>
</body>
</html>