import java.util.Scanner;


public class KingAndQueen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.next());

		int x1, x2, y1, y2;
		String s;
		double d;
		for (int i = 0; i < x; i++) {
			s = in.next();
			x1 = (s.charAt(0) - 'a') + 1;
			y1 = s.charAt(1) - '0';
			
			s = in.next();
			x2 = (s.charAt(0) - 'a') + 1;
			y2 = s.charAt(1) - '0';
			
			if (x1 == x2 || y1 == y2) {
				System.out.print("Y ");
			} else {
				if (Math.abs(y2-y1) == Math.abs(x2-x1)) {
					System.out.print("Y ");
				} else {
					System.out.print("N ");
				}
			}
		}
	}

}
