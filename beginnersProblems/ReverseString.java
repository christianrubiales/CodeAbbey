import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();

		for (int i = t.length() - 1; i > -1 ; i--) {
			System.out.print(t.charAt(i));
		}
	}

}
