package com.jingzhun.controller;
import com.jingzhun.entity.TDishwasherDeviceStyleEntity;
import com.jingzhun.service.TDishwasherDeviceStyleServiceI;

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
 * @Description: t_dishwasher_device_style
 * @author onlineGenerator
 * @date 2019-05-16 15:50:37
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/tDishwasherDeviceStyleController")
public class TDishwasherDeviceStyleController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TDishwasherDeviceStyleController.class);

	@Autowired
	private TDishwasherDeviceStyleServiceI tDishwasherDeviceStyleService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * t_dishwasher_device_style列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jingzhun/tDishwasherDeviceStyleList");
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
	public void datagrid(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherDeviceStyleEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherDeviceStyle, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tDishwasherDeviceStyleService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除t_dishwasher_device_style
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tDishwasherDeviceStyle = systemService.getEntity(TDishwasherDeviceStyleEntity.class, tDishwasherDeviceStyle.getId());
		message = "t_dishwasher_device_style删除成功";
		try{
			tDishwasherDeviceStyleService.delete(tDishwasherDeviceStyle);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device_style删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除t_dishwasher_device_style
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device_style删除成功";
		try{
			for(String id:ids.split(",")){
				TDishwasherDeviceStyleEntity tDishwasherDeviceStyle = systemService.getEntity(TDishwasherDeviceStyleEntity.class, 
				Integer.parseInt(id)
				);
				tDishwasherDeviceStyleService.delete(tDishwasherDeviceStyle);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device_style删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加t_dishwasher_device_style
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device_style添加成功";
		try{
			tDishwasherDeviceStyleService.save(tDishwasherDeviceStyle);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device_style添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新t_dishwasher_device_style
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device_style更新成功";
		TDishwasherDeviceStyleEntity t = tDishwasherDeviceStyleService.get(TDishwasherDeviceStyleEntity.class, tDishwasherDeviceStyle.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tDishwasherDeviceStyle, t);
			tDishwasherDeviceStyleService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "t_dishwasher_device_style更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * t_dishwasher_device_style新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherDeviceStyle.getId())) {
			tDishwasherDeviceStyle = tDishwasherDeviceStyleService.getEntity(TDishwasherDeviceStyleEntity.class, tDishwasherDeviceStyle.getId());
			req.setAttribute("tDishwasherDeviceStyle", tDishwasherDeviceStyle);
		}
		return new ModelAndView("com/jingzhun/tDishwasherDeviceStyle-add");
	}
	/**
	 * t_dishwasher_device_style编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherDeviceStyle.getId())) {
			tDishwasherDeviceStyle = tDishwasherDeviceStyleService.getEntity(TDishwasherDeviceStyleEntity.class, tDishwasherDeviceStyle.getId());
			req.setAttribute("tDishwasherDeviceStyle", tDishwasherDeviceStyle);
		}
		return new ModelAndView("com/jingzhun/tDishwasherDeviceStyle-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tDishwasherDeviceStyleController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherDeviceStyleEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherDeviceStyle, request.getParameterMap());
		List<TDishwasherDeviceStyleEntity> tDishwasherDeviceStyles = this.tDishwasherDeviceStyleService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_device_style");
		modelMap.put(NormalExcelConstants.CLASS,TDishwasherDeviceStyleEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_device_style列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tDishwasherDeviceStyles);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TDishwasherDeviceStyleEntity tDishwasherDeviceStyle,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_device_style");
    	modelMap.put(NormalExcelConstants.CLASS,TDishwasherDeviceStyleEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_device_style列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TDishwasherDeviceStyleEntity> listTDishwasherDeviceStyleEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TDishwasherDeviceStyleEntity.class,params);
				for (TDishwasherDeviceStyleEntity tDishwasherDeviceStyle : listTDishwasherDeviceStyleEntitys) {
					tDishwasherDeviceStyleService.save(tDishwasherDeviceStyle);
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
