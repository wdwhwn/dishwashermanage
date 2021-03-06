<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>t_dishwasher_device</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tDishwasherDeviceController.do?doUpdate" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id" value="${tDishwasherDevice.id}"/>
	<div class="form-group">
		<label for="deviceName" class="col-sm-3 control-label">deviceName：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="deviceName" name="deviceName" value='${tDishwasherDevice.deviceName}' type="text" maxlength="30" class="form-control input-sm" placeholder="请输入deviceName"  datatype="*"  ignore="checked" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceNumber" class="col-sm-3 control-label">deviceNumber：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="deviceNumber" name="deviceNumber" value='${tDishwasherDevice.deviceNumber}' type="text" maxlength="40" class="form-control input-sm" placeholder="请输入deviceNumber"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceState" class="col-sm-3 control-label">deviceState：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="deviceState" name="deviceState" value='${tDishwasherDevice.deviceState}' type="text" maxlength="5" class="form-control input-sm" placeholder="请输入deviceState"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceUserId" class="col-sm-3 control-label">deviceUserId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="deviceUserId" name="deviceUserId" value='${tDishwasherDevice.deviceUserId}' type="text" maxlength="10" class="form-control input-sm" placeholder="请输入deviceUserId"  datatype="n"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="devicePurchaseDate" class="col-sm-3 control-label">devicePurchaseDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		    <input id="devicePurchaseDate" name="devicePurchaseDate" type="text" class="form-control input-sm laydate-date" placeholder="请输入devicePurchaseDate"  ignore="ignore"  value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherDevice.devicePurchaseDate}'/>" />
                <span class="input-group-addon" ><span class="glyphicon glyphicon-calendar"></span></span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceRenewDate" class="col-sm-3 control-label">deviceRenewDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		    <input id="deviceRenewDate" name="deviceRenewDate" type="text" class="form-control input-sm laydate-date" placeholder="请输入deviceRenewDate"  ignore="ignore"  value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherDevice.deviceRenewDate}'/>" />
                <span class="input-group-addon" ><span class="glyphicon glyphicon-calendar"></span></span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceExpireDate" class="col-sm-3 control-label">deviceExpireDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		    <input id="deviceExpireDate" name="deviceExpireDate" type="text" class="form-control input-sm laydate-date" placeholder="请输入deviceExpireDate"  ignore="ignore"  value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherDevice.deviceExpireDate}'/>" />
                <span class="input-group-addon" ><span class="glyphicon glyphicon-calendar"></span></span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceEndDate" class="col-sm-3 control-label">deviceEndDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		    <input id="deviceEndDate" name="deviceEndDate" type="text" class="form-control input-sm laydate-date" placeholder="请输入deviceEndDate"  ignore="ignore"  value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherDevice.deviceEndDate}'/>" />
                <span class="input-group-addon" ><span class="glyphicon glyphicon-calendar"></span></span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="deviceStyleId" class="col-sm-3 control-label">deviceStyleId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="deviceStyleId" name="deviceStyleId" value='${tDishwasherDevice.deviceStyleId}' type="text" maxlength="10" class="form-control input-sm" placeholder="请输入deviceStyleId"  datatype="n"  ignore="ignore" />
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