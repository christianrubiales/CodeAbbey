import java.util.Scanner;


public class WeightedSumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			String t = s.next();
			int u = 0;
			
			for (int j = 0; j < t.length(); j++) {
				u += Integer.parseInt("" + t.charAt(j)) * (j+1);
			}
			System.out.print(u + " ");
		}

	}

}
