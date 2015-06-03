import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class VariableLengthCode {

	public static Map<Character, String> map = new HashMap<Character, String>();
	
	static {
		map.put(' ', "11");
		map.put('e', "101");
		map.put('t', "1001");
		map.put('o', "10001");
		map.put('n', "10000");
		map.put('a', "011");
		map.put('s', "0101");
		map.put('i', "01001");
		map.put('r', "01000");
		map.put('h', "0011");
		map.put('d', "00101");
		map.put('l', "001001");
		map.put('!', "001000");
		map.put('u', "00011");
		map.put('c', "000101");
		map.put('f', "000100");
		map.put('m', "000011");
		map.put('p', "0000101");
		map.put('g', "0000100");
		map.put('w', "0000011");
		map.put('b', "0000010");
		map.put('y', "0000001");
		map.put('v', "00000001");
		map.put('j', "000000001");
		map.put('k', "0000000001");
		map.put('x', "00000000001");
		map.put('q', "000000000001");
		map.put('z', "000000000000");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		// build
		StringBuilder u = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			u.append(map.get(s.charAt(i)));
		}
		
		// pad
		int len = u.length() % 8;
		if (len != 0) {
			for (int i = 0; i < 8 - len; i++) {
				u.append('0');
			}
		}
		
		// encode
		for (int i = 0; i < u.length(); i += 8) {
			s = u.substring(i, i + 8);
			s = Integer.toHexString(Integer.parseInt(s, 2));
			s = s.length() == 1 ? "0" + s : s;
			s = s.toUpperCase();
			System.out.print(s + " ");
		}
	}

}
