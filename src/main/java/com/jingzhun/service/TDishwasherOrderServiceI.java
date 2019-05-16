package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherOrderEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherOrderServiceI extends CommonService{
	
 	public void delete(TDishwasherOrderEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherOrderEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherOrderEntity entity) throws Exception;
 	
}
