package interviewprep;

import java.util.Objects;

public class Employee2 {
	private String name;
	private String id;
	private String city;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee2(String name, String id, String city, int age) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", id=" + id + ", city=" + city + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
