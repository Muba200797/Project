package interviewprep;

import java.util.Objects;

public class Employee4 {
	private int id;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public Employee4(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee4 other = (Employee4) obj;
		return id == other.id && salary == other.salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", salary=" + salary + "]";
	}

}
