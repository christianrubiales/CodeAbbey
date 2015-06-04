import java.util.Scanner;


public class PrimeRanges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.next());
		
		// Sieve of Eratosthenes
		int top = 3000000;
		int m = (int) Math.sqrt(top);
		boolean[] sieve = new boolean[top+1];
		
		for (int i = 0; i <= top; i++) {
			sieve[i] = true;
		}

		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i <= m; i++) {
			for (int j = i + i; j <= top; j += i) {
				if (j < top) {
					sieve[j] = false;
				}
			}
		}
		
		int a, b, c;
		for (int i = 0; i < x; i++) {
			c = 0;
			a = in.nextInt();
			b = in.nextInt();
			
			for (int j = a; j <= b; j++) {
				if (sieve[j]) {
					c++;
				}
			}
			System.out.print(c + " ");
		}
	}

}
