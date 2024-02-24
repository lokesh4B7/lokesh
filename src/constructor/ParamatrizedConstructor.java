package constructor;

public class ParamatrizedConstructor {
	String Name;
	int Age;

	public ParamatrizedConstructor(String name, int age) {
		System.out.println("This is constructor");
		Name = name;
		Age = age;
	}

	public static void main(String[] args) {

		ParamatrizedConstructor pc = new ParamatrizedConstructor("Lokesh", 22);
		ParamatrizedConstructor pc1 = new ParamatrizedConstructor("Sudheer", 24);
		System.out.println("This is main method");
		System.out.println(pc.Name);
		System.out.println(pc.Age);
		System.out.println(pc1.Name);
		System.out.println(pc1.Age);
		// Non parameterized constructor has drawback it provides same value for every
		// object.

	}

}
