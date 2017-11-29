package lessons2911;

public class Break {

	public static void main(String[] args) {
		int i = 14;
		while (i <= 28) {
			if (i % 13 == 0) {
				break;
			}
			i++;
		}
		System.out.println("First number is: " + i);
	}

}
