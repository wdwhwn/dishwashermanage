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
 * @Description: t_dishwasher_account
 * @author onlineGenerator
 * @date 2019-05-16 14:40:18
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_account", schema = "")
@SuppressWarnings("serial")
public class TDishwasherAccountEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**accountType*/
	@Excel(name="accountType",width=15)
	private java.lang.String accountType;
	/**accountAccountNumber*/
	@Excel(name="accountAccountNumber",width=15)
	private java.lang.String accountAccountNumber;
	/**accountMobile*/
	@Excel(name="accountMobile",width=15)
	private java.lang.String accountMobile;
	/**accountNameReal*/
	@Excel(name="accountNameReal",width=15)
	private java.lang.String accountNameReal;
	/**accountUserId*/
	@Excel(name="accountUserId",width=15)
	private java.lang.Integer accountUserId;
	/**accountDeleteState*/
	@Excel(name="accountDeleteState",width=15)
	private java.lang.String accountDeleteState;
	
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
	 *@return: java.lang.String  accountType
	 */

	@Column(name ="ACCOUNT_TYPE",nullable=true,length=30)
	public java.lang.String getAccountType(){
		return this.accountType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  accountType
	 */
	public void setAccountType(java.lang.String accountType){
		this.accountType = accountType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  accountAccountNumber
	 */

	@Column(name ="ACCOUNT_ACCOUNT_NUMBER",nullable=true,length=50)
	public java.lang.String getAccountAccountNumber(){
		return this.accountAccountNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  accountAccountNumber
	 */
	public void setAccountAccountNumber(java.lang.String accountAccountNumber){
		this.accountAccountNumber = accountAccountNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  accountMobile
	 */

	@Column(name ="ACCOUNT_MOBILE",nullable=true,length=20)
	public java.lang.String getAccountMobile(){
		return this.accountMobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  accountMobile
	 */
	public void setAccountMobile(java.lang.String accountMobile){
		this.accountMobile = accountMobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  accountNameReal
	 */

	@Column(name ="ACCOUNT_NAME_REAL",nullable=true,length=30)
	public java.lang.String getAccountNameReal(){
		return this.accountNameReal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  accountNameReal
	 */
	public void setAccountNameReal(java.lang.String accountNameReal){
		this.accountNameReal = accountNameReal;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  accountUserId
	 */

	@Column(name ="ACCOUNT_USER_ID",nullable=true,length=10)
	public java.lang.Integer getAccountUserId(){
		return this.accountUserId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  accountUserId
	 */
	public void setAccountUserId(java.lang.Integer accountUserId){
		this.accountUserId = accountUserId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  accountDeleteState
	 */

	@Column(name ="ACCOUNT_DELETE_STATE",nullable=true,length=2)
	public java.lang.String getAccountDeleteState(){
		return this.accountDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  accountDeleteState
	 */
	public void setAccountDeleteState(java.lang.String accountDeleteState){
		this.accountDeleteState = accountDeleteState;
	}
}