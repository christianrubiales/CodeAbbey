import java.util.Scanner;


public class MortgageCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int P = s.nextInt();
		double R = s.nextInt();
		int L = s.nextInt();

		R = R / 100.0 / 12;
		double M = P * R * Math.pow(1 + R, L) / (Math.pow(1 + R, L) - 1);
		System.out.println((int) Math.ceil(M));
	}

}
