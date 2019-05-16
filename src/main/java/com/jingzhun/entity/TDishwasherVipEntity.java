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
 * @Description: t_dishwasher_vip
 * @author onlineGenerator
 * @date 2019-05-16 16:05:13
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_vip", schema = "")
@SuppressWarnings("serial")
public class TDishwasherVipEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**vipType*/
	@Excel(name="vipType",width=15)
	private java.lang.String vipType;
	/**vipScore*/
	@Excel(name="vipScore",width=15)
	private java.math.BigDecimal vipScore;
	/**vipTerm*/
	@Excel(name="vipTerm",width=15)
	private java.lang.Integer vipTerm;
	/**vipDeleteState*/
	@Excel(name="vipDeleteState",width=15)
	private java.lang.String vipDeleteState;
	
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
	 *@return: java.lang.String  vipType
	 */

	@Column(name ="VIP_TYPE",nullable=true,length=10)
	public java.lang.String getVipType(){
		return this.vipType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  vipType
	 */
	public void setVipType(java.lang.String vipType){
		this.vipType = vipType;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  vipScore
	 */

	@Column(name ="VIP_SCORE",nullable=true,scale=5,length=50)
	public java.math.BigDecimal getVipScore(){
		return this.vipScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  vipScore
	 */
	public void setVipScore(java.math.BigDecimal vipScore){
		this.vipScore = vipScore;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  vipTerm
	 */

	@Column(name ="VIP_TERM",nullable=true,length=10)
	public java.lang.Integer getVipTerm(){
		return this.vipTerm;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  vipTerm
	 */
	public void setVipTerm(java.lang.Integer vipTerm){
		this.vipTerm = vipTerm;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  vipDeleteState
	 */

	@Column(name ="VIP_DELETE_STATE",nullable=true,length=2)
	public java.lang.String getVipDeleteState(){
		return this.vipDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  vipDeleteState
	 */
	public void setVipDeleteState(java.lang.String vipDeleteState){
		this.vipDeleteState = vipDeleteState;
	}
}