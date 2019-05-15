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
 * @Description: t_dishwasher_user
 * @author onlineGenerator
 * @date 2019-05-15 16:32:55
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_user", schema = "")
@SuppressWarnings("serial")
public class TDishwasherUserEntity implements java.io.Serializable {
	/**用户表*/
	@Excel(name="用户表",width=15)
	private Integer id;
	/**userName*/
	@Excel(name="userName",width=15)
	private String userName;
	/**userWxImg*/
	@Excel(name="userWxImg",width=15)
	private String userWxImg;
	/**userWxName*/
	@Excel(name="userWxName",width=15)
	private String userWxName;
	/**userTotalScore*/
	@Excel(name="userTotalScore",width=15)
	private BigDecimal userTotalScore;
	/**userCurrentScore*/
	@Excel(name="userCurrentScore",width=15)
	private BigDecimal userCurrentScore;
	/**userConsumeScore*/
	@Excel(name="userConsumeScore",width=15)
	private BigDecimal userConsumeScore;
	/**userPid*/
	@Excel(name="userPid",width=15)
	private Integer userPid;
	/**userVipId*/
	@Excel(name="userVipId",width=15)
	private Integer userVipId;
	/**userDate*/
	@Excel(name="userDate",width=15,format = "yyyy-MM-dd")
	private Date userDate;
	/**userType*/
	@Excel(name="userType",width=15)
	private String userType;
	/**userPassword*/
	@Excel(name="userPassword",width=15)
	private String userPassword;
	/**userDeleteState*/
	@Excel(name="userDeleteState",width=15)
	private String userDeleteState;
	/**userWxOpenid*/
	@Excel(name="userWxOpenid",width=15)
	private String userWxOpenid;
	/**userWxNameReal*/
	@Excel(name="userWxNameReal",width=15)
	private String userWxNameReal;
	/**userMobile*/
	@Excel(name="userMobile",width=15)
	private String userMobile;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户表
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="ID",nullable=false,length=10)
	public Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户表
	 */
	public void setId(Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userName
	 */

	@Column(name ="USER_NAME",nullable=true,length=30)
	public String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userWxImg
	 */

	@Column(name ="USER_WX_IMG",nullable=true,length=255)
	public String getUserWxImg(){
		return this.userWxImg;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userWxImg
	 */
	public void setUserWxImg(String userWxImg){
		this.userWxImg = userWxImg;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userWxName
	 */

	@Column(name ="USER_WX_NAME",nullable=true,length=30)
	public String getUserWxName(){
		return this.userWxName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userWxName
	 */
	public void setUserWxName(String userWxName){
		this.userWxName = userWxName;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  userTotalScore
	 */

	@Column(name ="USER_TOTAL_SCORE",nullable=true,scale=5,length=50)
	public BigDecimal getUserTotalScore(){
		return this.userTotalScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  userTotalScore
	 */
	public void setUserTotalScore(BigDecimal userTotalScore){
		this.userTotalScore = userTotalScore;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  userCurrentScore
	 */

	@Column(name ="USER_CURRENT_SCORE",nullable=true,scale=5,length=50)
	public BigDecimal getUserCurrentScore(){
		return this.userCurrentScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  userCurrentScore
	 */
	public void setUserCurrentScore(BigDecimal userCurrentScore){
		this.userCurrentScore = userCurrentScore;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  userConsumeScore
	 */

	@Column(name ="USER_CONSUME_SCORE",nullable=true,scale=5,length=50)
	public BigDecimal getUserConsumeScore(){
		return this.userConsumeScore;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  userConsumeScore
	 */
	public void setUserConsumeScore(BigDecimal userConsumeScore){
		this.userConsumeScore = userConsumeScore;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  userPid
	 */

	@Column(name ="USER_PID",nullable=true,length=10)
	public Integer getUserPid(){
		return this.userPid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  userPid
	 */
	public void setUserPid(Integer userPid){
		this.userPid = userPid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  userVipId
	 */

	@Column(name ="USER_VIP_ID",nullable=true,length=10)
	public Integer getUserVipId(){
		return this.userVipId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  userVipId
	 */
	public void setUserVipId(Integer userVipId){
		this.userVipId = userVipId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  userDate
	 */

	@Column(name ="USER_DATE",nullable=true)
	public Date getUserDate(){
		return this.userDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  userDate
	 */
	public void setUserDate(Date userDate){
		this.userDate = userDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userType
	 */

	@Column(name ="USER_TYPE",nullable=true,length=5)
	public String getUserType(){
		return this.userType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userType
	 */
	public void setUserType(String userType){
		this.userType = userType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userPassword
	 */

	@Column(name ="USER_PASSWORD",nullable=true,length=50)
	public String getUserPassword(){
		return this.userPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userPassword
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userDeleteState
	 */

	@Column(name ="USER_DELETE_STATE",nullable=true,length=2)
	public String getUserDeleteState(){
		return this.userDeleteState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userDeleteState
	 */
	public void setUserDeleteState(String userDeleteState){
		this.userDeleteState = userDeleteState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userWxOpenid
	 */

	@Column(name ="USER_WX_OPENID",nullable=true,length=255)
	public String getUserWxOpenid(){
		return this.userWxOpenid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userWxOpenid
	 */
	public void setUserWxOpenid(String userWxOpenid){
		this.userWxOpenid = userWxOpenid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userWxNameReal
	 */

	@Column(name ="USER_WX_NAME_REAL",nullable=true,length=15)
	public String getUserWxNameReal(){
		return this.userWxNameReal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userWxNameReal
	 */
	public void setUserWxNameReal(String userWxNameReal){
		this.userWxNameReal = userWxNameReal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userMobile
	 */

	@Column(name ="USER_MOBILE",nullable=true,length=20)
	public String getUserMobile(){
		return this.userMobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userMobile
	 */
	public void setUserMobile(String userMobile){
		this.userMobile = userMobile;
	}
}
