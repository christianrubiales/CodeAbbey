import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class JosephusProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();

		// initialize
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		int p = k - 1;
		while (list.size() > 1) {
			list.remove(p % list.size());
			p = (p + k - 1) % list.size();
		}
		System.out.println(list.get(0));
	}

}
