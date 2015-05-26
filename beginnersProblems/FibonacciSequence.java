import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FibonacciSequence {

	static Map<Integer, BigInteger> map = new HashMap<Integer, BigInteger>();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		map.put(0, new BigInteger("0"));
		map.put(1, new BigInteger("1"));
		int maxIndex = 1;
		
		for (int i = 0; i < n; i++) {
			BigInteger num = new BigInteger(s.nextLine());
				
			int d = -1;
			for (int j = 0; j < maxIndex; j++) {
				if (map.get(j).equals(num)) {
					d = j;
				}
			}
			if (d == -1) {
				while (num.compareTo(map.get(maxIndex)) > 0) {
					map.put(maxIndex + 1, getFibo(maxIndex).add(getFibo(maxIndex - 1)));
					maxIndex++;
				}
				d = maxIndex;
			}
			
			System.out.print(d + " ");
		}
	}
	
	public static BigInteger getFibo(int n) {
		if (n == 0 || n == 1) {
			return map.get(n);
		}
		
		return map.get(n - 1).add(map.get(n - 2));
	}

}
