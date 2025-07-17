package comparable_and_comparator_usecase;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;
	double salary;
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int compareTo(Employee other) {
		return this.id-other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
