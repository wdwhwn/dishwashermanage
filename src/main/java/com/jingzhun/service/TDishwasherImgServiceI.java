package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherImgEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherImgServiceI extends CommonService{
	
 	public void delete(TDishwasherImgEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherImgEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherImgEntity entity) throws Exception;
 	
}
