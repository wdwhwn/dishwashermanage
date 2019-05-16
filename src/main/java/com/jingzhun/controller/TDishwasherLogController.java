package com.jingzhun.controller;
import com.jingzhun.entity.TDishwasherLogEntity;
import com.jingzhun.service.TDishwasherLogServiceI;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**   
 * @Title: Controller  
 * @Description: t_dishwasher_log
 * @author onlineGenerator
 * @date 2019-05-16 14:40:51
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/tDishwasherLogController")
public class TDishwasherLogController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TDishwasherLogController.class);

	@Autowired
	private TDishwasherLogServiceI tDishwasherLogService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * t_dishwasher_log列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jingzhun/tDishwasherLogList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TDishwasherLogEntity tDishwasherLog,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherLogEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherLog, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tDishwasherLogService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除t_dishwasher_log
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TDishwasherLogEntity tDishwasherLog, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tDishwasherLog = systemService.getEntity(TDishwasherLogEntity.class, tDishwasherLog.getId());
		message = "t_dishwasher_log删除成功";
		try{
			tDishwasherLogService.delete(tDishwasherLog);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_log删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除t_dishwasher_log
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_log删除成功";
		try{
			for(String id:ids.split(",")){
				TDishwasherLogEntity tDishwasherLog = systemService.getEntity(TDishwasherLogEntity.class, 
				Integer.parseInt(id)
				);
				tDishwasherLogService.delete(tDishwasherLog);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_log删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加t_dishwasher_log
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TDishwasherLogEntity tDishwasherLog, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_log添加成功";
		try{
			tDishwasherLogService.save(tDishwasherLog);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_log添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新t_dishwasher_log
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TDishwasherLogEntity tDishwasherLog, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_log更新成功";
		TDishwasherLogEntity t = tDishwasherLogService.get(TDishwasherLogEntity.class, tDishwasherLog.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tDishwasherLog, t);
			tDishwasherLogService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "t_dishwasher_log更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * t_dishwasher_log新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TDishwasherLogEntity tDishwasherLog, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherLog.getId())) {
			tDishwasherLog = tDishwasherLogService.getEntity(TDishwasherLogEntity.class, tDishwasherLog.getId());
			req.setAttribute("tDishwasherLog", tDishwasherLog);
		}
		return new ModelAndView("com/jingzhun/tDishwasherLog-add");
	}
	/**
	 * t_dishwasher_log编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TDishwasherLogEntity tDishwasherLog, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherLog.getId())) {
			tDishwasherLog = tDishwasherLogService.getEntity(TDishwasherLogEntity.class, tDishwasherLog.getId());
			req.setAttribute("tDishwasherLog", tDishwasherLog);
		}
		return new ModelAndView("com/jingzhun/tDishwasherLog-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tDishwasherLogController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TDishwasherLogEntity tDishwasherLog,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherLogEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherLog, request.getParameterMap());
		List<TDishwasherLogEntity> tDishwasherLogs = this.tDishwasherLogService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_log");
		modelMap.put(NormalExcelConstants.CLASS,TDishwasherLogEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_log列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tDishwasherLogs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TDishwasherLogEntity tDishwasherLog,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_log");
    	modelMap.put(NormalExcelConstants.CLASS,TDishwasherLogEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_log列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<TDishwasherLogEntity> listTDishwasherLogEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TDishwasherLogEntity.class,params);
				for (TDishwasherLogEntity tDishwasherLog : listTDishwasherLogEntitys) {
					tDishwasherLogService.save(tDishwasherLog);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	
}
