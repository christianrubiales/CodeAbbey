import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Anagrams {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		Scanner fs = new Scanner(new File("./stringTricks/words.txt"));

		// build reference map
		Map<String, Integer> words = new HashMap<String, Integer>();
		char[] c;
		String s;
		while (fs.hasNext()) {
			c = fs.next().toCharArray();
			Arrays.sort(c);
			s = String.valueOf(c);
			Integer i = words.get(s);
			if (i == null) {
				i = 0;
			}
			i++;
			words.put(s, i);
		}

		int n = Integer.parseInt(in.next());
		for (int i = 0; i < n; i++) {
			c = in.next().toCharArray();
			Arrays.sort(c);
			s = String.valueOf(c);
			System.out.print((words.get(s) - 1) + " ");
		}
	}

}
