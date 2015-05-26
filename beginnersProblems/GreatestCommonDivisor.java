import java.util.Scanner;


public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a * b;
			
			while (a != 0 && b != 0) {
				if (a > b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}
			int gcd = a != 0 ? a : b;
			int lcm = c/gcd;
			System.out.print("(" + gcd + " " + lcm + ") ");
		}

	}

}
