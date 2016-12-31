package com.gx.core.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 图片
 *
 */
@TableName("bbs_img")
public class BbsImg implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 商品ID */
	@TableField(value = "product_id")
	private Integer productId;

	/** 图片URL */
	private String url;

	/** 是否默认:0否 1:是 */
	@TableField(value = "is_def")
	private Integer isDef;

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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIsDef() {
		return this.isDef;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

}
