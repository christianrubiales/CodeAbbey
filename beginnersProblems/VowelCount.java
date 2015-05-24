import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class VowelCount {

	public static void main(String[] args) {
		Set<Character> m = new HashSet<Character>();
		m.add('a');m.add('e');m.add('i');m.add('o');m.add('u');m.add('y');
		Scanner s = new Scanner(System.in);
		int x = Integer.parseInt(s.nextLine());

		char[] c;
		for (int i = 0; i < x; i++) {
			c = s.nextLine().toCharArray();

			int b = 0;
			for (int j = 0; j < c.length; j++) {
				if (m.contains(c[j])) {
					b++;
				}
			}
			System.out.print(b + " ");
		}
	}

}
