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
 * @Description: t_dishwasher_goods_img
 * @author onlineGenerator
 * @date 2019-05-16 15:51:32
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_goods_img", schema = "")
@SuppressWarnings("serial")
public class TDishwasherGoodsImgEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**goodsImgImg*/
	@Excel(name="goodsImgImg",width=15)
	private java.lang.String goodsImgImg;
	/**goodsImgGoodsId*/
	@Excel(name="goodsImgGoodsId",width=15)
	private java.lang.Integer goodsImgGoodsId;
	/**goodsImgState*/
	@Excel(name="goodsImgState",width=15)
	private java.lang.String goodsImgState;
	/**goodsImgType*/
	@Excel(name="goodsImgType",width=15)
	private java.lang.String goodsImgType;
	
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
	 *@return: java.lang.String  goodsImgImg
	 */

	@Column(name ="GOODS_IMG_IMG",nullable=true,length=30)
	public java.lang.String getGoodsImgImg(){
		return this.goodsImgImg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsImgImg
	 */
	public void setGoodsImgImg(java.lang.String goodsImgImg){
		this.goodsImgImg = goodsImgImg;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  goodsImgGoodsId
	 */

	@Column(name ="GOODS_IMG_GOODS_ID",nullable=true,length=10)
	public java.lang.Integer getGoodsImgGoodsId(){
		return this.goodsImgGoodsId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  goodsImgGoodsId
	 */
	public void setGoodsImgGoodsId(java.lang.Integer goodsImgGoodsId){
		this.goodsImgGoodsId = goodsImgGoodsId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsImgState
	 */

	@Column(name ="GOODS_IMG_STATE",nullable=true,length=2)
	public java.lang.String getGoodsImgState(){
		return this.goodsImgState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsImgState
	 */
	public void setGoodsImgState(java.lang.String goodsImgState){
		this.goodsImgState = goodsImgState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  goodsImgType
	 */

	@Column(name ="GOODS_IMG_TYPE",nullable=true,length=2)
	public java.lang.String getGoodsImgType(){
		return this.goodsImgType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  goodsImgType
	 */
	public void setGoodsImgType(java.lang.String goodsImgType){
		this.goodsImgType = goodsImgType;
	}
}