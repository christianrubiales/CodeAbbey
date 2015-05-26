import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class ModularCalculator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		BigInteger e = new BigInteger(s.readLine());
		char c;
		String t;
		
		while ((t = s.readLine()) != null && t.trim().length() > 0) {
			BigInteger f = new BigInteger(t.substring(2));
			c = t.charAt(0);
			
			if (c == '*') {
				e = e.multiply(f);
			} else if (c == '+') {
				e = e.add(f);
			} else if (c == '%') {
				e = e.mod(f);
			}
		}
		
		System.out.println(e);
	}

}
