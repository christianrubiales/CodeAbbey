import java.util.Scanner;

public class TwoPrintersOptimized {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		while (n-- > 0) {
			long a = in.nextInt();
			long b = in.nextInt();
			long c = in.nextInt();
			long i = (long) Math.ceil((a * b * c) / (a + b));
			System.out.print(i + " ");
		}
	}
}
