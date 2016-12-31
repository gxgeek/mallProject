package com.gx.core.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 收货地址
 *
 */
@TableName("bbs_addr")
public class BbsAddr implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 用户ID */
	@TableField(value = "buyer_id")
	private String buyerId;

	/** 收货人 */
	private String name;

	/**  */
	private String city;

	/** 收货地址 */
	private String addr;

	/** 手机号或是固定电话号 */
	private String phone;

	/** 是否默认 */
	@TableField(value = "is_def")
	private Integer isDef;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getIsDef() {
		return this.isDef;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

}
