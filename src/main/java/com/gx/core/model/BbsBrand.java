package com.gx.core.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 品牌
 *
 */
@TableName("bbs_brand")
public class BbsBrand implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 名称 */
	private String name;

	/** 描述 */
	private String description;

	/** 图片Url */
	@TableField(value = "img_url")
	private String imgUrl;

	/** 品牌网址 */
	@TableField(value = "web_site")
	private String webSite;

	/** 排序:最大最排前 */
	private Integer sort;

	/** 是否可见 1:可见 0:不可见 */
	@TableField(value = "is_display")
	private Integer isDisplay;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

}
