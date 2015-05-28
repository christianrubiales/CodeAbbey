import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class MatchingWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String[] array = line.split(" ");
		
		SortedMap<String, Integer> map = new TreeMap<String, Integer>();
		Integer i;
		for (String t : array) {
			if (!map.containsKey(t)) {
				map.put(t, 0);
			}
			i = map.get(t);
			map.put(t, i + 1);
		}
		
		for (String t : map.keySet()) {
			if (map.get(t) > 1) {
				System.out.print(t + " ");
			}
		}
	}

}
