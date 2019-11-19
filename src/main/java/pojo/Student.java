package pojo;

import java.io.InputStream;

/**
 * 
 * @author llq
 *学生实体类
 */
public class Student {
	private int id;
	private String sn;//学号
	private String name;
	private String password;
	private int clazzId;
	private String sex = "男";
	private String mobile;
	private String qq;
	private InputStream photo;//头像
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

	@Override
	public String toString() {
		return "Student{" +
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

	public Student(int id, String sn, String name, String password, int clazzId, String sex, String mobile, String qq, InputStream photo) {
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

	//修改学生信息
	public Student(int id, String name, int clazzId, String sex, String mobile, String qq) {
		this.id = id;
		this.name = name;
		this.clazzId = clazzId;
		this.sex = sex;
		this.mobile = mobile;
		this.qq = qq;
	}

	public Student() {
	}

	public Student(String sn, String name, String password, int clazzId, String sex, String mobile, String qq, InputStream photo) {

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
