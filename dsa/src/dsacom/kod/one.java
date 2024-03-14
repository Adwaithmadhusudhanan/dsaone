package dsacom.kod;

public class one {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 5, 7, 10, 6 };
		printarr(arr);
		int[] r = removeEven(arr);
		printarr(r);
	}

	public static int[] removeEven(int[] arr) {
		int oddc = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddc++;
			}
		}
		int res[] = new int[oddc];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				res[idx] = arr[i];
				idx++;
			}
		}
		return res;

	}

	public static void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " dcwdwc");
		}
		System.out.println();

	}
}
