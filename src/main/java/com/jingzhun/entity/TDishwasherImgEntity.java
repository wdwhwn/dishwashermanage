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
 * @Description: t_dishwasher_img
 * @author onlineGenerator
 * @date 2019-05-16 16:05:42
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_img", schema = "")
@SuppressWarnings("serial")
public class TDishwasherImgEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**imgImgUrl*/
	@Excel(name="imgImgUrl",width=15)
	private java.lang.String imgImgUrl;
	/**imgDeleteState*/
	@Excel(name="imgDeleteState",width=15)
	private java.lang.String imgDeleteState;
	
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
	 *@return: java.lang.String  imgImgUrl
	 */

	@Column(name ="IMG_IMG_URL",nullable=true,length=50)
	public java.lang.String getImgImgUrl(){
		return this.imgImgUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  imgImgUrl
	 */
	public void setImgImgUrl(java.lang.String imgImgUrl){
		this.imgImgUrl = imgImgUrl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  imgDeleteState
	 */

	@Column(name ="IMG_DELETE_STATE",nullable=true,length=2)
	public java.lang.String getImgDeleteState(){
		return this.imgDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  imgDeleteState
	 */
	public void setImgDeleteState(java.lang.String imgDeleteState){
		this.imgDeleteState = imgDeleteState;
	}
}