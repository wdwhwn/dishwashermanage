package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherGoodsEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherGoodsServiceI extends CommonService{
	
 	public void delete(TDishwasherGoodsEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherGoodsEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherGoodsEntity entity) throws Exception;
 	
}
