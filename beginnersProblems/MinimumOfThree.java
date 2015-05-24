import java.util.Scanner;


public class MinimumOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		int x;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			x = s.nextInt();
			a[i] = x < a[i] ? x : a[i];
			x = s.nextInt();
			a[i] = x < a[i] ? x : a[i];
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}

}
