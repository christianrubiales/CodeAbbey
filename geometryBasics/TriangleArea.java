import java.text.DecimalFormat;
import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		int x1, y1, x2, y2, x3, y3;
		double a, b, c, s, A;
		DecimalFormat df = new DecimalFormat("#.#");
		for (int i = 0; i < x; i++) {
			x1 = in.nextInt();
			y1 = in.nextInt();
			x2 = in.nextInt();
			y2 = in.nextInt();
			x3 = in.nextInt();
			y3 = in.nextInt();
			
			a = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
			c = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
			
			A = (Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) / 4);
			System.out.print(df.format(A) + " ");
		}

	}

}
