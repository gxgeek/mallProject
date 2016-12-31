package com.gx.core.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 最小销售单元
 *
 */
@TableName("bbs_sku")
public class BbsSku implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 商品ID */
	@TableField(value = "product_id")
	private Integer productId;

	/** 颜色ID */
	@TableField(value = "color_id")
	private Integer colorId;

	/** 尺码 */
	private String size;

	/** 运费 默认10元 */
	@TableField(value = "delive_fee")
	private Double deliveFee;

	/** 售价 */
	@TableField(value = "sku_price")
	private Double skuPrice;

	/** 库存 */
	@TableField(value = "stock_inventory")
	private Integer stockInventory;

	/** 购买限制 */
	@TableField(value = "sku_upper_limit")
	private Integer skuUpperLimit;

	/** 仓库位置:货架号 */
	private String location;

	/** SKU图片  精确到颜色及尺码对应的图片 */
	@TableField(value = "sku_img")
	private String skuImg;

	/** 前台显示排序 */
	@TableField(value = "sku_sort")
	private Integer skuSort;

	/** SKU名称 */
	@TableField(value = "sku_name")
	private String skuName;

	/** 市场价 */
	@TableField(value = "market_price")
	private Double marketPrice;

	/**  */
	@TableField(value = "create_time")
	private Date createTime;

	/**  */
	@TableField(value = "update_time")
	private Date updateTime;

	/**  */
	@TableField(value = "create_user_id")
	private String createUserId;

	/**  */
	@TableField(value = "update_user_id")
	private String updateUserId;

	/** 0,历史 1最新 */
	@TableField(value = "last_status")
	private Integer lastStatus;

	/** 0:赠品,1普通 */
	@TableField(value = "sku_type")
	private Integer skuType;

	/** 销量 */
	private Integer sales;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getColorId() {
		return this.colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getDeliveFee() {
		return this.deliveFee;
	}

	public void setDeliveFee(Double deliveFee) {
		this.deliveFee = deliveFee;
	}

	public Double getSkuPrice() {
		return this.skuPrice;
	}

	public void setSkuPrice(Double skuPrice) {
		this.skuPrice = skuPrice;
	}

	public Integer getStockInventory() {
		return this.stockInventory;
	}

	public void setStockInventory(Integer stockInventory) {
		this.stockInventory = stockInventory;
	}

	public Integer getSkuUpperLimit() {
		return this.skuUpperLimit;
	}

	public void setSkuUpperLimit(Integer skuUpperLimit) {
		this.skuUpperLimit = skuUpperLimit;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkuImg() {
		return this.skuImg;
	}

	public void setSkuImg(String skuImg) {
		this.skuImg = skuImg;
	}

	public Integer getSkuSort() {
		return this.skuSort;
	}

	public void setSkuSort(Integer skuSort) {
		this.skuSort = skuSort;
	}

	public String getSkuName() {
		return this.skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Integer getLastStatus() {
		return this.lastStatus;
	}

	public void setLastStatus(Integer lastStatus) {
		this.lastStatus = lastStatus;
	}

	public Integer getSkuType() {
		return this.skuType;
	}

	public void setSkuType(Integer skuType) {
		this.skuType = skuType;
	}

	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

}
