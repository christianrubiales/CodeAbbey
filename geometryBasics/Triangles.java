import java.util.Arrays;
import java.util.Scanner;


public class Triangles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		for (int i = 0; i < x; i++) {
			int[] a = new int[3];
			a[0] = s.nextInt();
			a[1] = s.nextInt();
			a[2] = s.nextInt();
			Arrays.sort(a);
			System.out.print((a[0] + a[1] >= a[2] ? 1 : 0) + " ");			
		}
	}

}
