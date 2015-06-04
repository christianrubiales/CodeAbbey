import java.util.Scanner;


public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int a, b, c;
		double d;
		for (int i = 0; i < x; i++) {
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = Math.sqrt(a*a+b*b);
			
			if (d == c) {
				System.out.print("R ");
			} else if (d < c) {
				System.out.print("O ");
			} else if (d > c) {
				System.out.print("A ");
			}
		}
	}

}
