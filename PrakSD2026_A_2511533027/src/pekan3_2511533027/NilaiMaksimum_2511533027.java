package pekan3_2511533027;

import java.util.Stack;

public class NilaiMaksimum_2511533027 {
	public static int max_3027(Stack<Integer> s_3027) {
		Stack<Integer> backup_3027 = new Stack<Integer>();
		int maxValue_3027 = s_3027.pop();
		backup_3027.push(maxValue_3027);
		while (!s_3027.isEmpty()) {
			int next_3027 = s_3027.pop();
			backup_3027.push(next_3027);
			maxValue_3027 = Math.max(maxValue_3027, next_3027);
		}
		while (!backup_3027.isEmpty()) {
			s_3027.push(backup_3027.pop());
		}
		return maxValue_3027;
	}
	public static void main(String[] args) {
		Stack<Integer> s_3027 = new Stack<Integer>();
		s_3027.push(70);
		s_3027.push(12);
		s_3027.push(20);
		 System.out.println("isi stack"+s_3027);
		 System.out.println("Stack Teratas "+s_3027.peek());
		 System.out.println("Nilai Maksimum "+max_3027(s_3027));	
	}

}
