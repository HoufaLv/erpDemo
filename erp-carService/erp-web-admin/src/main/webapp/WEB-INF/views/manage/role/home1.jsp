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
            <h1>
               角色管理
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box-header">
                <h3 class="box-title">角色列表</h3>
                <div class="box-tools">
                    <a id="addRoleBtn" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#addPermissionModal"><i class="fa fa-plus"></i> 新增角色</a>
                </div>
            </div>
            <!-- Default box -->
            <div class="box">
                <div class="box-body">

                </div>
                <!-- /.box-body -->
            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->

        <%--新增角色模态框--%>
        <div class="modal fade bs-example-modal-sm" id="addPermissionModal" tabindex="-1" role="dialog"
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
                        <form method="post" id="addPermissionFrom" action="/manage/permission/new">
                            <div class="form-group">
                                <label>角色名称</label>
                                <input type="text" name="roleName" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>角色代号</label>
                                <input type="text" name="roleCode" class="form-control">
                            </div>

                            <%--将权限列表展示出来--%>
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

                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                        </button>
                        <button id="newRoleBtn" type="button" class="btn btn-primary">
                            新增权限
                        </button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>


    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../../include/footer.jsp"%>

</div>
<!-- ./wrapper -->

<%@ include file="../../include/js.jsp"%>
<script>

</script>
</body>
</html>