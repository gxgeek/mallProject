package com.gx.core.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 订单
 *
 */
@TableName("bbs_order")
public class BbsOrder implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 订单号 */
	private String oid;

	/** 运费 */
	@TableField(value = "deliver_fee")
	private BigDecimal deliverFee;

	/** 应付金额 */
	@TableField(value = "payable_fee")
	private Double payableFee;

	/** 订单金额 */
	@TableField(value = "total_price")
	private Double totalPrice;

	/** 支付方式 0:到付 1:在线 2:邮局 3:公司转帐 */
	@TableField(value = "payment_way")
	private Integer paymentWay;

	/** 货到付款方式.1现金,2POS刷卡 */
	@TableField(value = "payment_cash")
	private Integer paymentCash;

	/** 送货时间 */
	private Integer delivery;

	/** 是否电话确认 1:是  0: 否 */
	private Integer isConfirm;

	/** 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败 */
	@TableField(value = "is_paiy")
	private Integer isPaiy;

	/** 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货 */
	private Integer state;

	/** 订单生成时间 */
	@TableField(value = "create_date")
	private Date createDate;

	/** 附言 */
	private String note;

	/** 用户名 */
	@TableField(value = "buyer_id")
	private String buyerId;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public BigDecimal getDeliverFee() {
		return this.deliverFee;
	}

	public void setDeliverFee(BigDecimal deliverFee) {
		this.deliverFee = deliverFee;
	}

	public Double getPayableFee() {
		return this.payableFee;
	}

	public void setPayableFee(Double payableFee) {
		this.payableFee = payableFee;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getPaymentWay() {
		return this.paymentWay;
	}

	public void setPaymentWay(Integer paymentWay) {
		this.paymentWay = paymentWay;
	}

	public Integer getPaymentCash() {
		return this.paymentCash;
	}

	public void setPaymentCash(Integer paymentCash) {
		this.paymentCash = paymentCash;
	}

	public Integer getDelivery() {
		return this.delivery;
	}

	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

	public Integer getIsConfirm() {
		return this.isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Integer getIsPaiy() {
		return this.isPaiy;
	}

	public void setIsPaiy(Integer isPaiy) {
		this.isPaiy = isPaiy;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

}
