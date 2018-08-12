<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>车管家ERP-配件管理</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../include/css.jsp"%>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@ include file="../include/header.jsp" %>
    <jsp:include page="../include/sider.jsp">
        <jsp:param name="menu" value="parts"/>
    </jsp:include>

    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                配件管理
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="box no-border">
                <div class="box-body">
                    <form method="get" class="form-inline pull-left">
                        <input id="partsNameSearchInput" type="text" name="partsName" placeholder="配件名称" class="form-control" value="${param.partsName}">
                        <input id="partsInventorySearchInput" type="text" name="inventory" placeholder="库存量" class="form-control" value="${param.inventory}">
                        <select class="form-control" name="partsType" id="partsType">
                            <option class="partsTypeSelect" value="">请选择配件类型</option>
                            <c:forEach items="${typeList}" var="type">
                                <option class="partsTypeSelect" value="${type.id}" ${param.partsType == type.id ? 'selected': ''}>${type.typeName}</option>
                            </c:forEach>
                        </select>
                        <button class="btn btn-default">搜索</button> &nbsp;
                    </form>
                    <button id="resettingBtn" class="btn btn-primary">重置</button>
                </div>
            </div>

            <!-- Default box -->
            <div class="box">
                <c:if test="${message} not null">
                    <h5>${message}</h5>
                </c:if>
                <div class="box-body">
                    <table class="table table-condensed table-hover">
                        <thead>
                        <tr>
                            <th>配件编码</th>
                            <th>名称</th>
                            <th>库存</th>
                            <th>进价</th>
                            <th>售价</th>
                            <th>类型</th>
                            <th>产地</th>
                            <th>#</th>
                        </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${pageInfo.list}" var="parts">
                                <tr>
                                    <td>${parts.partsNo}</td>
                                    <td>${parts.partsName}</td>
                                    <td class="${parts.partsInventory>50?'success':'danger'}">${parts.partsInventory}</td>
                                    <td>${parts.partsInPrice}</td>
                                    <td>${parts.partsSalePrice}</td>
                                    <td>${parts.erpPartsType.typeName}</td>
                                    <td>${parts.partsAddress}</td>
                                    <td><a rel="${parts.id}" class="btn-xs btn-success updateBtn" href="/parts/update/${parts.id}">更新</a>
                                        <a rel="${parts.id}" class="btn-xs btn-danger delBtn" href="javascript:;">删除</a>
                                        <a rel="${parts.id}" class="btn-xs btn-warning delBtn" href="/parts/detail/${parts.id}">详情</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <ul id="pagination" class="pagination pull-right"></ul>
                </div>
                <!-- /.box-body -->

            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <%@ include file="../include/footer.jsp" %>


</div>
<!-- ./wrapper -->

<%@ include file="../include/js.jsp" %>
<script>
    $(function(){

        $("#resettingBtn").click(function () {
            $("#partsNameSearchInput").val("");
            $("#partsInventorySearchInput").val("");
            $(".partsTypeSelect").removeAttr("selected");
        });

        $(".delBtn").click(function () {
            $.ajax({
                type:"GET",
                url:"/storage/parts/delete/" + $(this).attr("rel"),
                success:function (res) {
                    if (res.status="0") {
                        layer.msg("删除成功!",{icon:1,time:1000},function () {
                            //刷新页面
                            history.go(0);
                        });
                    }else {
                        layer.msg(res.message);
                    }
                },
                error:function () {
                    layer.msg("系统异常，请稍后再试!");
                }
                
            });
        });


        if (${pageInfo.pages==0}) {
            layer.msg("暂无数据");
        }

        $("#pagination").twbsPagination({
            totalPages : ${pageInfo.pages},
            visiblePages : 5,
            first : '首页',
            last:'末页',
            prev:'上一页',
            next:'下一页',
            href:"?pageNo={{number}}&partsName=" + encodeURIComponent('${param.partsName}') + "&partsType=${param.partsType}" + "&inventory=${param.inventory}"
        });
        var locale = {
            "format": 'YYYY-MM-DD',
            "separator": " - ",//
            "applyLabel": "确定",
            "cancelLabel": "取消",
            "fromLabel": "起始时间",
            "toLabel": "结束时间'",
            "customRangeLabel": "自定义",
            "weekLabel": "W",
            "daysOfWeek": ["日", "一", "二", "三", "四", "五", "六"],
            "monthNames": ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
            "firstDay": 1
        };
        var startDate = "";
        var endDate = "";
        if(startDate && endDate) {
            $('#time').val(startDate + " / " + endDate);
        }
        $('#time').daterangepicker({
            autoUpdateInput:false,
            "locale": locale,
            "opens":"right",
            "timePicker":false
        },function(start,end) {
            $("#startTime").val(start.format('YYYY-MM-DD'));
            $("#endTime").val(end.format('YYYY-MM-DD'));
            $('#time').val(start.format('YYYY-MM-DD') + " / " + end.format('YYYY-MM-DD'));
        });
    })
</script>
</body>
</html>
