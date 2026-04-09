package pekan3_2511533027;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533027 {
	public static int postfixEvaluate_2511533027(String  expression) {
		Stack<Integer> s_3027 = new Stack<Integer>();
		Scanner input_3027 = new Scanner(expression);
		while (input_3027.hasNext()) {
			if(input_3027.hasNextInt())  { // an operand integer
				s_3027.push(input_3027.nextInt());
			} else {
				String operator_3027 = input_3027.next();
				int operand2 = s_3027.pop();
				int operand1 = s_3027.pop();
				if (operator_3027.equals("+")) {
					s_3027.push(operand1 + operand2);
				} else if (operator_3027.equals("-")) {
					s_3027.push(operand1 - operand2);
				} else if (operator_3027.equals("*")) {
					s_3027.push(operand1 * operand2);
				} else {
					s_3027.push(operand1 / operand2);
				}
			}
		}
		input_3027.close();
		return s_3027.pop();
	}
	public static void main(String[] args) {
		 System.out.println("hasil postfix= "+postfixEvaluate_2511533027("5 2 4 * + 7 -"));
	}
}
