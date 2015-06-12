import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class BullsAndCows {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String secret = in.next();
		int n = Integer.parseInt(in.next());
		
		String guess;
		for (int i = 0; i < n; i++) {
			guess = in.next();
			int bull = 0;
			int cow = 0;
			
			// put secret characters to a list
			List<Character> list = new LinkedList<Character>();
			for (int j = 0; j < secret.length(); j++) {
				list.add(secret.charAt(j));
			}
			
			// count correct guesses in correct positions
			List<Character> bulls = new LinkedList<Character>();
			for (int j = 0; j < secret.length(); j++) {
				if (secret.charAt(j) == guess.charAt(j)) {
					bulls.add(secret.charAt(j));
				}
			}
			bull = bulls.size();
			
			// count correct guesses in wrong positions
			list.removeAll(bulls);
			for (int j = 0; j < guess.length(); j++) {
				if (list.contains(guess.charAt(j))) {
					cow++;
				}
			}
			
			System.out.print(bull + "-" + cow + " ");
		}

	}

}
