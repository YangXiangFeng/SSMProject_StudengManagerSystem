package pojo;
/**
 * 
 * @author llq
 *管理员实体类
 */
public class Admin {
	private int id;
	private String name;
	private String password;
	private int status = 1;

	public Admin() {
	}

	public Admin(int id, String name, String password, int status) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.status = status;
	}

	public Admin(String name, String password, int status) {
		this.name = name;
		this.password = password;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Admin{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", status=" + status +
				'}';
	}
}
