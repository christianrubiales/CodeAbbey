import java.util.Scanner;

/**
 * There is actually an O(1) closed solution for this, do the math.
 */
public class TwoPrinters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		while (n-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int sum = 0;
			int i = 0;
			
			while (sum < c) {
				i++;
				if (i % a == 0) {
					sum++;
				}
				if (i % b == 0) {
					sum++;
				}
			}
			System.out.print(i + " ");
		}
	}
}
