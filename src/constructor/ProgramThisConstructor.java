package constructor;

public class ProgramThisConstructor {
	String name;
	int age;

	public ProgramThisConstructor(String name, int age) {
		System.out.println("Tis is paramaterized constructor whith this keyword");
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ProgramThisConstructor ptc = new ProgramThisConstructor("Lokesh", 23);
		System.out.println("This is main method");
		System.out.println(ptc.name);
		System.out.println(ptc.age);
	}

}
