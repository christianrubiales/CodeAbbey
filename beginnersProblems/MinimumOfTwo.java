import java.util.Scanner;


public class MinimumOfTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		int x, y;
		for (int i = 0; i < n; i++) {
			x = s.nextInt();
			y = s.nextInt();
			a[i] = x < y ? x : y;
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}

}
