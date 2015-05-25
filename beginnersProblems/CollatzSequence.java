import java.util.Scanner;


public class CollatzSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			int c = 0;
			int t = s.nextInt();
			
			while (t != 1) {
				if (t % 2 == 0) {
					t = t / 2;
				} else {
					t = 3 * t + 1;
				}
				c++;
			}
			System.out.print(c + " ");
		}
	}

}
