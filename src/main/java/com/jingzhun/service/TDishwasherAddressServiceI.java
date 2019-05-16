package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherAddressEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherAddressServiceI extends CommonService{
	
 	public void delete(TDishwasherAddressEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherAddressEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherAddressEntity entity) throws Exception;
 	
}
