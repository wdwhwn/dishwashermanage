package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherAccountEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherAccountServiceI extends CommonService{
	
 	public void delete(TDishwasherAccountEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherAccountEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherAccountEntity entity) throws Exception;
 	
}
