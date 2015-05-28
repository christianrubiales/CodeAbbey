import java.util.Scanner;


public class SavingsCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		
		for (int i = 0; i < n; i++) {
			double s = in.nextDouble();
			double r = in.nextDouble();
			double p = 1 + (in.nextDouble() / 100);
			int y = 0;
			
			while (s <= r) {
				s = ((s * p) * 100.0) / 100.0;
				y++;
			}
			System.out.print(y + " ");
		}

	}

}
