package OOps;

public class EncapsulationExp {
	private String studentname;
	private int studentage;
	private int salary;

	// getter method getName access private studentname
	public String getName() {
		return studentname;
	}

	// setter method we can set data on private studentname variable
	public void setName(String name) {
		studentname = name;
	}

	// getter method getName access private studentage
	public int getAge() {
		return studentage;
	}

	// setter method we can set data
	public void setAge(int age) {
		studentage = age;
	}

	// getter method getName access private salary
	public int getSalary() {
		return salary;
	}

	// setter method we can set data
	public void setSalary(int sal) {
		salary = sal;
	}

	public static void main(String[] args) {
		EncapsulationExp e = new EncapsulationExp();
		e.setName("Lokesh");
		e.setAge(23);
		e.setSalary(25000);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());

	}

}
