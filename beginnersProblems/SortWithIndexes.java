import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SortWithIndexes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(s.nextInt());
		}

		List<Integer> sorted = new ArrayList<Integer>(list);
		Collections.sort(sorted);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sorted.get(i) == list.get(j)) {
					System.out.print((j+1) + " ");
				}
			}
		}
	}

}
