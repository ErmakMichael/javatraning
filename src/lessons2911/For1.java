package lessons2911;

public class For1 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int arrElem : arr) {
			System.out.println("<<" + arr[arrElem]);
		}

	}

}
