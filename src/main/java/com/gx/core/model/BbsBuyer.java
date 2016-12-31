package com.gx.core.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 购买者
 *
 */
@TableName("bbs_buyer")
public class BbsBuyer implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 用户名 */
	@TableId(type = IdType.AUTO)
	private String username;

	/** 密码 */
	private String password;

	/**  */
	private String gender;

	/** 邮箱 */
	private String email;

	/** 真实名字 */
	@TableField(value = "real_name")
	private String realName;

	/** 注册时间 */
	@TableField(value = "register_time")
	private Date registerTime;

	/** 省ID */
	private String province;

	/** 市ID */
	private String city;

	/** 县ID */
	private String town;

	/** 地址 */
	private String addr;

	/** 是否已删除:1:未,0:删除了 */
	@TableField(value = "is_del")
	private Integer isDel;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}
