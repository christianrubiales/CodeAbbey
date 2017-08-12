import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer[] arr = new Integer[n];

		// read
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int swaps = 0;
		int pass = 0;
		for (int i = 0; i < n; i++) {
			boolean swapped = false;
			for (int j = n - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int t = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = t;
					swaps++;
					swapped = true;
				}
			}
			if (!swapped) {
				pass++;
			}
			//System.out.println(Arrays.deepToString(arr));
		}
		System.out.println(pass + " " + swaps);

	}

}
