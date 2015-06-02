import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class NeumannsRandomGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.next());

		String t;
		for (int i = 0; i < n; i++) {
			t = s.next();
			Set<Integer> set = new HashSet<Integer>();
			Integer j = Integer.valueOf(t);
			
			int c = 0;
			do {
				set.add(j);
				j = (j * j) / 100 % 10000;
				c++;
			} while (!set.contains(j));
			
			System.out.print(c + " ");
		}
	}

}
