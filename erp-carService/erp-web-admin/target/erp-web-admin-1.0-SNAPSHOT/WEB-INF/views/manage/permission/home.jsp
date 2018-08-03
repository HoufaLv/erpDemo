<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>系统管理 | 权限管理</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

    <%@ include file="../../include/css.jsp" %>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
    <%@ include file="../../include/header.jsp" %>
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
                <div class="box">
                    <div class="box-header">
                        <h3 class="box-title">权限列表</h3>
                        <div class="box-tools">
                            <button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">新增权限
                            </button>
                        </div>
                    </div>
                    <div class="box-body">
                            <table class="table tree">
                                <thead>
                                <%--表头--%>
                                    <tr>
                                        <th>权限名称</th>
                                        <th>权限代号</th>
                                        <th>资源URL</th>
                                        <th>类型</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>

                                <tbody>
                                <%--解析表体，将数据一行一行解析出来--%>
                                <c:forEach items="${permissionList}" var="permission">
                                    <c:choose>
                                        <c:when test="${permission.parentId==0}">
                                            <tr class="treegrid-${permission.id} treegrid-expanded">
                                                <td>${permission.permissionName}</td>
                                                <td>${permission.permissionCode}</td>
                                                <td>${permission.url}</td>
                                                <td>${permission.permissionType}</td>
                                                <td>
                                                    <a class="btn btn-success btn-xs permissionUpdateBtn" rel="${permission.id}"  >编辑</a>
                                                    <a class="btn btn-danger btn-xs permissionDeleteBtn" rel="${permission.id}"  href="javascript:;">删除</a>
                                                </td>
                                            </tr>
                                        </c:when>
                                        <c:otherwise>
                                            <tr class="treegrid-${permission.id} treegrid-expanded treegrid-parent-${permission.parentId}">
                                                <td>${permission.permissionName}</td>
                                                <td>${permission.permissionCode}</td>
                                                <td>${permission.url}</td>
                                                <td>${permission.permissionType}</td>
                                                <td>
                                                    <a class="btn btn-success btn-xs permissionUpdateBtn" rel="${permission.id}" >编辑</a>
                                                    <a class="btn btn-danger btn-xs permissionDeleteBtn" rel="${permission.id}"  href="javascript:;">删除</a>
                                                </td>
                                            </tr>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>

                                </tbody>
                            </table>
                    </div>
                </div>
            </div>
            <!-- /.box -->


            <div class="modal fade bs-example-modal-sm" id="updatePermissionModal" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title">
                                <b>更新权限</b>
                            </h4>

                            <h5 class="modal-title">
                                <small>按下ESC 键退出</small>
                            </h5>
                        </div>
                        <div class="modal-body">
                            <form method="post" id="updatePermissionFrom">
                                <%--将table这一行的id 插入隐藏域中去,拿隐藏域的id 和后台传过来的id 进行比较--%>
                                <%--这种方案是不可行的，暂时不考虑这种解决方案--%>
                                <%--<input id="permissionIdTr" type="text" value="">--%>
                                <input type="text" id="permissionIdTr" hidden="hidden" name="id">
                                <div class="form-group">
                                    <label>权限名称</label>
                                    <input type="text" id="updatePermissionName" name="permissionName" class="form-control" >
                                </div>
                                <div class="form-group">
                                    <label>权限代号</label>
                                    <input type="text" id="updatePermissionCode" name="permissionCode" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>资源URL</label>
                                    <input type="text" id="updatePermissionUrl"  name="url" class="form-control">
                                </div>

                                <div class="form-group">
                                    <label>父权限</label>
                                    <select id="updateParentPermission" name="parentId" class="form-control">
                                        <option value="0">顶级菜单</option>
                                    </select>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                            </button>
                            <button id="updatePermissionBtn" type="button" class="btn btn-primary">
                                更新权限
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>

            <%--点击添加权限之后，弹出panel 面板，使用ajax 异步提交--%>
            <div class="modal fade bs-example-modal-sm" id="myModal" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title" id="myModalLabel">
                                <b>新增权限</b>
                            </h4>

                            <h5 class="modal-title" id="myModalLabel1">
                                <small>按下ESC 键退出</small>
                            </h5>
                        </div>
                        <div class="modal-body">
                            <form method="post" id="addPermissionFrom" action="/manage/permission/new">
                                <div class="form-group">
                                    <label>权限名称</label>
                                    <input type="text" name="permissionName" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>权限代号</label>
                                    <input type="text" name="permissionCode" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>资源URL</label>
                                    <input type="text" name="url" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>权限类型</label>
                                    <select name="permissionType" class="form-control">
                                        <option value="菜单">菜单</option>
                                        <option value="按钮">按钮</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>父权限</label>
                                    <select name="parentId" class="form-control">
                                        <option value="0">顶级菜单</option>
                                        <c:forEach items="${permissionList}" var="permission">
                                            <option value="${permission.id}">${permission.permissionName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                            </button>
                            <button id="addPermissionBtn" type="button" class="btn btn-primary">
                                新增权限
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../../include/footer.jsp" %>

</div>
<!-- ./wrapper -->

<%@ include file="../../include/js.jsp" %>
<script>

    $(function () {
        $('.tree').treegrid();

        //删除权限
        $(".permissionDeleteBtn").click(function () {
            var id = $(this).attr("rel");

            layer.confirm("是否删除权限?",function (index) {
                layer.close(index);

                $.get("/manage/permission/delete/"+id).done(function (res) {
                    if (res.status == '0') {
                        layer.msg("删除成功",{icon:1, time:1000},function () {
                            history.go(0);
                        });
                    }else{
                        layer.msg(res.message);
                    }
                }).error(function () {
                    layer.msg("系统异常，请稍后再试");
                });
            })
        });

        //更新权限，回显数据
        //同时请求所有的权限列表，将本权限从权限列表中删除
        $(".permissionUpdateBtn").click(function () {

            //清除section 中的原有的值
            var id = $(this).attr("rel");

            var permission;
            $.ajax({
                type:"GET",
                url:"/manage/permission/update/"+id,
                success:function (res) {
                    permission = res.data;
                    // console.log(permission);

                    $("#permissionIdTr").val(permission.id);
                    $("#updatePermissionName").val(permission.permissionName);
                    $('#updatePermissionCode').val(permission.permissionCode);
                    $('#updatePermissionUrl').val(permission.url);
                },
                error:function () {
                    layer.msg("系统异常，请稍后再试!");
                    $("#updatePermissionModal").modal("hide");

                }
            });

            $.ajax({
                type:"GET",
                url:"/manage/permission/queryPermissionExclude/"+id,
                success:function (res) {
                    //进入模态框的时候清除section 下的元素，防止多余加载
                    //向权限列表插值，并且删除本权限
                    //迭代json 中的data 数组，如果id！= id，再将data数组中的 permissionName 通过循环的方式创建optino 元素，追加到选择框

                    $("#updateParentPermission").empty();
                    //这个data 就是我的除了当前权限之外的剩余权限的List 集合
                    //需要在后台排除当前选中要修改的权限的所有子权限
                    $.each(res.data,function (k, v) {
                        console.log(v.id);
                        if (id!=v.id){
                            //将权限名称插入到模态框中的section 中去
                            var permissionName = v.permissionName;
                            $("#updateParentPermission").append("<option value="+v.id+">"+permissionName+"</option>");

                            //默认选中原来的父权限
                        }
                    });
                },
                error:function () {
                    layer.msg("系统异常，请稍后再试!");
                }
            });

            //展示模态框
            $("#updatePermissionModal").modal("show");
        });

        //更新权限提交
        $("#updatePermissionBtn").click(function () {
            //将表单中的数据提交到后台
            $.ajax({
                type: 'POST',
                datatype: 'text',
                url: "/manage/permission/update",
                //将表单内容序列化成一个字符串，如下：username=wwc&password=wwc，如果是post请求，那么这串字符串就以请求体的方式传递给后端action
                data: $("#updatePermissionFrom").serialize(),
                conentType: 'application/x-www-from-urlencoded',
                datatype: "json",
                success: function (res) {
                    if (res.status == "0") {
                        layer.msg(res.message);
                        history.go(0);
                    }else{
                        layer.msg(res.message)
                        history.go(0);
                    }
                },
                error: function () {
                    layer.msg("系统异常");
                }

            });
        });

        //添加权限
        $("#addPermissionBtn").click(function () {
            // layer.msg("点击按钮");
            $.ajax({
                type: 'POST',
                datatype: 'text',
                url: "/manage/permission/new",
                //将表单内容序列化成一个字符串，如下：username=wwc&password=wwc，如果是post请求，那么这串字符串就以请求体的方式传递给后端action
                data: $("#addPermissionFrom").serialize(),
                conentType: 'application/x-www-from-urlencoded',
                datatype: "json",
                success: function (res) {
                    if (res.status == "0") {
                        layer.msg("添加成功");
                        history.go(0);
                    } else {
                        layer.msg(res.message, {icon: 2, time: 1000});
                    }
                },
                error: function () {
                    layer.msg("系统异常");
                }
            });
        })

    })
</script>
</body>
</html>