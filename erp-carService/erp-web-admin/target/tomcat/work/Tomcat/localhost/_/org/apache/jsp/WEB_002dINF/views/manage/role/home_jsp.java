/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-02 17:00:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.manage.role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/manage/role/../../include/footer.jsp", Long.valueOf(1532372670000L));
    _jspx_dependants.put("/WEB-INF/views/manage/role/../../include/header.jsp", Long.valueOf(1532372670000L));
    _jspx_dependants.put("/WEB-INF/views/manage/role/../../include/js.jsp", Long.valueOf(1532684057675L));
    _jspx_dependants.put("/WEB-INF/views/manage/role/../../include/css.jsp", Long.valueOf(1532683968620L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>系统管理 | 角色管理</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    ");
      out.write("\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/plugins/font-awesome/css/font-awesome.min.css\">\n");
      out.write("<!-- Theme style -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/dist/css/AdminLTE.min.css\">\n");
      out.write("<!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("folder instead of downloading all of them to reduce the load. -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/dist/css/skins/_all-skins.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/plugins/tree/css/metroStyle/metroStyle.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/plugins/datetimepicker/css/bootstrap-datetimepicker.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/plugins/daterangepicker/daterangepicker.css\"/>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/plugins/treegrid/css/jquery.treegrid.css\"/>\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue-light sidebar-mini\">\r\n");
      out.write("<!-- Site wrapper -->\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    ");
      out.write("\n");
      out.write("<!-- 顶部导航栏部分 -->\n");
      out.write("<header class=\"main-header\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("        <span class=\"logo-mini\"><b>ERP</b></span>\n");
      out.write("        <!-- logo for regular state and mobile devices -->\n");
      out.write("        <span class=\"logo-lg\"><b>车管家</b>ERP</span>\n");
      out.write("    </a>\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("        <!-- Sidebar toggle button-->\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <div class=\"navbar-custom-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown user user-menu\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <img src=\"/static/dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                        <span class=\"hidden-xs\">李美苏</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <!-- User image -->\n");
      out.write("                        <li class=\"user-header\">\n");
      out.write("                            <img src=\"/static/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                李美苏\n");
      out.write("                                <small>海外事业部</small>\n");
      out.write("                            </p>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Menu Footer-->\n");
      out.write("                        <li class=\"user-footer\">\n");
      out.write("                            <div class=\"pull-left\">\n");
      out.write("                                <a href=\"/profile\" class=\"btn btn-default btn-flat\">个人设置</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("                                <a href=\"/logout\" class=\"btn btn-default btn-flat\">安全退出</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("  <!-- =============================================== -->\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../include/sider.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("home", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <!-- 右侧内容部分 -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("        <!-- Content Header (Page header) -->\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Default box -->\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"box-header\">\r\n");
      out.write("                    <h3 class=\"box-title\">角色列表</h3>\r\n");
      out.write("                    <div class=\"box-tools\">\r\n");
      out.write("                        <a id=\"addRoleBtn\" class=\"btn btn-primary btn-sm\" data-toggle=\"modal\" data-target=\"#addPermissionModal\"><i class=\"fa fa-plus\"></i> 新增角色</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <table class=\"table table-hover\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"modal modal fade bs-example-modal-sm\" id=\"addPermissionModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("                     aria-labelledby=\"myModalLabel\"\r\n");
      out.write("                     aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">\r\n");
      out.write("                                    &times;\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"myModalLabel\">\r\n");
      out.write("                                    <b>新增角色</b>\r\n");
      out.write("                                </h4>\r\n");
      out.write("\r\n");
      out.write("                                <h5 class=\"modal-title\" id=\"myModalLabel1\">\r\n");
      out.write("                                    <small>按下ESC 键退出</small>\r\n");
      out.write("                                </h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <form method=\"post\" id=\"addPermissionFrom\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>角色名称</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"roleName\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>角色代号</label>\r\n");
      out.write("                                        <input type=\"text\" name=\"roleCode\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>权限列表</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"box-body\">\r\n");
      out.write("                                            <table class=\"table tree\" id=\"permissionTable\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                ");
      out.write("\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>权限名称</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                </tbody>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <button id=\"newRoleBtn\" type=\"button\" class=\"btn btn-primary\">\r\n");
      out.write("                                    新增角色\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><!-- /.modal-content -->\r\n");
      out.write("                    </div><!-- /.modal -->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box -->\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- /.content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\n");
      out.write("<!-- 底部 -->\n");
      out.write("<footer class=\"main-footer\">\n");
      out.write("    <div class=\"pull-right hidden-xs\">\n");
      out.write("        <b>Version</b> 1.0\n");
      out.write("    </div>\n");
      out.write("    <strong>Copyright &copy; 2010 -2017 <a href=\"http://almsaeedstudio.com\">车管家</a>.</strong> All rights\n");
      out.write("    reserved.\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"/static/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- SlimScroll -->\n");
      out.write("<script src=\"/static/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<!-- FastClick -->\n");
      out.write("<script src=\"/static/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\n");
      out.write("<script src=\"/static/dist/js/jquery.twbsPagination.min.js\"></script>\n");
      out.write("<script src=\"/static/plugins/datetimepicker/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("<script src=\"/static/plugins/daterangepicker/moment.js\"></script>\n");
      out.write("<script src=\"/static/plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<script src=\"/static/plugins/layer/layer.js\"></script>\n");
      out.write("<script src=\"/static/plugins/treegrid/js/jquery.treegrid.js\"></script>");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //添加角色，弹出模态框，将json 中的数据填充到页面上\r\n");
      out.write("        $(\"#addRoleBtn\").click(function () {\r\n");
      out.write("            $(\"#permissionTable\").empty();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"GET\",\r\n");
      out.write("                url:\"/manage/role/new\",\r\n");
      out.write("                success:function (res) {\r\n");
      out.write("\r\n");
      out.write("                    console.log(res.data); //data 是一个数组，迭代数组获得树形,将树形结构显示在页面上\r\n");
      out.write("                    $.each(res.data,function (k, v) {\r\n");
      out.write("                        console.log(v.permissionName + \"->\" + v.id + \"->\" + v.parentId);\r\n");
      out.write("                        //模态框中已经有表头，现在只需要动态生成tr，追加到table 上去\r\n");
      out.write("                        var $id = v.id;\r\n");
      out.write("                        if (v.parentId == 0) {\r\n");
      out.write("                            //创建元素\r\n");
      out.write("                            var $tr = $(\"<tr></tr>\");\r\n");
      out.write("                            //添加属性\r\n");
      out.write("                            $tr.addClass(\"treegrid-\"+v.id+\" treegrid-expanded\");\r\n");
      out.write("\r\n");
      out.write("                            //创建两个td 元素\r\n");
      out.write("                            var $td = $(\"<td>\"+v.permissionName+\"</td>\");\r\n");
      out.write("                            var $tdCheck = $(\"<td></td>\");\r\n");
      out.write("                            var $check = $(\"<input> </input>\");\r\n");
      out.write("                            $check.attr({\r\n");
      out.write("                                type:\"checkbox\",\r\n");
      out.write("                                name:\"permissionId\",\r\n");
      out.write("                                value:v.id\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            //组建复选框元素\r\n");
      out.write("                            $tdCheck.append($check);\r\n");
      out.write("\r\n");
      out.write("                            $tr.append($tdCheck);\r\n");
      out.write("                            $tr.append($td);\r\n");
      out.write("\r\n");
      out.write("                            $(\"#permissionTable\").append($tr)\r\n");
      out.write("\r\n");
      out.write("                        }else{\r\n");
      out.write("                            var $tr = $(\"<tr></tr>\");\r\n");
      out.write("                            $tr.addClass(\"treegrid-\"+v.id+\" treegrid-expanded \"+\"treegrid-parent-\"+v.parentId);\r\n");
      out.write("                            var $td = $(\"<td>\"+v.permissionName+\"</td>\");\r\n");
      out.write("\r\n");
      out.write("                            var $tdCheck = $(\"<td></td>\");\r\n");
      out.write("                            var $check = $(\"<input> </input>\");\r\n");
      out.write("                            $check.attr({\r\n");
      out.write("                                type:\"checkbox\",\r\n");
      out.write("                                name:\"permissionId\",\r\n");
      out.write("                                value:v.id\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            //组建复选框元素\r\n");
      out.write("                            $tdCheck.append($check);\r\n");
      out.write("\r\n");
      out.write("                            $tr.append($tdCheck);\r\n");
      out.write("                            $tr.append($td);\r\n");
      out.write("\r\n");
      out.write("                            $(\"#permissionTable\").append($tr)\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                error:function () {\r\n");
      out.write("                    layer.msg(\"系统异常，请稍后再试！\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //添加角色，将form 中的数据 提交到后台\r\n");
      out.write("        $(\"#newRoleBtn\").click(function () {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                datatype: 'text',\r\n");
      out.write("                url: \"/manage/role/new\",\r\n");
      out.write("                //将表单内容序列化成一个字符串，如下：username=wwc&password=wwc，如果是post请求，那么这串字符串就以请求体的方式传递给后端action\r\n");
      out.write("                data: $(\"#addPermissionFrom\").serialize(),\r\n");
      out.write("                conentType: 'application/x-www-from-urlencoded',\r\n");
      out.write("                datatype: \"json\",\r\n");
      out.write("                success: function (res) {\r\n");
      out.write("                    if (res.status == '0') {\r\n");
      out.write("                        layer.msg(res.message,{icon:1,time:1000},function () {\r\n");
      out.write("                            history.go(0);\r\n");
      out.write("                        })\r\n");
      out.write("                    }else\r\n");
      out.write("                    {\r\n");
      out.write("                        layer.msg(res.message);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error: function () {\r\n");
      out.write("                    layer.msg(\"系统异常\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //删除角色\r\n");
      out.write("        $(\".deleteRoleBtn\").click(function () {\r\n");
      out.write("            var id = $(this).attr(\"rel\");\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"GET\",\r\n");
      out.write("                url:\"/manage/role/delete/\"+id,\r\n");
      out.write("                success:function (res) {\r\n");
      out.write("                    if (res.status==\"0\") {\r\n");
      out.write("                        layer.msg(\"删除成功\",{icon:1,time:1000},function () {\r\n");
      out.write("                            history.go(0);\r\n");
      out.write("                        });\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.msg(res.message);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error:function () {\r\n");
      out.write("                    layer.msg(\"系统异常，请稍后再试！\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/manage/role/home.jsp(43,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manage/role/home.jsp(43,28) '${roleList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roleList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/manage/role/home.jsp(43,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("role");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr class=\"bg-gray\" rel=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        角色名称：<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</strong>\r\n");
          out.write("                                        <span class=\"pull-right\">\r\n");
          out.write("                                            <a href=\"/manage/role/update/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-success btn-xs updateRoleBtn\">编辑</a>\r\n");
          out.write("                                            <a rel=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-danger btn-xs deleteRoleBtn\">删除</a>\r\n");
          out.write("                                        </span>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                                <tr class=\"bg-gray-light\">\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        拥有权限：");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/manage/role/home.jsp(55,45) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manage/role/home.jsp(55,45) '${role.permissionList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${role.permissionList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/manage/role/home.jsp(55,45) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("permission");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.permissionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(" <span>--</span>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}