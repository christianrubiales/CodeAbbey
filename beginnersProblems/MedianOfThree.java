import java.util.Scanner;


public class MedianOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if ((b > a && a > c) || (c > a && a > b)) {
				System.out.print(a + " ");
			} else if ((a > b && b > c) || (c > b && b > a)) {
				System.out.print(b + " ");
			} else if ((a > c && c > b) || (b > c && c > a)) {
				System.out.print(c + " ");
			}
		}

	}

}
