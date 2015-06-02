import java.util.Scanner;


public class FunnyWordsGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int x0 = s.nextInt();

		String consonants = "bcdfghjklmnprstvwxz";
		String vowels = "aeiou";

		int a = 445, c = 700001, m = 2097152, n;
		for (int i = 0; i < x; i++) {
			boolean isConsonant = true;
			n = s.nextInt();

			for (int j = 0; j < n; j++) {
				x0 = ((a*x0+c)%m);
				if (isConsonant) {
					System.out.print(consonants.charAt(x0 % 19));
				} else {
					System.out.print(vowels.charAt(x0 % 5));
				}
				isConsonant = !isConsonant;
			}
			System.out.print(" ");
		}
	}

}
