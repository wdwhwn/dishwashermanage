package com.jingzhun.service;
import com.jingzhun.entity.TDishwasherGoodsImgEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TDishwasherGoodsImgServiceI extends CommonService{
	
 	public void delete(TDishwasherGoodsImgEntity entity) throws Exception;
 	
 	public Serializable save(TDishwasherGoodsImgEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TDishwasherGoodsImgEntity entity) throws Exception;
 	
}
