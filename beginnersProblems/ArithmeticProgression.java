import java.util.Scanner;


public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int a; // initial
		int b; // step size
		int n; // number of terms
		int z; // last
		for (int i = 0; i < x; i++) {
			a = s.nextInt();
			b = s.nextInt();
			n = s.nextInt();
			z = a + (n - 1) * b;
			System.out.print((n * (a + z) / 2) + " ");
		}

	}

}
