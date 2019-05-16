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
 * @Description: t_dishwasher_log
 * @author onlineGenerator
 * @date 2019-05-16 14:40:51
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_log", schema = "")
@SuppressWarnings("serial")
public class TDishwasherLogEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**logDate*/
	@Excel(name="logDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date logDate;
	/**logDeviceId*/
	@Excel(name="logDeviceId",width=15)
	private java.lang.Integer logDeviceId;
	
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
	 *@return: java.util.Date  logDate
	 */

	@Column(name ="LOG_DATE",nullable=true)
	public java.util.Date getLogDate(){
		return this.logDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  logDate
	 */
	public void setLogDate(java.util.Date logDate){
		this.logDate = logDate;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  logDeviceId
	 */

	@Column(name ="LOG_DEVICE_ID",nullable=true,length=10)
	public java.lang.Integer getLogDeviceId(){
		return this.logDeviceId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  logDeviceId
	 */
	public void setLogDeviceId(java.lang.Integer logDeviceId){
		this.logDeviceId = logDeviceId;
	}
}