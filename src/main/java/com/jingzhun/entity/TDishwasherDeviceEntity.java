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
 * @Description: t_dishwasher_device
 * @author onlineGenerator
 * @date 2019-05-16 14:40:35
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_device", schema = "")
@SuppressWarnings("serial")
public class TDishwasherDeviceEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**deviceName*/
	@Excel(name="deviceName",width=15)
	private java.lang.String deviceName;
	/**deviceNumber*/
	@Excel(name="deviceNumber",width=15)
	private java.lang.String deviceNumber;
	/**deviceState*/
	@Excel(name="deviceState",width=15)
	private java.lang.String deviceState;
	/**deviceUserId*/
	@Excel(name="deviceUserId",width=15)
	private java.lang.Integer deviceUserId;
	/**devicePurchaseDate*/
	@Excel(name="devicePurchaseDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date devicePurchaseDate;
	/**deviceRenewDate*/
	@Excel(name="deviceRenewDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date deviceRenewDate;
	/**deviceExpireDate*/
	@Excel(name="deviceExpireDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date deviceExpireDate;
	/**deviceEndDate*/
	@Excel(name="deviceEndDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date deviceEndDate;
	/**deviceStyleId*/
	@Excel(name="deviceStyleId",width=15)
	private java.lang.Integer deviceStyleId;
	
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
	 *@return: java.lang.String  deviceName
	 */

	@Column(name ="DEVICE_NAME",nullable=false,length=30)
	public java.lang.String getDeviceName(){
		return this.deviceName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  deviceName
	 */
	public void setDeviceName(java.lang.String deviceName){
		this.deviceName = deviceName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  deviceNumber
	 */

	@Column(name ="DEVICE_NUMBER",nullable=true,length=40)
	public java.lang.String getDeviceNumber(){
		return this.deviceNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  deviceNumber
	 */
	public void setDeviceNumber(java.lang.String deviceNumber){
		this.deviceNumber = deviceNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  deviceState
	 */

	@Column(name ="DEVICE_STATE",nullable=true,length=5)
	public java.lang.String getDeviceState(){
		return this.deviceState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  deviceState
	 */
	public void setDeviceState(java.lang.String deviceState){
		this.deviceState = deviceState;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  deviceUserId
	 */

	@Column(name ="DEVICE_USER_ID",nullable=true,length=10)
	public java.lang.Integer getDeviceUserId(){
		return this.deviceUserId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  deviceUserId
	 */
	public void setDeviceUserId(java.lang.Integer deviceUserId){
		this.deviceUserId = deviceUserId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  devicePurchaseDate
	 */

	@Column(name ="DEVICE_PURCHASE_DATE",nullable=true)
	public java.util.Date getDevicePurchaseDate(){
		return this.devicePurchaseDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  devicePurchaseDate
	 */
	public void setDevicePurchaseDate(java.util.Date devicePurchaseDate){
		this.devicePurchaseDate = devicePurchaseDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  deviceRenewDate
	 */

	@Column(name ="DEVICE_RENEW_DATE",nullable=true)
	public java.util.Date getDeviceRenewDate(){
		return this.deviceRenewDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  deviceRenewDate
	 */
	public void setDeviceRenewDate(java.util.Date deviceRenewDate){
		this.deviceRenewDate = deviceRenewDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  deviceExpireDate
	 */

	@Column(name ="DEVICE_EXPIRE_DATE",nullable=true)
	public java.util.Date getDeviceExpireDate(){
		return this.deviceExpireDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  deviceExpireDate
	 */
	public void setDeviceExpireDate(java.util.Date deviceExpireDate){
		this.deviceExpireDate = deviceExpireDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  deviceEndDate
	 */

	@Column(name ="DEVICE_END_DATE",nullable=true)
	public java.util.Date getDeviceEndDate(){
		return this.deviceEndDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  deviceEndDate
	 */
	public void setDeviceEndDate(java.util.Date deviceEndDate){
		this.deviceEndDate = deviceEndDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  deviceStyleId
	 */

	@Column(name ="DEVICE_STYLE_ID",nullable=true,length=10)
	public java.lang.Integer getDeviceStyleId(){
		return this.deviceStyleId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  deviceStyleId
	 */
	public void setDeviceStyleId(java.lang.Integer deviceStyleId){
		this.deviceStyleId = deviceStyleId;
	}
}