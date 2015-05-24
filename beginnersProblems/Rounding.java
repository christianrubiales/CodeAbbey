import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = (int) Math.round(((double) s.nextInt()) / ((double) s.nextInt()));
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}

}
