package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherRatioEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherRatioServiceI extends CommonService{
	
 	public void delete(TDishwasherRatioEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherRatioEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherRatioEntity entity) throws Exception;
 	
}
