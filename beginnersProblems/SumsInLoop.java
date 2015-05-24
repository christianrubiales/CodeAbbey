import java.util.Scanner;


public class SumsInLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt() + s.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}

}
