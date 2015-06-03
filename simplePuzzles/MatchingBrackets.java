import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class MatchingBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < n; i++) {
			Deque<Character> deque = new LinkedList<Character>();
			String s = in.nextLine();
			Character c;
			boolean correct = true;
			for (int j = 0; j < s.length(); j++) {
				c = s.charAt(j);
				if (c == '(' || c == '[' || c == '{' || c == '<') {
//					System.out.print(c);
					deque.push(c);
				} else if (c == ')' || c == ']' || c == '}' || c == '>') {
//					System.out.print(c);
					if (deque.isEmpty()) {
						correct = false;
						break;
					} else if (c == ')') {
						if (deque.peek() == '(') {
							deque.pop();
						} else {
							correct = false;
							break;
						}
					} else if (c == ']') {
						if (deque.peek() == '[') {
							deque.pop();
						} else {
							correct = false;
							break;
						}
					} else if (c == '}') {
						if (deque.peek() == '{') {
							deque.pop();
						} else {
							correct = false;
							break;
						}
					} else if (c == '>') {
						if (deque.peek() == '<') {
							deque.pop();
						} else {
							correct = false;
							break;
						}
					}
				}
			}
			if (correct) {
				correct = deque.isEmpty();
			}
//			System.out.println();
			System.out.print((correct ? '1' : '0') + " ");
		}
	}

}
