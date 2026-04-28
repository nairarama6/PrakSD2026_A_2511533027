package pekan4_2511533027;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533027 {

	public static void main(String[] args) {
		Queue<String> q_3027 = new LinkedList<>();
		q_3027.add("Praktikum");
		q_3027.add("Struktur");
		q_3027.add("Data");
		q_3027.add("Dan");
		q_3027.add("Algoritma");
		Iterator<String> iterator = q_3027.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
