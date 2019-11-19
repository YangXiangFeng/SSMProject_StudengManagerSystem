package pojo;
/**
 * 
 * @author llq
 *班级实体表
 */
public class Clazz {
	private int id;
	private String name;
	private String info;

	public Clazz(String name, String info) {
		this.name = name;
		this.info = info;
	}

	public Clazz(int id, String name, String info) {
		this.id = id;
		this.name = name;
		this.info = info;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Clazz{" +
				"id=" + id +
				", name='" + name + '\'' +
				", info='" + info + '\'' +
				'}';
	}
}
