import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeNumbersGeneration {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		// populate
		int[] array = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = s.nextInt();
			max = array[i] > max ? array[i] : max;
		}
		
		// Sieve of Eratosthenes
		int top = 2750159;
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
		
		// add primes to list
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				list.add(i);
			}
		}
		
		for (int i : array) {
			System.out.print(list.get(i-1) + " ");
		}
	}

}
