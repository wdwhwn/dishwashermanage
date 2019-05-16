<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>t_dishwasher_order</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tDishwasherOrderController.do?doUpdate" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id" value="${tDishwasherOrder.id}"/>
		<div class="row">
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderSn：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderSn" type="text" class="form-control" maxlength="50" value = "${tDishwasherOrder.orderSn}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderMessage：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderMessage" type="text" class="form-control" maxlength="255" value = "${tDishwasherOrder.orderMessage}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderFreight：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderFreight" type="text" class="form-control" maxlength="50" value = "${tDishwasherOrder.orderFreight}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderDate：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderDate" type="text" class="form-control input-sm laydate-date" value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherOrder.orderDate}'/>"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderTotalPrice：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderTotalPrice" type="text" class="form-control" maxlength="50" value = "${tDishwasherOrder.orderTotalPrice}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderAddressId：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderAddressId" type="text" class="form-control" maxlength="10" value = "${tDishwasherOrder.orderAddressId}"  datatype="n"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderUserId：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderUserId" type="text" class="form-control" maxlength="10" value = "${tDishwasherOrder.orderUserId}"  datatype="n"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderGoodsId：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderGoodsId" type="text" class="form-control" maxlength="10" value = "${tDishwasherOrder.orderGoodsId}"  datatype="n"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderGoodsNumber：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderGoodsNumber" type="text" class="form-control" maxlength="10" value = "${tDishwasherOrder.orderGoodsNumber}"  datatype="n"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					0 订单创建成功等待付款 101订单已取消 102订单已删除201订单已付款，等待发货300订单已发货，301用户确认收货401 没有发货，退款 402 已收货，退款退货：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderStatus" type="text" class="form-control" maxlength="5" value = "${tDishwasherOrder.orderStatus}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					0 未发货 1 已发货 2 已收货 4 退货：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderShippingStatus" type="text" class="form-control" maxlength="5" value = "${tDishwasherOrder.orderShippingStatus}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					0 未付款 1付款中 2 已付款 4 退款：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderPayStatus" type="text" class="form-control" maxlength="5" value = "${tDishwasherOrder.orderPayStatus}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		<div class="bt-item col-md-6 col-sm-6">
			<div class="row">
				<div class="col-md-3 col-sm-3 col-xs-3 bt-label">
					orderPrepayId：
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9 bt-content">
					<input name="orderPrepayId" type="text" class="form-control" maxlength="50" value = "${tDishwasherOrder.orderPrepayId}"  ignore="ignore"  />
				</div>
			</div>
		</div>
		</div>
	</form>
	</div>
 </div>
<script type="text/javascript">
var subDlgIndex = '';
$(document).ready(function() {
	$(".laydate-datetime").each(function(){
		var _this = this;
		laydate.render({
		  elem: _this,
		  format: 'yyyy-MM-dd HH:mm:ss',
		  type: 'datetime',
		  ready: function(date){
		  	 $(_this).val(DateJsonFormat(date,this.format));
		  }
		});
	});
	$(".laydate-date").each(function(){
		var _this = this;
		laydate.render({
		  elem: _this,
		  format: 'yyyy-MM-dd',
		  ready: function(date){
		  	 $(_this).val(DateJsonFormat(date,this.format));
		  }
		});
	});
	//单选框/多选框初始化
	$('.i-checks').iCheck({
		labelHover : false,
		cursor : true,
		checkboxClass : 'icheckbox_square-green',
		radioClass : 'iradio_square-green',
		increaseArea : '20%'
	});
	
	//表单提交
	$("#formobj").Validform({
		tiptype:function(msg,o,cssctl){
			if(o.type==3){
				validationMessage(o.obj,msg);
			}else{
				removeMessage(o.obj);
			}
		},
		btnSubmit : "#btn_sub",
		btnReset : "#btn_reset",
		ajaxPost : true,
		beforeSubmit : function(curform) {
		},
		usePlugin : {
			passwordstrength : {
				minLen : 6,
				maxLen : 18,
				trigger : function(obj, error) {
					if (error) {
						obj.parent().next().find(".Validform_checktip").show();
						obj.find(".passwordStrength").hide();
					} else {
						$(".passwordStrength").show();
						obj.parent().next().find(".Validform_checktip").hide();
					}
				}
			}
		},
		callback : function(data) {
			var win = frameElement.api.opener;
			if (data.success == true) {
				frameElement.api.close();
			    win.reloadTable();
			    win.tip(data.msg);
			} else {
			    if (data.responseText == '' || data.responseText == undefined) {
			        $.messager.alert('错误', data.msg);
			        $.Hidemsg();
			    } else {
			        try {
			            var emsg = data.responseText.substring(data.responseText.indexOf('错误描述'), data.responseText.indexOf('错误信息'));
			            $.messager.alert('错误', emsg);
			            $.Hidemsg();
			        } catch (ex) {
			            $.messager.alert('错误', data.responseText + "");
			            $.Hidemsg();
			        }
			    }
			    return false;
			}
		}
	});
});
</script>
</body>
</html>