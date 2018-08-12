<%@ taglib prefix="" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>车管家ERP-新增订单</title>

    <style>
        .td_title {
            font-weight: bold;
        }
        .table>tbody>tr>td {
            vertical-align: middle;
        }
        .num {
            width: 20px;
            border: none;
        }
    </style>
    <%@ include file="../include/css.jsp" %>
</head>
<body class="hold-transition skin-blue-light sidebar-mini">
<!-- Site wrapper -->
<%-- Vue 元素必须在 一个div 中 --%>
<div class="wrapper" id="app">
    <%@ include file="../include/header.jsp" %>
    <jsp:include page="../include/sider.jsp">
        <jsp:param name="menu" value="order"/>
    </jsp:include>

    <!-- 右侧内容部分 -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1 style="text-align: center">
                保养维修单
            </h1>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">客户车辆信息 &nbsp;&nbsp; - <span>({{car.carLicenceNo}})</span></h3>
                </div>
                <div class="box-body">
                    <table class="table table-condensed table-hover">
                        <tr>
                            <td class="td_title">车牌号:</td>
                            <td style="width: 180px">
                                <input id="licenceNo" type="text" class="form-control" name="licenceNo" v-model="car.licenceNo">
                            </td>
                            <td >
                            <span class="input-group-btn">
                                <button type="button" class="btn btn-primary" id="search" @click="searchCarByLicenceNo"><i class="fa fa-search"> 查找</i></button>
                            </span>
                            </td>
                            <td class="td_title">客户姓名:</td>
                            <td>{{customer.customerName}}</td>
                            <td class="td_title">身份证号:</td>
                            <td>{{customer.customerIdCard}}</td>
                        </tr>
                        <tr>
                            <td class="td_title">车主电话:</td>
                            <td id="tel">{{customer.customerTel}}</td>
                            <td></td>
                            <td class="td_title">车型:</td>
                            <td id="carType">{{car.carType}}</td>
                            <td class="td_title">车辆识别码:</td>
                            <td id="carNo">{{car.carNo}}</td>
                        </tr>
                        <tr>
                            <td class="td_title">行驶公里数:</td>
                            <td id="carKilometer">{{car.carKilometer}}</td>
                            <td></td>
                            <td class="td_title">保养总次数:</td>
                            <td id="carFixTime">{{car.carFixTime}}</td>
                        </tr>
                    </table>

                </div>
            </div>

            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">项目选择</h3>
                </div>

                <div class="box-body">
                    <div class="form-inline">
                        <select class="form-control" name="" id="" v-model="serverType">
                            <option value="">请选择项目</option>
                            <option v-for="item in serverTypes" :value="item">{{item.serviceName}} ---- {{item.serviceHour}} 工时</option>
                        </select>
                    </div>
                    <br>
                    <table class="table table-bordered table-condensed table-hover" style="border-width: 2px;" id="infoForm">
                        <thead>
                        <tr>
                            <th>项目编号</th>
                            <th>项目名称</th>
                            <th>工时费用</th>
                        </tr>
                        </thead>
                        <tbody id="addTr">
                            <tr>
                                <td>{{serverType.serviceNo}}</td>
                                <td>{{serverType.serviceName}}</td>
                                <td v-if="serverType.serviceHour">{{serverType.serviceHour * 50}}</td>
                            </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="4" class="td_title" v-if="serverType.serviceHour">小计 ：{{serverType.serviceHour * 50}} 元</td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>

            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">选择配件</h3>
                </div>

                <div class="box-body">

                    <div class="form-inline">
                        <select class="form-control" name="type" id="type" @change="changeType" v-model="partsType">
                            <option value="">请选择配件类型</option>
                            <option v-for="item in partsTypes" :value="item">{{item.typeName}}</option>
                        </select>
                        <%--使用上面的配件类型去异步请求该类型下所有的配件，迭代加载--%>
                        <select class="form-control" name="parts" v-model="choosePart">
                            <option value="">请选择配件</option>
                            <option v-for="item in partsList" :value="item">{{item.partsName}} -- {{item.partsNo}}</option>
                        </select>
                        <button class="btn btn-primary" @click="addParts">选择</button>
                    </div>
                    <br>
                    <table class="table table-bordered table-condensed table-hover" style="border-width: 2px;">
                        <thead>
                        <tr>
                            <th>编号</th>
                            <th>名称</th>
                            <th>单价</th>
                            <th><span style="margin-left: 20px">数量</span></th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-for="item in choosePartList">
                            <td>{{item.partsNo}}</td>
                            <td>{{item.partsName}}</td>
                            <td>{{item.partsSalePrice}}</td>
                            <td><button type="button" class="btn btn-box-tool"><i class="fa fa-minus"></i></button>
                                <input type="text" class="num">{{item.num}}
                                <button type="button" class="btn btn-box-tool"><i class="fa fa-plus"></i></button>
                            </td>
                            <td><button class="btn btn-danger btn-sm"><i class="fa fa-minus"></i></button></td>
                        </tr>

                        </tbody>
                        <tfoot>
                        <tr>
                            <td colspan="5" class="td_title">小计 ： <b>RMB</b></td>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>

            <div class="box">
                <div class="box-header">
                    <h4>总计： <b>RMB</b></h4>
                </div>
            </div>

            <button class="btn btn-success btn-block btn-sm" >下单</button>


        </section>
        <!-- /.content -->

    </div>
    <!-- /.content-wrapper -->


    <%@ include file="../include/footer.jsp" %>

