import java.util.Scanner;


public class SharePriceVolatility {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			String name = in.next();

			// mean
			int[] a = new int[14];
			double mean = 0;
			for (int j = 0; j < 14; j++) {
				a[j] = in.nextInt();
				mean += a[j];
			}
			mean /= 14;

			// sd
			double sd = 0;
			for (int j = 0; j < 14; j++) {
				sd += Math.pow((mean - a[j]), 2);
			}
			sd /= 14;
			sd = Math.sqrt(sd);
//			System.out.println("sd: " + sd);
			
			double commission = mean * 0.01;
//			System.out.println("commission: " + commission);
//			System.out.println("sd / commission: " + (sd / commission));
			if (sd / commission > 4) {
				System.out.print(name + " ");
			}
		}

	}

}
