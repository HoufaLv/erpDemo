<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ERP - 前台接车系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../include/css.jsp"%>
    <style>
        .photo {
            width: 100%;
            height: 320px;
            border: 2px dashed #ccc;
            margin-top: 20px;
            text-align: center;
            line-height: 320px;
        }
    </style>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
    <%@ include file="../include/header.jsp"%>
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
                <div class="box-header with-border">
                    <h3 class="box-title">新增用户</h3>
                    <div class="box-tools pull-right">
                        <a class="btn btn-primary btn-sm" href="/customer/list"><i class="fa fa-arrow-left"></i> 返回列表</a>
                    </div>
                </div>
                <div class="box-body">
                    <form action="/customer/new" method="post" id="newCustomerForm">
                        <div class="form-group">
                            <label>姓名</label>
                            <input name="customerName" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>身份证号</label>
                            <input name="customerIdCard" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>邮箱</label>
                            <input name="customerEmail" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>手机号码</label>
                            <input name="customerTel" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>密码(默认000000)</label>
                            <input name="customerPassword" type="password" class="form-control" value="000000">
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div id="picker">选择用户照片</div>
                                <div class="photo" id="userPhoto">

                                </div>
                            </div>
                        </div>

                    </form>

                    <div class="box-footer">
                        <button class="btn btn-primary" id="saveCustomerBtn">保存</button>
                    </div>
                </div>

                <!-- /.box-body -->
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../include/footer.jsp"%>

</div>
<!-- ./wrapper -->

<%@ include file="../include/js.jsp"%>
<script>
    $(function () {
        $("#saveCustomerBtn").click(function () {
            alert("123");
            $("#newCustomerForm").submit();
        });

    });
</script>
</body>

</html>