package ManStatic;

public class Test {

	public static void main(String[] args) {

		Man man1 = new Man();
		Man man2 = new Man();

		man1.setAge(10);

		System.out.println("man1: " + man1.getAge());
		System.out.println("man2: " + man2.getAge());

		man2.setAge(0);

		System.out.println("man1: " + man1.getAge());
		System.out.println("man2: " + man2.getAge());

	}

}
