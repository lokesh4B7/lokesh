package constructor;

public class ProgramConstructor {
	String name, branch;
	int age;

	public ProgramConstructor() {
		System.out.println("This is non paramaterized constructor");
		name = "Lokesh";
		branch = "ECE";
		age = 22;

	}

	public static void main(String[] args) {

		ProgramConstructor pc = new ProgramConstructor();
		ProgramConstructor pc1 = new ProgramConstructor();
		System.out.println("main method");
		System.out.println(pc.name);
		System.out.println(pc.branch);
		System.out.println(pc.age);
		System.out.println(pc1.name);
		System.out.println(pc1.branch);
		System.out.println(pc1.age);
	}
}
