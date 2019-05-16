package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherLogEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherLogServiceI extends CommonService{
	
 	public void delete(TDishwasherLogEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherLogEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherLogEntity entity) throws Exception;
 	
}
