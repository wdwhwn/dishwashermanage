package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherDeviceEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherDeviceServiceI extends CommonService{
	
 	public void delete(TDishwasherDeviceEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherDeviceEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherDeviceEntity entity) throws Exception;
 	
}
