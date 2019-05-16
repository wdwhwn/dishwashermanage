package com.jingzhun.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: t_dishwasher_goods
 * @author onlineGenerator
 * @date 2019-05-16 15:50:55
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_goods", schema = "")
@SuppressWarnings("serial")
public class TDishwasherGoodsEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**goodsSn*/
	@Excel(name="goodsSn",width=15)
	private java.lang.String goodsSn;
	/**goodsTitle*/
	@Excel(name="goodsTitle",width=15)
	private java.lang.String goodsTitle;
	/**goodsCurrnetScore*/
	@Excel(name="goodsCurrnetScore",width=15)
	private java.math.BigDecimal goodsCurrnetScore;
	/**goodsOriginScore*/
	@Excel(name="goodsOriginScore",width=15)
	private java.math.BigDecimal goodsOriginScore;
	/**goodsServiceType*/
	@Excel(name="goodsServiceType",width=15)
	private java.lang.String goodsServiceType;
	/**goodsBusiness*/
	@Excel(name="goodsBusiness",width=15)
	private java.lang.String goodsBusiness;
	/**goodsDescribe*/
	@Excel(name="goodsDescribe",width=15)
	private java.lang.String goodsDescribe;
	/**goodsDeleteState*/
	@Excel(name="goodsDeleteState",width=15)
	private java.lang.String goodsDeleteState;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=10)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsSn
	 */

	@Column(name ="GOODS_SN",nullable=true,length=50)
	public java.lang.String getGoodsSn(){
		return this.goodsSn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsSn
	 */
	public void setGoodsSn(java.lang.String goodsSn){
		this.goodsSn = goodsSn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsTitle
	 */

	@Column(name ="GOODS_TITLE",nullable=true,length=255)
	public java.lang.String getGoodsTitle(){
		return this.goodsTitle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsTitle
	 */
	public void setGoodsTitle(java.lang.String goodsTitle){
		this.goodsTitle = goodsTitle;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  goodsCurrnetScore
	 */

	@Column(name ="GOODS_CURRNET_SCORE",nullable=true,scale=5,length=50)
	public java.math.BigDecimal getGoodsCurrnetScore(){
		return this.goodsCurrnetScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  goodsCurrnetScore
	 */
	public void setGoodsCurrnetScore(java.math.BigDecimal goodsCurrnetScore){
		this.goodsCurrnetScore = goodsCurrnetScore;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  goodsOriginScore
	 */

	@Column(name ="GOODS_ORIGIN_SCORE",nullable=true,scale=5,length=50)
	public java.math.BigDecimal getGoodsOriginScore(){
		return this.goodsOriginScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  goodsOriginScore
	 */
	public void setGoodsOriginScore(java.math.BigDecimal goodsOriginScore){
		this.goodsOriginScore = goodsOriginScore;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsServiceType
	 */

	@Column(name ="GOODS_SERVICE_TYPE",nullable=true,length=20)
	public java.lang.String getGoodsServiceType(){
		return this.goodsServiceType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsServiceType
	 */
	public void setGoodsServiceType(java.lang.String goodsServiceType){
		this.goodsServiceType = goodsServiceType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsBusiness
	 */

	@Column(name ="GOODS_BUSINESS",nullable=true,length=255)
	public java.lang.String getGoodsBusiness(){
		return this.goodsBusiness;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsBusiness
	 */
	public void setGoodsBusiness(java.lang.String goodsBusiness){
		this.goodsBusiness = goodsBusiness;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsDescribe
	 */

	@Column(name ="GOODS_DESCRIBE",nullable=true,length=255)
	public java.lang.String getGoodsDescribe(){
		return this.goodsDescribe;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsDescribe
	 */
	public void setGoodsDescribe(java.lang.String goodsDescribe){
		this.goodsDescribe = goodsDescribe;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsDeleteState
	 */

	@Column(name ="GOODS_DELETE_STATE",nullable=true,length=2)
	public java.lang.String getGoodsDeleteState(){
		return this.goodsDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsDeleteState
	 */
	public void setGoodsDeleteState(java.lang.String goodsDeleteState){
		this.goodsDeleteState = goodsDeleteState;
	}
}