</div>
<!-- ./wrapper -->
<%@ include file="../include/js.jsp" %>
<script>
    $(function() {
        //创建Vue 模型
        var vm = new Vue({
            el:"#app",
            //数据,将页面上的对象，封装到这个里面
            data:{
                car:{},
                customer:{},
                serverTypes:[],
                serverType:{},
                partsTypes:[],
                partsList:[],
                partsType:{},
                parts:[],
                choosePart:{},
                choosePartList:[]
            },
            //方法
            methods:{
                //点击搜索按钮的时候,向后台是否存在该车牌号
                searchCarByLicenceNo:function () {
                    //如果车牌号为空，则不能搜索
                    if (this.car.licenceNo) {
                        $.ajax({
                            url:"/car/check/"+this.car.licenceNo,
                            type:"GET",
                            success:function (res) {
                                //如果对应的车存在，则将数据绑定到页面元素中，如果不存在，则将跳跳转到新增车辆页面
                                if (res.status=="0") {
                                    //将数据显示到页面上,并将车牌号input 填充
                                    vm.car=res.data;
                                    vm.customer=res.data.erpCustomer;

                                }else if (res.status == "1") {
                                    layer.confirm('车辆不存在，是否要添加车辆信息？', {
                                        btn: ['添加'] //按钮
                                    }, function(){
                                        window.location.href = "/car/new"
                                    });
                                }
                            },
                            error:function () {
                                layer.msg("系统异常，请稍后再试!");
                            }
                        });
                    }else{
                        layer.msg("车牌号不能为空!");
                    }

                },

                //当点击配件类型的时候，将该配件下面所有的配件信息显示
                changeType:function () {
                    if (this.partsType.id){
                        $.get("/order/parts/partsType/"+this.partsType.id).done(function (res) {
                            vm.partsList = res.data;
                        }).error(function () {
                            layer.msg("系统异常，请稍后再试!");
                        });
                    }
                },

                //点击添加配件的时候，将配件信息添加到下面的table 中
                addParts:function () {
                    //将选择好的配件，添加到choosePartList 列表中去
                    //将choosePartList 列表迭代一遍，没有当前这个配件，就将配件添加到列表，然后将列表展示到页面上
                    var addPartFlag = false;

                    //当第一次来的时候，会直接将配件添加到列表中去
                    if (this.choosePartList.length == 0) {
                        alert("添加配件 列表为0");
                        this.choosePart.num = 1;
                        this.choosePartList.push(this.choosePart);

                    }else {
                        //配件列表中已经有数据了
                        for (var i = 0; i < this.choosePartList.length; i++) {
                            //如果配件列表中的数据和选中的是同一个配件，检查库存，如果不是同一个配件，添加配件
                            if (this.choosePart == this.choosePartList[i]) {
                                //检查库存是否还有，还有的话，就将chooseParts 的 num +1
                                if (this.choosePartList[i].num < this.choosePartList[i].partsInventory) {
                                    this.choosePartList[i].num++;
                                }else{
                                    layer.msg("库存不足!");
                                }
                            }else{
                                //滚去添加配件
                                addPartFlag=true;
                                break;
                            }
                        }
                    }

                    if (addPartFlag) {
                        for (var i = 0; i < this.choosePartList.length; i++) {
                            if (this.choosePart == this.choosePartList[i]) {
                                if (this.choosePartList[i].num < this.choosePartList[i].partsInventory) {
                                    this.choosePartList[i].num++;
                                }else{
                                    layer.msg("库存不足!");
                                }
                            }else{
                                this.choosePart.num = 1;
                                this.choosePartList.push(this.choosePart);
                                break;
                            }

                        }

                    }

                }
            },
            //计算属性
            computed:{

            },
            //钩子函数,用户初始化数据
            mounted:function () {
                $.ajax({
                    type:"GET",
                    URL:"/car/test",
                    success:function (res) {
                        layer.msg("Vue 初始化成功!");
                    },
                    error:function () {
                        layer.msg("系统异常，请稍后再试!");
                    }
                });
                $.get("/order/service/list").done(function (res) {
                    vm.serverTypes = res.data;

                }).error(function () {
                    layer.msg("系统异常，请稍后再试!");
                });

                $.get("/order/partsType/list").done(function (res) {
                    vm.partsTypes = res.data;
                }).error(function () {
                    layer.msg("系统异常，请稍后再试!");
                });
            }
        });
    })
</script>
</body>
</html>