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
 * @Description: t_dishwasher_device_style
 * @author onlineGenerator
 * @date 2019-05-16 15:50:37
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_device_style", schema = "")
@SuppressWarnings("serial")
public class TDishwasherDeviceStyleEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**devieStyleName*/
	@Excel(name="devieStyleName",width=15)
	private java.lang.String devieStyleName;
	/**devieStyleMonthSupply*/
	@Excel(name="devieStyleMonthSupply",width=15)
	private java.math.BigDecimal devieStyleMonthSupply;
	/**deviceStyleNumber*/
	@Excel(name="deviceStyleNumber",width=15)
	private java.lang.Integer deviceStyleNumber;
	
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
	 *@return: java.lang.String  devieStyleName
	 */

	@Column(name ="DEVIE_STYLE_NAME",nullable=true,length=30)
	public java.lang.String getDevieStyleName(){
		return this.devieStyleName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  devieStyleName
	 */
	public void setDevieStyleName(java.lang.String devieStyleName){
		this.devieStyleName = devieStyleName;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  devieStyleMonthSupply
	 */

	@Column(name ="DEVIE_STYLE_MONTH_SUPPLY",nullable=true,scale=2,length=10)
	public java.math.BigDecimal getDevieStyleMonthSupply(){
		return this.devieStyleMonthSupply;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  devieStyleMonthSupply
	 */
	public void setDevieStyleMonthSupply(java.math.BigDecimal devieStyleMonthSupply){
		this.devieStyleMonthSupply = devieStyleMonthSupply;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  deviceStyleNumber
	 */

	@Column(name ="DEVICE_STYLE_NUMBER",nullable=true,length=10)
	public java.lang.Integer getDeviceStyleNumber(){
		return this.deviceStyleNumber;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  deviceStyleNumber
	 */
	public void setDeviceStyleNumber(java.lang.Integer deviceStyleNumber){
		this.deviceStyleNumber = deviceStyleNumber;
	}
}