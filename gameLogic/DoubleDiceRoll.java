import java.util.Scanner;


public class DoubleDiceRoll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(2 + (in.nextInt() % 6) + (in.nextInt() % 6) + " ");
		}

	}

}
