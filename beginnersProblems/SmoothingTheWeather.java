import java.text.DecimalFormat;
import java.util.Scanner;


public class SmoothingTheWeather {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = (int) s.nextDouble();

		// populate
		double[] d = new double[n];
		for (int i = 0; i < n; i++) {
			d[i] = s.nextDouble();
		}

		// calculate
		DecimalFormat df = new DecimalFormat("#.##########");
		System.out.print(df.format(d[0]) + " ");
		for (int i = 1; i < n - 1; i++) {
			System.out.print(df.format((d[i-1] + d[i] + d[i+1])/3) + " ");
		}
		System.out.print(df.format(d[n-1]) + " ");
	}

}
