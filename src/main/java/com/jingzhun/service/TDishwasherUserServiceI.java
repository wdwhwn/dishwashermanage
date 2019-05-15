package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherUserEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherUserServiceI extends CommonService{
	
 	public void delete(TDishwasherUserEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherUserEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherUserEntity entity) throws Exception;
 	
}
