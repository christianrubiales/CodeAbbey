import java.util.Scanner;


public class BitCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String a;
		for (int i = 0; i < n; i++) {
			a = Integer.toBinaryString(s.nextInt());
			
			int c = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == '1') {
					c++;
				}
			}
			System.out.print(c + " ");
		}

	}

}
