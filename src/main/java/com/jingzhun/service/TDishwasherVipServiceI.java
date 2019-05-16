package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherVipEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherVipServiceI extends CommonService{
	
 	public void delete(TDishwasherVipEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherVipEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherVipEntity entity) throws Exception;
 	
}
