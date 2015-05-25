import java.util.Scanner;


public class DiceRolling {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		
		for (int i = 0; i < n; i++) {
			System.out.print((((int) Math.floor(s.nextDouble() * 6)) + 1) + " ");
		}
	}

}
