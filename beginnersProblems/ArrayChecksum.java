import java.util.Scanner;


public class ArrayChecksum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		long u = 0;
		for (int i = 0; i < n; i++) {
			u += s.nextInt();
			u *= 113;
			u %= 10000007;
		}
		System.out.println(u + " ");
	}

}
