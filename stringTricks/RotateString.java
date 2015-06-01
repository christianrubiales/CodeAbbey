import java.util.Scanner;


public class RotateString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());

		int k;
		String t;
		for (int i = 0; i < n; i++) {
			k = Integer.parseInt(in.next());
			t = in.next();
			char[] c = t.toCharArray();
			
			if (k > 0) {
				rotateFromBeginning(c, k);
			} else if (k < 0) {
				rotateFromEnd(c, -k);
			}
			
			// print
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}

	}
	
	public static void rotateFromBeginning(char[] c, int k) {
		reverse(c, 0, c.length - 1);
		reverse(c, c.length - k, c.length - 1);
		reverse(c, 0, c.length - k - 1);
	}
	
	public static void rotateFromEnd(char[] c, int k) {
		reverse(c, 0, c.length - 1);
		reverse(c, 0, k - 1);
		reverse(c, k, c.length - 1);
	}
	
	public static void reverse(char[] c, int start, int end) {
		char t;
		for (int i = 0; i <= (end - start)/2; i++) {
			t = c[end - i];
			c[end - i] = c[start + i];
			c[start + i] = t;
		}
	}

}
