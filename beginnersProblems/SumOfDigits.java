import java.util.Scanner;


public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			int m = s.nextInt() * s.nextInt() + s.nextInt();
			int u = 0;
			
			while (m > 0) {
				u += m % 10;
				m /= 10;
			}
			
			System.out.print(u + " ");
		}

	}

}
