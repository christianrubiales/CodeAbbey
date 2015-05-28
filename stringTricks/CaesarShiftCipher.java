import java.util.Scanner;


public class CaesarShiftCipher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = s.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int k = Integer.parseInt(a[1]);
		char[] alpha = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		char[] c;
		for (int i = 0; i < n; i++) {
			c = s.nextLine().toCharArray();
			
			int t;
			for (int j = 0; j < c.length; j++) {
				if (Character.isAlphabetic(c[j])) {
					t = (c[j] - 'A') - k;
					if (t < 0) {
						t = 26 + t;
					}
					System.out.print(alpha[t % 26]);
				} else {
					System.out.print(c[j]);
				}
			}
			System.out.print(" ");
		}
	}

}
