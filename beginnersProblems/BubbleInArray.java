import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BubbleInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int swaps = 0;
		List<Integer> list = new ArrayList<Integer>();

		String[] temp = in.nextLine().split(" ");
		int[] arr = new int[temp.length - 1];
		
		// convert to ints
		for (int i = 0; i < temp.length - 1; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			int a = arr[i];
			int b = arr[i+1];
			
			if (a > b) { // swap
				arr[i + 1] = a;
				arr[i] = b;
				swaps++;
			}
		}

		// checksum
		long c = 0;
		for (int i = 0; i < arr.length; i++) {
			c += arr[i];
			c *= 113;
			c %= 10000007;
		}
		
		System.out.println(swaps + " " + c);
	}

}
