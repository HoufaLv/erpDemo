<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <h3 class="box-title">新增车辆信息</h3>
                    <div class="box-tools pull-right">
                        <a class="btn btn-primary btn-sm" href="/car/list"><i class="fa fa-arrow-left"></i> 查看车辆列表</a>
                    </div>
                </div>
                <div class="box-body">
                    <form action="/car/new" method="post" id="newCustomerForm">
                        <div class="form-group">
                            <label>车主</label>
                            <select name="customerId" class="form-control">
                                <option value="">---请选择车主---</option>
                                <c:forEach items="${customerList}" var="customer">
                                    <option  value="${customer.id}">${customer.customerEmail}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                            <label>车辆型号</label>
                            <input name="carType" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>车牌号</label>
                            <input name="carLicenceNo" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>车辆识别码</label>
                            <input name="carNo" type="text" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>车辆颜色</label>
                            <input name="carColor" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>车辆行驶公里数</label>
                            <input name="carKilometer" type="text" class="form-control">
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div id="picker">车辆正面照片</div>
                                <div name="carPicFront" class="photo" id="carPhotoFront">

                                </div>
                            </div>

                            <div class="col-md-6">
                                <div id="picker2">车辆背面照片</div>
                                <div name="carPicBack" class="photo" id="userPhotoBack">

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
            $("#newCustomerForm").submit();
        });

    });
</script>
</body>

</html>