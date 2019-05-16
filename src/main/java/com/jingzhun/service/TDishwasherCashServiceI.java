package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherCashEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherCashServiceI extends CommonService{
	
 	public void delete(TDishwasherCashEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherCashEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherCashEntity entity) throws Exception;
 	
}
