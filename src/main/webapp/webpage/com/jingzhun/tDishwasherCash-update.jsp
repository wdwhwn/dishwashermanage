<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>t_dishwasher_cash</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tDishwasherCashController.do?doUpdate" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id" value="${tDishwasherCash.id}"/>
	<div class="form-group">
		<label for="cashDate" class="col-sm-3 control-label">cashDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		    <input id="cashDate" name="cashDate" type="text" class="form-control input-sm laydate-date" placeholder="请输入cashDate"  ignore="ignore"  value="<fmt:formatDate pattern='yyyy-MM-dd' type='date' value='${tDishwasherCash.cashDate}'/>" />
                <span class="input-group-addon" ><span class="glyphicon glyphicon-calendar"></span></span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="cashScore" class="col-sm-3 control-label">cashScore：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="cashScore" name="cashScore" value='${tDishwasherCash.cashScore}' type="text" maxlength="50" class="form-control input-sm" placeholder="请输入cashScore"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="cashState" class="col-sm-3 control-label">cashState：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="cashState" name="cashState" value='${tDishwasherCash.cashState}' type="text" maxlength="2" class="form-control input-sm" placeholder="请输入cashState"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="cashAccountId" class="col-sm-3 control-label">cashAccountId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="cashAccountId" name="cashAccountId" value='${tDishwasherCash.cashAccountId}' type="text" maxlength="10" class="form-control input-sm" placeholder="请输入cashAccountId"  datatype="n"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="cashUserId" class="col-sm-3 control-label">cashUserId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="cashUserId" name="cashUserId" value='${tDishwasherCash.cashUserId}' type="text" maxlength="10" class="form-control input-sm" placeholder="请输入cashUserId"  datatype="n"  ignore="ignore" />
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