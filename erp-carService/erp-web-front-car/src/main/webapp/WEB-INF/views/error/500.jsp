<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>401</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../include/css.jsp"%>
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

            <div class="error-page">
                <h2 class="headline text-red">500</h2>

                <div class="error-content">
                    <h3><i class="fa fa-warning text-red"></i> 相关资源正在维护 </h3>

                    <p>
                        相关资源正在维护,更多信息请在本页面进行搜索
                    </p>

                    <form class="search-form">
                        <div class="input-group">
                            <input type="text" name="search" class="form-control" placeholder="Search">

                            <div class="input-group-btn">
                                <button type="submit" name="submit" class="btn btn-danger btn-flat"><i class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                        <!-- /.input-group -->
                    </form>
                </div>
            </div>
            <!-- /.error-page -->
        </section>
            </div></section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@ include file="../include/footer.jsp"%>

</div>
<!-- ./wrapper -->

<%@ include file="../include/js.jsp"%>
</body>
</html>