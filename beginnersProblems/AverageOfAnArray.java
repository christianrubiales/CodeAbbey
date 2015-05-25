import java.util.Scanner;


public class AverageOfAnArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			double sum = 0;
			int m = -1;
			double c = 0;
			
			while (m != 0) {
				m = s.nextInt();
				if (m != 0) {
					sum += m;
					c++;
				}
			}
			System.out.print(Math.round(sum/c) + " ");
		}

	}

}
