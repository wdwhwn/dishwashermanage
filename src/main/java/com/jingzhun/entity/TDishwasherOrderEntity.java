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
 * @Description: t_dishwasher_order
 * @author onlineGenerator
 * @date 2019-05-16 15:51:47
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_dishwasher_order", schema = "")
@SuppressWarnings("serial")
public class TDishwasherOrderEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**orderSn*/
	@Excel(name="orderSn",width=15)
	private java.lang.String orderSn;
	/**orderMessage*/
	@Excel(name="orderMessage",width=15)
	private java.lang.String orderMessage;
	/**orderFreight*/
	@Excel(name="orderFreight",width=15)
	private java.lang.String orderFreight;
	/**orderDate*/
	@Excel(name="orderDate",width=15,format = "yyyy-MM-dd")
	private java.util.Date orderDate;
	/**orderTotalPrice*/
	@Excel(name="orderTotalPrice",width=15)
	private java.math.BigDecimal orderTotalPrice;
	/**orderAddressId*/
	@Excel(name="orderAddressId",width=15)
	private java.lang.Integer orderAddressId;
	/**orderUserId*/
	@Excel(name="orderUserId",width=15)
	private java.lang.Integer orderUserId;
	/**orderGoodsId*/
	@Excel(name="orderGoodsId",width=15)
	private java.lang.Integer orderGoodsId;
	/**orderGoodsNumber*/
	@Excel(name="orderGoodsNumber",width=15)
	private java.lang.Integer orderGoodsNumber;
	/**0 订单创建成功等待付款 101订单已取消 102订单已删除201订单已付款，等待发货300订单已发货，301用户确认收货401 没有发货，退款 402 已收货，退款退货*/
	@Excel(name="0 订单创建成功等待付款 101订单已取消 102订单已删除201订单已付款，等待发货300订单已发货，301用户确认收货401 没有发货，退款 402 已收货，退款退货",width=15)
	private java.lang.String orderStatus;
	/**0 未发货 1 已发货 2 已收货 4 退货*/
	@Excel(name="0 未发货 1 已发货 2 已收货 4 退货",width=15)
	private java.lang.String orderShippingStatus;
	/**0 未付款 1付款中 2 已付款 4 退款*/
	@Excel(name="0 未付款 1付款中 2 已付款 4 退款",width=15)
	private java.lang.String orderPayStatus;
	/**orderPrepayId*/
	@Excel(name="orderPrepayId",width=15)
	private java.lang.String orderPrepayId;
	
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
	 *@return: java.lang.String  orderSn
	 */

	@Column(name ="ORDER_SN",nullable=true,length=50)
	public java.lang.String getOrderSn(){
		return this.orderSn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  orderSn
	 */
	public void setOrderSn(java.lang.String orderSn){
		this.orderSn = orderSn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  orderMessage
	 */

	@Column(name ="ORDER_MESSAGE",nullable=true,length=255)
	public java.lang.String getOrderMessage(){
		return this.orderMessage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  orderMessage
	 */
	public void setOrderMessage(java.lang.String orderMessage){
		this.orderMessage = orderMessage;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  orderFreight
	 */

	@Column(name ="ORDER_FREIGHT",nullable=true,length=50)
	public java.lang.String getOrderFreight(){
		return this.orderFreight;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  orderFreight
	 */
	public void setOrderFreight(java.lang.String orderFreight){
		this.orderFreight = orderFreight;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  orderDate
	 */

	@Column(name ="ORDER_DATE",nullable=true)
	public java.util.Date getOrderDate(){
		return this.orderDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  orderDate
	 */
	public void setOrderDate(java.util.Date orderDate){
		this.orderDate = orderDate;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  orderTotalPrice
	 */

	@Column(name ="ORDER_TOTAL_PRICE",nullable=true,scale=5,length=50)
	public java.math.BigDecimal getOrderTotalPrice(){
		return this.orderTotalPrice;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  orderTotalPrice
	 */
	public void setOrderTotalPrice(java.math.BigDecimal orderTotalPrice){
		this.orderTotalPrice = orderTotalPrice;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderAddressId
	 */

	@Column(name ="ORDER_ADDRESS_ID",nullable=true,length=10)
	public java.lang.Integer getOrderAddressId(){
		return this.orderAddressId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  orderAddressId
	 */
	public void setOrderAddressId(java.lang.Integer orderAddressId){
		this.orderAddressId = orderAddressId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderUserId
	 */

	@Column(name ="ORDER_USER_ID",nullable=true,length=10)
	public java.lang.Integer getOrderUserId(){
		return this.orderUserId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  orderUserId
	 */
	public void setOrderUserId(java.lang.Integer orderUserId){
		this.orderUserId = orderUserId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderGoodsId
	 */

	@Column(name ="ORDER_GOODS_ID",nullable=true,length=10)
	public java.lang.Integer getOrderGoodsId(){
		return this.orderGoodsId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  orderGoodsId
	 */
	public void setOrderGoodsId(java.lang.Integer orderGoodsId){
		this.orderGoodsId = orderGoodsId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderGoodsNumber
	 */

	@Column(name ="ORDER_GOODS_NUMBER",nullable=true,length=10)
	public java.lang.Integer getOrderGoodsNumber(){
		return this.orderGoodsNumber;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  orderGoodsNumber
	 */
	public void setOrderGoodsNumber(java.lang.Integer orderGoodsNumber){
		this.orderGoodsNumber = orderGoodsNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  0 订单创建成功等待付款 101订单已取消 102订单已删除201订单已付款，等待发货300订单已发货，301用户确认收货401 没有发货，退款 402 已收货，退款退货
	 */

	@Column(name ="ORDER_STATUS",nullable=true,length=5)
	public java.lang.String getOrderStatus(){
		return this.orderStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  0 订单创建成功等待付款 101订单已取消 102订单已删除201订单已付款，等待发货300订单已发货，301用户确认收货401 没有发货，退款 402 已收货，退款退货
	 */
	public void setOrderStatus(java.lang.String orderStatus){
		this.orderStatus = orderStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  0 未发货 1 已发货 2 已收货 4 退货
	 */

	@Column(name ="ORDER_SHIPPING_STATUS",nullable=true,length=5)
	public java.lang.String getOrderShippingStatus(){
		return this.orderShippingStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  0 未发货 1 已发货 2 已收货 4 退货
	 */
	public void setOrderShippingStatus(java.lang.String orderShippingStatus){
		this.orderShippingStatus = orderShippingStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  0 未付款 1付款中 2 已付款 4 退款
	 */

	@Column(name ="ORDER_PAY_STATUS",nullable=true,length=5)
	public java.lang.String getOrderPayStatus(){
		return this.orderPayStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  0 未付款 1付款中 2 已付款 4 退款
	 */
	public void setOrderPayStatus(java.lang.String orderPayStatus){
		this.orderPayStatus = orderPayStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  orderPrepayId
	 */

	@Column(name ="ORDER_PREPAY_ID",nullable=true,length=50)
	public java.lang.String getOrderPrepayId(){
		return this.orderPrepayId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  orderPrepayId
	 */
	public void setOrderPrepayId(java.lang.String orderPrepayId){
		this.orderPrepayId = orderPrepayId;
	}
}