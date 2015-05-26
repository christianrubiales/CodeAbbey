import java.util.Scanner;


public class ModuloAndTimeDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int d1, h1, m1, s1, d2, h2, m2, s2;
		for (int i = 0; i < n; i++) {
			d1 = s.nextInt(); h1 = s.nextInt(); m1 = s.nextInt(); s1 = s.nextInt();
			d2 = s.nextInt(); h2 = s.nextInt(); m2 = s.nextInt(); s2 = s.nextInt();
			
			long a = s1 + (60 * m1) + (60 * 60 * h1) + (60 * 60 * 24 *d1);
			long b = s2 + (60 * m2) + (60 * 60 * h2) + (60 * 60 * 24 *d2);
			long c = b > a ? b - a :  a - b;
			System.out.print("(" + (c/(60*60*24)) + " ");
			c %= 60*60*24;
			System.out.print((c/(60*60)) + " ");
			c %= 60*60;
			System.out.print((c/(60)) + " ");
			c %= 60;
			System.out.print(c + ") ");
		}

	}

}
