package com.jingzhun.controller;
import com.jingzhun.entity.TDishwasherDeviceEntity;
import com.jingzhun.service.TDishwasherDeviceServiceI;

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
 * @Description: t_dishwasher_device
 * @author onlineGenerator
 * @date 2019-05-16 14:40:35
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/tDishwasherDeviceController")
public class TDishwasherDeviceController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TDishwasherDeviceController.class);

	@Autowired
	private TDishwasherDeviceServiceI tDishwasherDeviceService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * t_dishwasher_device列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jingzhun/tDishwasherDeviceList");
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
	public void datagrid(TDishwasherDeviceEntity tDishwasherDevice,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherDeviceEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherDevice, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tDishwasherDeviceService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除t_dishwasher_device
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TDishwasherDeviceEntity tDishwasherDevice, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tDishwasherDevice = systemService.getEntity(TDishwasherDeviceEntity.class, tDishwasherDevice.getId());
		message = "t_dishwasher_device删除成功";
		try{
			tDishwasherDeviceService.delete(tDishwasherDevice);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除t_dishwasher_device
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device删除成功";
		try{
			for(String id:ids.split(",")){
				TDishwasherDeviceEntity tDishwasherDevice = systemService.getEntity(TDishwasherDeviceEntity.class, 
				Integer.parseInt(id)
				);
				tDishwasherDeviceService.delete(tDishwasherDevice);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加t_dishwasher_device
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TDishwasherDeviceEntity tDishwasherDevice, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device添加成功";
		try{
			tDishwasherDeviceService.save(tDishwasherDevice);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_device添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新t_dishwasher_device
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TDishwasherDeviceEntity tDishwasherDevice, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_device更新成功";
		TDishwasherDeviceEntity t = tDishwasherDeviceService.get(TDishwasherDeviceEntity.class, tDishwasherDevice.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tDishwasherDevice, t);
			tDishwasherDeviceService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "t_dishwasher_device更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * t_dishwasher_device新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TDishwasherDeviceEntity tDishwasherDevice, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherDevice.getId())) {
			tDishwasherDevice = tDishwasherDeviceService.getEntity(TDishwasherDeviceEntity.class, tDishwasherDevice.getId());
			req.setAttribute("tDishwasherDevice", tDishwasherDevice);
		}
		return new ModelAndView("com/jingzhun/tDishwasherDevice-add");
	}
	/**
	 * t_dishwasher_device编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TDishwasherDeviceEntity tDishwasherDevice, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherDevice.getId())) {
			tDishwasherDevice = tDishwasherDeviceService.getEntity(TDishwasherDeviceEntity.class, tDishwasherDevice.getId());
			req.setAttribute("tDishwasherDevice", tDishwasherDevice);
		}
		return new ModelAndView("com/jingzhun/tDishwasherDevice-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tDishwasherDeviceController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TDishwasherDeviceEntity tDishwasherDevice,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherDeviceEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherDevice, request.getParameterMap());
		List<TDishwasherDeviceEntity> tDishwasherDevices = this.tDishwasherDeviceService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_device");
		modelMap.put(NormalExcelConstants.CLASS,TDishwasherDeviceEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_device列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tDishwasherDevices);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TDishwasherDeviceEntity tDishwasherDevice,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_device");
    	modelMap.put(NormalExcelConstants.CLASS,TDishwasherDeviceEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_device列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TDishwasherDeviceEntity> listTDishwasherDeviceEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TDishwasherDeviceEntity.class,params);
				for (TDishwasherDeviceEntity tDishwasherDevice : listTDishwasherDeviceEntitys) {
					tDishwasherDeviceService.save(tDishwasherDevice);
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
