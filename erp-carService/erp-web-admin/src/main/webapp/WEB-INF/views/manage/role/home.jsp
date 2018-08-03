<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>系统管理 | 角色管理</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../../include/css.jsp"%>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
    <%@ include file="../../include/header.jsp"%>
    <jsp:include page="../../include/sider.jsp">
        <jsp:param name="menu" value="home"/>
    </jsp:include>
    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">

        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">角色列表</h3>
                    <div class="box-tools">
                        <a id="addRoleBtn" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#addPermissionModal"><i class="fa fa-plus"></i> 新增角色</a>
                    </div>
                </div>

                <div class="box-body">
                    <%--展示所有角色--%>
                    <table class="table table-hover">
                        <tbody>
                            <c:forEach items="${roleList}" var="role" >
                                <tr class="bg-gray" rel="${role.id}">
                                    <td>
                                        角色名称：<strong>${role.roleName}</strong>
                                        <span class="pull-right">
                                            <a href="/manage/role/update/${role.id}" class="btn btn-success btn-xs updateRoleBtn">编辑</a>
                                            <a rel="${role.id}" class="btn btn-danger btn-xs deleteRoleBtn">删除</a>
                                        </span>
                                    </td>
                                </tr>
                                <tr class="bg-gray-light">
                                    <td>
                                        拥有权限：<c:forEach items="${role.permissionList}" var="permission">
                                        ${permission.permissionName} <span>--</span>
                                    </c:forEach>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->

                <%--新增角色模态框--%>
                <div class="modal modal fade bs-example-modal-sm" id="addPermissionModal" tabindex="-1" role="dialog"
                     aria-labelledby="myModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title" id="myModalLabel">
                                    <b>新增角色</b>
                                </h4>

                                <h5 class="modal-title" id="myModalLabel1">
                                    <small>按下ESC 键退出</small>
                                </h5>
                            </div>
                            <div class="modal-body">
                                <form method="post" id="addPermissionFrom">
                                    <div class="form-group">
                                        <label>角色名称</label>
                                        <input type="text" name="roleName" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>角色代号</label>
                                        <input type="text" name="roleCode" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>权限列表</label>
                                    </div>
                                    <div>
                                        <div class="box-body">
                                            <table class="table tree" id="permissionTable">
                                                <thead>
                                                <%--表头--%>
                                                <tr>
                                                    <th>权限名称</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                </button>
                                <button id="newRoleBtn" type="button" class="btn btn-primary">
                                    新增角色
                                </button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal -->
                </div>


            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->


        <%--新增角色模态框--%>


    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../../include/footer.jsp"%>

</div>
<!-- ./wrapper -->

<%@ include file="../../include/js.jsp"%>
<script>
    $(function () {
        //添加角色，弹出模态框，将json 中的数据填充到页面上
        $("#addRoleBtn").click(function () {
            $("#permissionTable").empty();
            $.ajax({
                type:"GET",
                url:"/manage/role/new",
                success:function (res) {

                    console.log(res.data); //data 是一个数组，迭代数组获得树形,将树形结构显示在页面上
                    $.each(res.data,function (k, v) {
                        console.log(v.permissionName + "->" + v.id + "->" + v.parentId);
                        //模态框中已经有表头，现在只需要动态生成tr，追加到table 上去
                        var $id = v.id;
                        if (v.parentId == 0) {
                            //创建元素
                            var $tr = $("<tr></tr>");
                            //添加属性
                            $tr.addClass("treegrid-"+v.id+" treegrid-expanded");

                            //创建两个td 元素
                            var $td = $("<td>"+v.permissionName+"</td>");
                            var $tdCheck = $("<td></td>");
                            var $check = $("<input> </input>");
                            $check.attr({
                                type:"checkbox",
                                name:"permissionId",
                                value:v.id
                            });

                            //组建复选框元素
                            $tdCheck.append($check);

                            $tr.append($tdCheck);
                            $tr.append($td);

                            $("#permissionTable").append($tr)

                        }else{
                            var $tr = $("<tr></tr>");
                            $tr.addClass("treegrid-"+v.id+" treegrid-expanded "+"treegrid-parent-"+v.parentId);
                            var $td = $("<td>"+v.permissionName+"</td>");

                            var $tdCheck = $("<td></td>");
                            var $check = $("<input> </input>");
                            $check.attr({
                                type:"checkbox",
                                name:"permissionId",
                                value:v.id
                            });

                            //组建复选框元素
                            $tdCheck.append($check);

                            $tr.append($tdCheck);
                            $tr.append($td);

                            $("#permissionTable").append($tr)
                        }
                    });

                },
                error:function () {
                    layer.msg("系统异常，请稍后再试！");
                }
            });
        });

        //添加角色，将form 中的数据 提交到后台
        $("#newRoleBtn").click(function () {
            $.ajax({
                type: 'POST',
                datatype: 'text',
                url: "/manage/role/new",
                //将表单内容序列化成一个字符串，如下：username=wwc&password=wwc，如果是post请求，那么这串字符串就以请求体的方式传递给后端action
                data: $("#addPermissionFrom").serialize(),
                conentType: 'application/x-www-from-urlencoded',
                datatype: "json",
                success: function (res) {
                    if (res.status == '0') {
                        layer.msg(res.message,{icon:1,time:1000},function () {
                            history.go(0);
                        })
                    }else
                    {
                        layer.msg(res.message);
                    }
                },
                error: function () {
                    layer.msg("系统异常");
                }

            });
        });

        //删除角色
        $(".deleteRoleBtn").click(function () {
            var id = $(this).attr("rel");
            $.ajax({
                type:"GET",
                url:"/manage/role/delete/"+id,
                success:function (res) {
                    if (res.status=="0") {
                        layer.msg("删除成功",{icon:1,time:1000},function () {
                            history.go(0);
                        });
                    }else{
                        layer.msg(res.message);
                    }
                },
                error:function () {
                    layer.msg("系统异常，请稍后再试！");
                }
            });
        });
    });
</script>
</body>
</html>