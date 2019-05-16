package com.jingzhun.controller;
import com.jingzhun.entity.TDishwasherOrderEntity;
import com.jingzhun.service.TDishwasherOrderServiceI;

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
 * @Description: t_dishwasher_order
 * @author onlineGenerator
 * @date 2019-05-16 15:51:47
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/tDishwasherOrderController")
public class TDishwasherOrderController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TDishwasherOrderController.class);

	@Autowired
	private TDishwasherOrderServiceI tDishwasherOrderService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * t_dishwasher_order列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jingzhun/tDishwasherOrderList");
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
	public void datagrid(TDishwasherOrderEntity tDishwasherOrder,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherOrderEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherOrder, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tDishwasherOrderService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除t_dishwasher_order
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TDishwasherOrderEntity tDishwasherOrder, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tDishwasherOrder = systemService.getEntity(TDishwasherOrderEntity.class, tDishwasherOrder.getId());
		message = "t_dishwasher_order删除成功";
		try{
			tDishwasherOrderService.delete(tDishwasherOrder);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_order删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除t_dishwasher_order
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_order删除成功";
		try{
			for(String id:ids.split(",")){
				TDishwasherOrderEntity tDishwasherOrder = systemService.getEntity(TDishwasherOrderEntity.class, 
				Integer.parseInt(id)
				);
				tDishwasherOrderService.delete(tDishwasherOrder);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_order删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加t_dishwasher_order
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TDishwasherOrderEntity tDishwasherOrder, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_order添加成功";
		try{
			tDishwasherOrderService.save(tDishwasherOrder);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_order添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新t_dishwasher_order
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TDishwasherOrderEntity tDishwasherOrder, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_order更新成功";
		TDishwasherOrderEntity t = tDishwasherOrderService.get(TDishwasherOrderEntity.class, tDishwasherOrder.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tDishwasherOrder, t);
			tDishwasherOrderService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "t_dishwasher_order更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * t_dishwasher_order新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TDishwasherOrderEntity tDishwasherOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherOrder.getId())) {
			tDishwasherOrder = tDishwasherOrderService.getEntity(TDishwasherOrderEntity.class, tDishwasherOrder.getId());
			req.setAttribute("tDishwasherOrder", tDishwasherOrder);
		}
		return new ModelAndView("com/jingzhun/tDishwasherOrder-add");
	}
	/**
	 * t_dishwasher_order编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TDishwasherOrderEntity tDishwasherOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherOrder.getId())) {
			tDishwasherOrder = tDishwasherOrderService.getEntity(TDishwasherOrderEntity.class, tDishwasherOrder.getId());
			req.setAttribute("tDishwasherOrder", tDishwasherOrder);
		}
		return new ModelAndView("com/jingzhun/tDishwasherOrder-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tDishwasherOrderController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TDishwasherOrderEntity tDishwasherOrder,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherOrderEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherOrder, request.getParameterMap());
		List<TDishwasherOrderEntity> tDishwasherOrders = this.tDishwasherOrderService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_order");
		modelMap.put(NormalExcelConstants.CLASS,TDishwasherOrderEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_order列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tDishwasherOrders);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TDishwasherOrderEntity tDishwasherOrder,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_order");
    	modelMap.put(NormalExcelConstants.CLASS,TDishwasherOrderEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_order列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TDishwasherOrderEntity> listTDishwasherOrderEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TDishwasherOrderEntity.class,params);
				for (TDishwasherOrderEntity tDishwasherOrder : listTDishwasherOrderEntitys) {
					tDishwasherOrderService.save(tDishwasherOrder);
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
