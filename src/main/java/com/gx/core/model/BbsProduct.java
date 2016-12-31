package com.gx.core.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 商品
 *
 */
@TableName("bbs_product")
public class BbsProduct implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 商品编号 */
	private String no;

	/** 商品名称 */
	private String name;

	/** 重量 单位:克 */
	private Double weight;

	/** 是否新品:0:旧品,1:新品 */
	@TableField(value = "is_new")
	private Integer isNew;

	/** 是否热销:0,否 1:是 */
	@TableField(value = "is_hot")
	private Integer isHot;

	/** 推荐 1推荐 0 不推荐 */
	@TableField(value = "is_commend")
	private Integer isCommend;

	/** 添加时间 */
	@TableField(value = "create_time")
	private Date createTime;

	/** 添加人ID */
	@TableField(value = "create_user_id")
	private String createUserId;

	/** 审核时间 */
	@TableField(value = "check_time")
	private Date checkTime;

	/** 审核人ID */
	@TableField(value = "check_user_id")
	private String checkUserId;

	/** 上下架:0否 1是 */
	@TableField(value = "is_show")
	private Integer isShow;

	/** 是否删除:0删除,1,没删除 */
	@TableField(value = "is_del")
	private Integer isDel;

	/** 类型ID */
	@TableField(value = "type_id")
	private Integer typeId;

	/** 品牌ID */
	@TableField(value = "brand_id")
	private Integer brandId;

	/** 检索关键词 */
	private String keywords;

	/** 销量 */
	private Integer sales;

	/** 商品描述 */
	private String description;

	/** 包装清单 */
	@TableField(value = "package_list")
	private String packageList;

	/** 商品属性集 */
	private String feature;

	/** 颜色集 */
	private String color;

	/** 尺寸集 */
	private String size;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsCommend() {
		return this.isCommend;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckUserId() {
		return this.checkUserId;
	}

	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Integer getIsShow() {
		return this.isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getSales() {
		return this.sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPackageList() {
		return this.packageList;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
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

}
