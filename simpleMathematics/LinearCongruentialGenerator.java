import java.util.Scanner;


public class LinearCongruentialGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int a, c, m, x0, n;
		for (int i = 0; i < x; i++) {
			a = s.nextInt();
			c = s.nextInt();
			m = s.nextInt();
			x0 = s.nextInt();
			n = s.nextInt();
			
			for (int j = 0; j < n; j++) {
				x0 = ((a*x0+c)%m);
			}
			
			System.out.print(x0 + " ");
		}
	}

}
