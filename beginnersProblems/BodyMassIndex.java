import java.util.Scanner;


public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		double w, h, b;
		for (int i = 0; i < n; i++) {
			w = s.nextDouble();
			h = s.nextDouble();
			b = w / (h*h);
			
			if (b < 18.5) {
				System.out.print("under ");
			} else if (18.5 <= b && b < 25.0) {
				System.out.print("normal ");
			} else if (25.0 <= b && b < 30.0) {
				System.out.print("over ");
			} else if (30.0 <= b) {
				System.out.print("obese ");
			}
			
		}
	}

}
