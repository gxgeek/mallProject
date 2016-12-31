package com.gx.core.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 订单详情
 *
 */
@TableName("bbs_detail")
public class BbsDetail implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 订单ID */
	@TableField(value = "order_id")
	private Integer orderId;

	/** 商品编号 */
	@TableField(value = "product_no")
	private String productNo;

	/** 商品名称 */
	@TableField(value = "product_name")
	private String productName;

	/**  颜色名称 */
	private String color;

	/** 尺码 */
	private String size;

	/** 商品销售价 */
	@TableField(value = "sku_price")
	private Double skuPrice;

	/** 购买数量 */
	private Integer amount;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductNo() {
		return this.productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getSkuPrice() {
		return this.skuPrice;
	}

	public void setSkuPrice(Double skuPrice) {
		this.skuPrice = skuPrice;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
