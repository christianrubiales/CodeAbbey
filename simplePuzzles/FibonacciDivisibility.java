import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciDivisibility {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		// read inputs
		int[] a = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		for (int i : a) {
			BigInteger zero = new BigInteger("0");
			BigInteger first = new BigInteger("0");
			BigInteger second = new BigInteger("1");
			BigInteger bi = new BigInteger("" + i);
			BigInteger temp;

			int index = 1;
			while (!second.mod(bi).equals(zero)) {
				temp = second;
				second = second.add(first);
				first = temp;
				index++;
			}
			System.out.print(index + " ");
		}
		
	}

}
