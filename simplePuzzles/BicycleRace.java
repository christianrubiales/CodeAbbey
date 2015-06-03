import java.text.DecimalFormat;
import java.util.Scanner;


public class BicycleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int a, b;
		double d;
		for (int i = 0; i < n; i++) {
			d = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			d /= (a+b);
			d *= a;
			DecimalFormat df = new DecimalFormat("#.########");
			System.out.print(df.format(d) + " ");
		}
	}

}
