import java.util.Scanner;


public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.nextLine());
		
		String[] a;
		for (int i = 0; i < x; i++) {
			int p1 = 0, p2 = 0;
			a = in.nextLine().split(" ");

			for (int j = 0; j < a.length; j++) {
				if (a[j].charAt(0) != a[j].charAt(1)) {
					if (a[j].equals("PR") || a[j].equals("RS") || a[j].equals("SP")) {
						p1++;
					} else if (a[j].equals("RP") || a[j].equals("SR") || a[j].equals("PS")) {
						p2++;
					}
				}
			}
			System.out.print(p1 > p2 ? "1 " : "2 ");
		}
	}

}
