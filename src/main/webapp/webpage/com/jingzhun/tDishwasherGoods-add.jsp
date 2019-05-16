<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>t_dishwasher_goods</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;">
 <div class="container" style="width:100%;">
	<div class="panel-heading"></div>
	<div class="panel-body">
	<form class="form-horizontal" role="form" id="formobj" action="tDishwasherGoodsController.do?doAdd" method="POST">
		<input type="hidden" id="btn_sub" class="btn_sub"/>
		<input type="hidden" id="id" name="id"/>
		<div class="form-group">
			<label for="goodsSn" class="col-sm-3 control-label">goodsSn：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsSn" name="goodsSn" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入goodsSn"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsTitle" class="col-sm-3 control-label">goodsTitle：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsTitle" name="goodsTitle" type="text" maxlength="255" class="form-control input-sm" placeholder="请输入goodsTitle"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsCurrnetScore" class="col-sm-3 control-label">goodsCurrnetScore：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsCurrnetScore" name="goodsCurrnetScore" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入goodsCurrnetScore"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsOriginScore" class="col-sm-3 control-label">goodsOriginScore：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsOriginScore" name="goodsOriginScore" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入goodsOriginScore"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsServiceType" class="col-sm-3 control-label">goodsServiceType：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsServiceType" name="goodsServiceType" type="text" maxlength="20" class="form-control input-sm" placeholder="请输入goodsServiceType"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsBusiness" class="col-sm-3 control-label">goodsBusiness：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsBusiness" name="goodsBusiness" type="text" maxlength="255" class="form-control input-sm" placeholder="请输入goodsBusiness"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsDescribe" class="col-sm-3 control-label">goodsDescribe：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsDescribe" name="goodsDescribe" type="text" maxlength="255" class="form-control input-sm" placeholder="请输入goodsDescribe"  ignore="ignore" />
				</div>
			</div>
		</div>
		<div class="form-group">
			<label for="goodsDeleteState" class="col-sm-3 control-label">goodsDeleteState：</label>
			<div class="col-sm-7">
				<div class="input-group" style="width:100%">
					<input id="goodsDeleteState" name="goodsDeleteState" type="text" maxlength="2" class="form-control input-sm" placeholder="请输入goodsDeleteState"  ignore="ignore" />
				</div>
			</div>
		</div>
	</form>
	</div>
 </div>
<script type="text/javascript">
var subDlgIndex = '';
$(document).ready(function() {
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