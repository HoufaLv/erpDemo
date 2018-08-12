<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>服务项目列表</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../include/css.jsp" %>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
    <%@ include file="../include/header.jsp" %>
    <jsp:include page="../include/sider.jsp">
        <jsp:param name="menu" value="home"/>
    </jsp:include>
    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box">
                <div class="box-header">
                    <h4 class="box-title">维修服务列表</h4>
                    <div class="box-tools">
                        <button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#newServiceModal"/>
                        新增服务
                    </div>
                </div>

                <div class="box-body">
                    <%--项目列表--%>
                    <table class="table table-hover">
                        <tr>
                            <th>服务名称</th>
                            <th>服务编号</th>
                            <th>服务工时</th>
                            <td>#</td>
                        </tr>
                        <c:forEach items="${erpServiceList}" var="service">
                            <tr>
                                <td>${service.serviceName}</td>
                                <td>${service.serviceNo}</td>
                                <td>${service.serviceHour}</td>
                                <td>
                                    <a class="btn btn-xs btn-success" href="">更新</a>
                                    <a class="btn btn-xs btn-danger" href="">删除</a>
                                    <a class="btn btn-xs btn-warning" href="">冻结</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>

                <div class="modal modal-default fade bs-example-modal-sm" id="newServiceModal" tabindex="-1"
                     role="dialog"
                     aria-labelledby="myModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title" id="myModalLabel">
                                    <b>新增服务</b>
                                </h4>

                                <h5 class="modal-title" id="myModalLabel1">
                                    <small>按下ESC 键退出</small>
                                </h5>
                            </div>
                            <div class="modal-body">
                                <form method="post" id="addServiceFrom">
                                    <div class="form-group">
                                        <label>服务名称</label>
                                        <input type="text" name="serviceName" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>服务编号</label>
                                        <input type="text" name="serviceNo" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label>服务工时</label>
                                        <input type="text" name="serviceHour" class="form-control">
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                </button>
                                <button id="addPermissionBtn" type="button" class="btn btn-primary">
                                    新增服务
                                </button>
                            </div>
                        </div><!-- /.modal-content -->
                    </div><!-- /.modal -->
                </div>
            </div>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../include/footer.jsp" %>

</div>
<!-- ./wrapper -->

<%@ include file="../include/js.jsp" %>
<script>
    $(function () {
        $("#addPermissionBtn").click(function () {

            $.ajax({
                type: 'POST',
                datatype: 'text',
                url: "/service/new",
                //将表单内容序列化成一个字符串，如下：username=wwc&password=wwc，如果是post请求，那么这串字符串就以请求体的方式传递给后端action
                data: $("#addServiceFrom").serialize(),
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
        });
    });
</script>
</body>
</html>