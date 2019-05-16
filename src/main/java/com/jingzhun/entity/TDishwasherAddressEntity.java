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
 * @Description: t_dishwasher_address
 * @author onlineGenerator
 * @date 2019-05-16 15:52:04
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_address", schema = "")
@SuppressWarnings("serial")
public class TDishwasherAddressEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**addressName*/
	@Excel(name="addressName",width=15)
	private java.lang.String addressName;
	/**addressPhone*/
	@Excel(name="addressPhone",width=15)
	private java.lang.String addressPhone;
	/**addressDefaultState*/
	@Excel(name="addressDefaultState",width=15)
	private java.lang.String addressDefaultState;
	/**addressAddress*/
	@Excel(name="addressAddress",width=15)
	private java.lang.String addressAddress;
	/**addressDeleteState*/
	@Excel(name="addressDeleteState",width=15)
	private java.lang.String addressDeleteState;
	/**addressUserId*/
	@Excel(name="addressUserId",width=15)
	private java.lang.Integer addressUserId;
	
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
	 *@return: java.lang.String  addressName
	 */

	@Column(name ="ADDRESS_NAME",nullable=true,length=255)
	public java.lang.String getAddressName(){
		return this.addressName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addressName
	 */
	public void setAddressName(java.lang.String addressName){
		this.addressName = addressName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addressPhone
	 */

	@Column(name ="ADDRESS_PHONE",nullable=true,length=30)
	public java.lang.String getAddressPhone(){
		return this.addressPhone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addressPhone
	 */
	public void setAddressPhone(java.lang.String addressPhone){
		this.addressPhone = addressPhone;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addressDefaultState
	 */

	@Column(name ="ADDRESS_DEFAULT_STATE",nullable=true,length=2)
	public java.lang.String getAddressDefaultState(){
		return this.addressDefaultState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addressDefaultState
	 */
	public void setAddressDefaultState(java.lang.String addressDefaultState){
		this.addressDefaultState = addressDefaultState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addressAddress
	 */

	@Column(name ="ADDRESS_ADDRESS",nullable=true,length=255)
	public java.lang.String getAddressAddress(){
		return this.addressAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addressAddress
	 */
	public void setAddressAddress(java.lang.String addressAddress){
		this.addressAddress = addressAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addressDeleteState
	 */

	@Column(name ="ADDRESS_DELETE_STATE",nullable=true,length=2)
	public java.lang.String getAddressDeleteState(){
		return this.addressDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addressDeleteState
	 */
	public void setAddressDeleteState(java.lang.String addressDeleteState){
		this.addressDeleteState = addressDeleteState;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  addressUserId
	 */

	@Column(name ="ADDRESS_USER_ID",nullable=true,length=10)
	public java.lang.Integer getAddressUserId(){
		return this.addressUserId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  addressUserId
	 */
	public void setAddressUserId(java.lang.Integer addressUserId){
		this.addressUserId = addressUserId;
	}
}