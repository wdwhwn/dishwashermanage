<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>t_dishwasher_user</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<t:base type="bootstrap,bootstrap-table,layer,validform,bootstrap-form"></t:base>
</head>
 <body style="overflow:hidden;overflow-y:auto;margin-top: 20px">
 <form id="formobj" action="tDishwasherUserController.do?doAdd" class="form-horizontal validform" role="form"  method="post">
	<input type="hidden" id="btn_sub" class="btn_sub"/>
	<input type="hidden" id="id" name="id"/>
	<div class="form-group">
		<label for="userName" class="col-sm-3 control-label">userName：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userName" name="userName" type="text" maxlength="30" class="form-control input-sm" placeholder="请输入userName"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userWxImg" class="col-sm-3 control-label">userWxImg：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userWxImg" name="userWxImg" type="text" maxlength="255" class="form-control input-sm" placeholder="请输入userWxImg"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userWxName" class="col-sm-3 control-label">userWxName：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userWxName" name="userWxName" type="text" maxlength="30" class="form-control input-sm" placeholder="请输入userWxName"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userTotalScore" class="col-sm-3 control-label">userTotalScore：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userTotalScore" name="userTotalScore" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入userTotalScore"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userCurrentScore" class="col-sm-3 control-label">userCurrentScore：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userCurrentScore" name="userCurrentScore" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入userCurrentScore"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userConsumeScore" class="col-sm-3 control-label">userConsumeScore：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userConsumeScore" name="userConsumeScore" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入userConsumeScore"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userPid" class="col-sm-3 control-label">userPid：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userPid" name="userPid" type="text" maxlength="10" class="form-control input-sm" placeholder="请输入userPid"  datatype="n"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userVipId" class="col-sm-3 control-label">userVipId：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userVipId" name="userVipId" type="text" maxlength="10" class="form-control input-sm" placeholder="请输入userVipId"  datatype="n"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userDate" class="col-sm-3 control-label">userDate：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
      		   <input id="userDate" name="userDate" type="text" class="form-control input-sm" placeholder="请输入userDate"  ignore="ignore" />
                   <span class="input-group-addon" >
                       <span class="glyphicon glyphicon-calendar"></span>
                   </span>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userType" class="col-sm-3 control-label">userType：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userType" name="userType" type="text" maxlength="5" class="form-control input-sm" placeholder="请输入userType"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userPassword" class="col-sm-3 control-label">userPassword：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userPassword" name="userPassword" type="text" maxlength="50" class="form-control input-sm" placeholder="请输入userPassword"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userDeleteState" class="col-sm-3 control-label">userDeleteState：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userDeleteState" name="userDeleteState" type="text" maxlength="2" class="form-control input-sm" placeholder="请输入userDeleteState"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userWxOpenid" class="col-sm-3 control-label">userWxOpenid：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userWxOpenid" name="userWxOpenid" type="text" maxlength="255" class="form-control input-sm" placeholder="请输入userWxOpenid"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userWxNameReal" class="col-sm-3 control-label">userWxNameReal：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userWxNameReal" name="userWxNameReal" type="text" maxlength="15" class="form-control input-sm" placeholder="请输入userWxNameReal"  ignore="ignore" />
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="userMobile" class="col-sm-3 control-label">userMobile：</label>
		<div class="col-sm-7">
			<div class="input-group" style="width:100%">
				<input id="userMobile" name="userMobile" type="text" maxlength="20" class="form-control input-sm" placeholder="请输入userMobile"  ignore="ignore" />
			</div>
		</div>
	</div>
</form>
<script type="text/javascript">
	var subDlgIndex = '';
	$(document).ready(function() {
				//userDate 日期控件初始化
			    laydate.render({
				   elem: '#userDate'
				  ,type: 'date'
				  ,trigger: 'click' //采用click弹出
				  ,ready: function(date){
				  	 $("#userDate").val(DateJsonFormat(date,this.format));
				  }
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