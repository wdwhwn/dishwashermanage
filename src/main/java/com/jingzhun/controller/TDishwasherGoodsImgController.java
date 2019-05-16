package com.jingzhun.controller;
import com.jingzhun.entity.TDishwasherGoodsImgEntity;
import com.jingzhun.service.TDishwasherGoodsImgServiceI;

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
 * @Description: t_dishwasher_goods_img
 * @author onlineGenerator
 * @date 2019-05-16 15:51:32
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/tDishwasherGoodsImgController")
public class TDishwasherGoodsImgController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TDishwasherGoodsImgController.class);

	@Autowired
	private TDishwasherGoodsImgServiceI tDishwasherGoodsImgService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * t_dishwasher_goods_img列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jingzhun/tDishwasherGoodsImgList");
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
	public void datagrid(TDishwasherGoodsImgEntity tDishwasherGoodsImg,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherGoodsImgEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherGoodsImg, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tDishwasherGoodsImgService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除t_dishwasher_goods_img
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TDishwasherGoodsImgEntity tDishwasherGoodsImg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tDishwasherGoodsImg = systemService.getEntity(TDishwasherGoodsImgEntity.class, tDishwasherGoodsImg.getId());
		message = "t_dishwasher_goods_img删除成功";
		try{
			tDishwasherGoodsImgService.delete(tDishwasherGoodsImg);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_goods_img删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除t_dishwasher_goods_img
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_goods_img删除成功";
		try{
			for(String id:ids.split(",")){
				TDishwasherGoodsImgEntity tDishwasherGoodsImg = systemService.getEntity(TDishwasherGoodsImgEntity.class, 
				Integer.parseInt(id)
				);
				tDishwasherGoodsImgService.delete(tDishwasherGoodsImg);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_goods_img删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加t_dishwasher_goods_img
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TDishwasherGoodsImgEntity tDishwasherGoodsImg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_goods_img添加成功";
		try{
			tDishwasherGoodsImgService.save(tDishwasherGoodsImg);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "t_dishwasher_goods_img添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新t_dishwasher_goods_img
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TDishwasherGoodsImgEntity tDishwasherGoodsImg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "t_dishwasher_goods_img更新成功";
		TDishwasherGoodsImgEntity t = tDishwasherGoodsImgService.get(TDishwasherGoodsImgEntity.class, tDishwasherGoodsImg.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tDishwasherGoodsImg, t);
			tDishwasherGoodsImgService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "t_dishwasher_goods_img更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * t_dishwasher_goods_img新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TDishwasherGoodsImgEntity tDishwasherGoodsImg, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherGoodsImg.getId())) {
			tDishwasherGoodsImg = tDishwasherGoodsImgService.getEntity(TDishwasherGoodsImgEntity.class, tDishwasherGoodsImg.getId());
			req.setAttribute("tDishwasherGoodsImg", tDishwasherGoodsImg);
		}
		return new ModelAndView("com/jingzhun/tDishwasherGoodsImg-add");
	}
	/**
	 * t_dishwasher_goods_img编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TDishwasherGoodsImgEntity tDishwasherGoodsImg, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tDishwasherGoodsImg.getId())) {
			tDishwasherGoodsImg = tDishwasherGoodsImgService.getEntity(TDishwasherGoodsImgEntity.class, tDishwasherGoodsImg.getId());
			req.setAttribute("tDishwasherGoodsImg", tDishwasherGoodsImg);
		}
		return new ModelAndView("com/jingzhun/tDishwasherGoodsImg-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tDishwasherGoodsImgController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TDishwasherGoodsImgEntity tDishwasherGoodsImg,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TDishwasherGoodsImgEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tDishwasherGoodsImg, request.getParameterMap());
		List<TDishwasherGoodsImgEntity> tDishwasherGoodsImgs = this.tDishwasherGoodsImgService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_goods_img");
		modelMap.put(NormalExcelConstants.CLASS,TDishwasherGoodsImgEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_goods_img列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tDishwasherGoodsImgs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TDishwasherGoodsImgEntity tDishwasherGoodsImg,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"t_dishwasher_goods_img");
    	modelMap.put(NormalExcelConstants.CLASS,TDishwasherGoodsImgEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("t_dishwasher_goods_img列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TDishwasherGoodsImgEntity> listTDishwasherGoodsImgEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TDishwasherGoodsImgEntity.class,params);
				for (TDishwasherGoodsImgEntity tDishwasherGoodsImg : listTDishwasherGoodsImgEntitys) {
					tDishwasherGoodsImgService.save(tDishwasherGoodsImg);
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
