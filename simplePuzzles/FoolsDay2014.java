import java.util.Scanner;


public class FoolsDay2014 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		String[] a;
		for (int i = 0; i < n; i++) {
			int c = 0;
			a = in.nextLine().split(" ");

			for (int j = 0; j < a.length; j++) {
				c += Integer.parseInt(a[j]) * Integer.parseInt(a[j]);
			}
			System.out.print(c + " ");
		}
	}

}
