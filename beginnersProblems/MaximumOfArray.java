import java.util.Scanner;


public class MaximumOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int t;
		
		for (int i = 0; i < 300; i++) {
			t = s.nextInt();
			if (t < min) {
				min = t;
			} else if (t > max) {
				max = t;
			}
		}
		System.out.println(max + " " + min);
	}
}
