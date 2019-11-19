package pojo;

import java.io.InputStream;

/**
 * 
 * @author llq
 *教师实体表设计
 */
public class Teacher {
	private int id;
	private String sn;//教师工号
	private String name;
	private String password;
	private int clazzId;
	private String sex;
	private String mobile;
	private String qq;
	private InputStream photo;

	public Teacher(String sn, String name, String sex, String mobile, String qq) {
		this.sn = sn;
		this.name = name;
		this.sex = sex;
		this.mobile = mobile;
		this.qq = qq;
	}

	public Teacher(int id, String sn, String name, String sex, String mobile, String qq) {
		this.id = id;
		this.sn = sn;
		this.name = name;
		this.sex = sex;
		this.mobile = mobile;
		this.qq = qq;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", sn='" + sn + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", clazzId=" + clazzId +
				", sex='" + sex + '\'' +
				", mobile='" + mobile + '\'' +
				", qq='" + qq + '\'' +
				", photo=" + photo +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getClazzId() {
		return clazzId;
	}

	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public InputStream getPhoto() {
		return photo;
	}

	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}

	public Teacher() {
	}

	public Teacher(String name, int clazzId, String sex, String mobile, String qq, InputStream photo) {
		this.name = name;
		this.clazzId = clazzId;
		this.sex = sex;
		this.mobile = mobile;
		this.qq = qq;
		this.photo = photo;
	}

	public Teacher(int id, String sn, String name, String password, int clazzId, String sex, String mobile, String qq, InputStream photo) {
		this.id = id;
		this.sn = sn;
		this.name = name;
		this.password = password;
		this.clazzId = clazzId;
		this.sex = sex;
		this.mobile = mobile;
		this.qq = qq;
		this.photo = photo;
	}
}
