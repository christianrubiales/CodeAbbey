import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Palindromes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		for (int i = 0; i < n; i++) {
			String t = s.nextLine();
			List<Character> list = new ArrayList<Character>();
			
			for (int j = 0; j < t.length(); j++) {
				if (Character.isAlphabetic(t.charAt(j))) {
					list.add(Character.toLowerCase(t.charAt(j)));
				}
			}

			char c = 'Y';
			for (int j = 0; j < list.size() / 2; j++) {
				if (list.get(j) != list.get(list.size() - 1 - j)) {
					c = 'N';
					break;
				}
			}
			System.out.print(c + " ");
		}
	}

}
