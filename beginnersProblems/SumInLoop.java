import java.util.Scanner;


public class SumInLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int x = 0;
		
		for (int j = 0; j < i; j++) {
			x += s.nextInt();
		}
		System.out.println(x);
	}

}
