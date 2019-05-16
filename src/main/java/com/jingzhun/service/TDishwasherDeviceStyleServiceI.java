package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherDeviceStyleEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherDeviceStyleServiceI extends CommonService{
	
 	public void delete(TDishwasherDeviceStyleEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherDeviceStyleEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherDeviceStyleEntity entity) throws Exception;
 	
}
