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
 * @Description: t_dishwasher_cash
 * @author onlineGenerator
 * @date 2019-05-16 14:39:45
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_cash", schema = "")
@SuppressWarnings("serial")
public class TDishwasherCashEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**cashDate*/
	@Excel(name="cashDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date cashDate;
	/**cashScore*/
	@Excel(name="cashScore",width=15)
	private java.math.BigDecimal cashScore;
	/**cashState*/
	@Excel(name="cashState",width=15)
	private java.lang.String cashState;
	/**cashAccountId*/
	@Excel(name="cashAccountId",width=15)
	private java.lang.Integer cashAccountId;
	/**cashUserId*/
	@Excel(name="cashUserId",width=15)
	private java.lang.Integer cashUserId;
	
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  cashDate
	 */

	@Column(name ="CASH_DATE",nullable=true)
	public java.util.Date getCashDate(){
		return this.cashDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  cashDate
	 */
	public void setCashDate(java.util.Date cashDate){
		this.cashDate = cashDate;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  cashScore
	 */

	@Column(name ="CASH_SCORE",nullable=true,scale=5,length=50)
	public java.math.BigDecimal getCashScore(){
		return this.cashScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  cashScore
	 */
	public void setCashScore(java.math.BigDecimal cashScore){
		this.cashScore = cashScore;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cashState
	 */

	@Column(name ="CASH_STATE",nullable=true,length=2)
	public java.lang.String getCashState(){
		return this.cashState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cashState
	 */
	public void setCashState(java.lang.String cashState){
		this.cashState = cashState;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  cashAccountId
	 */

	@Column(name ="CASH_ACCOUNT_ID",nullable=true,length=10)
	public java.lang.Integer getCashAccountId(){
		return this.cashAccountId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  cashAccountId
	 */
	public void setCashAccountId(java.lang.Integer cashAccountId){
		this.cashAccountId = cashAccountId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  cashUserId
	 */

	@Column(name ="CASH_USER_ID",nullable=true,length=10)
	public java.lang.Integer getCashUserId(){
		return this.cashUserId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  cashUserId
	 */
	public void setCashUserId(java.lang.Integer cashUserId){
		this.cashUserId = cashUserId;
	}
}