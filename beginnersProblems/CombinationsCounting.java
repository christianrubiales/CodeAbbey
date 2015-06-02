import java.math.BigInteger;
import java.util.Scanner;


public class CombinationsCounting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		// read
		int[] na = new int[x];
		int[] ka = new int[x];
		int max = 0;
		int n;
		int k;
		for (int i = 0; i < x; i++) {
			n = s.nextInt();
			k = s.nextInt();
			na[i] = n;
			ka[i] = k;
			max = n > max ? n : max;
		}

		// populate cache
		BigInteger[] fa = new BigInteger[max+1];
		fa[0] = new BigInteger("1");
		for (int i = 1; i <= max; i++) {
			fa[i] = fa[i-1].multiply(new BigInteger("" + i));
		}

		for (int i = 0; i < x; i++) {
			n = na[i];
			k = ka[i];
			System.out.print(fa[n].divide(fa[k].multiply(fa[n-k])) + " ");
		}
	}

}
