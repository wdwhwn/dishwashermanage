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
 * @Description: t_dishwasher_ratio
 * @author onlineGenerator
 * @date 2019-05-16 16:05:28
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_ratio", schema = "")
@SuppressWarnings("serial")
public class TDishwasherRatioEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**ratioRatio*/
	@Excel(name="ratioRatio",width=15)
	private java.lang.String ratioRatio;
	/**0 启用  1 不启用*/
	@Excel(name="0 启用  1 不启用",width=15)
	private java.lang.String ratioStatus;
	
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
	 *@return: java.lang.String  ratioRatio
	 */

	@Column(name ="RATIO_RATIO",nullable=true,length=10)
	public java.lang.String getRatioRatio(){
		return this.ratioRatio;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ratioRatio
	 */
	public void setRatioRatio(java.lang.String ratioRatio){
		this.ratioRatio = ratioRatio;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  0 启用  1 不启用
	 */

	@Column(name ="RATIO_STATUS",nullable=true,length=2)
	public java.lang.String getRatioStatus(){
		return this.ratioStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  0 启用  1 不启用
	 */
	public void setRatioStatus(java.lang.String ratioStatus){
		this.ratioStatus = ratioStatus;
	}
}