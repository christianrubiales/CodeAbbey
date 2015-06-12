import java.util.Scanner;


public class CardNames {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String[] suits = new String[] {"Clubs", "Spades", "Diamonds", "Hearts"};
		String[] ranks = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		int card;
		for (int i = 0; i < n; i++) {
			card = in.nextInt();

			System.out.print(ranks[card%13]);
			System.out.print("-of-");
			System.out.print(suits[card/13]);
			System.out.print(" ");
		}
	}

}
