import java.util.Scanner;


public class ArrayCounters {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] a = new int[m+1];

		int t;
		for (int i = 0; i < n; i++) {
			t = s.nextInt();
			a[t] = a[t] + 1;
		}

		for (int i = 1; i <= m; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
