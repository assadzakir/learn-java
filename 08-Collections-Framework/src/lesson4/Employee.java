package lesson4;

public class Employee implements Comparable<Employee> {
	
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	
	// compare Employee with their salaries
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//descending order after sort method in Collections
				if (this.salary > o.salary) {
					return -1;
				}else if (this.salary < o.salary) {
					return 1;
				}
				return 0;

	}
	
	
	

}
