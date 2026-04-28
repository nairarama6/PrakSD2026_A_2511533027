package pekan4_2511533027;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533027 {
	public static void main(String[] args) {
		Queue<Integer> q_3027 = new LinkedList<Integer>();
		q_3027.add(1);
		q_3027.add(2);
		q_3027.add(3); // [1, 2, 3]
		System.out.println("Sebelum reverse" + q_3027);
		Stack<Integer> s_3027 = new Stack<Integer>();
		while (!q_3027.isEmpty()) { // Q -> S
			 s_3027.push(q_3027.remove());
		}
		while (!s_3027.isEmpty()) { // S -> Q
			q_3027.add(s_3027.pop());
		}
		System.out.println("Sesudah reverse= " + q_3027); // [3, 2 ,1]
	}

}
