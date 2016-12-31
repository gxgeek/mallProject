package com.gx.core.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 员工
 *
 */
@TableName("bbs_employee")
public class BbsEmployee implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 用户名 */
	@TableId(type = IdType.AUTO)
	private String username;

	/** 密码 */
	private String password;

	/** 学历 */
	private String degree;

	/** 邮箱 */
	private String email;

	/** 性别  */
	private Integer gender;

	/** 图片(头像) */
	@TableField(value = "img_url")
	private String imgUrl;

	/** 手机 */
	private String phone;

	/** 真实名字 */
	@TableField(value = "real_name")
	private String realName;

	/** 毕业学校 */
	private String school;

	/** 是否删除 1:未删除 0:删除 */
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

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}
