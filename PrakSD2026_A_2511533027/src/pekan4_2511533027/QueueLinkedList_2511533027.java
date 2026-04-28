package pekan4_2511533027;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533027 {

	public static void main(String[] args) {
		Queue<Integer> q_3027 = new LinkedList<>();
		// tambah elemen (0, 1, 2, 3, 4, 5) ke antrian
		for (int i = 0; i < 6; i++)
			q_3027.add(i);
		// menampilkan isi antrian.
		 System.out.println("Elemen Antrian " + q_3027);
		 
		// untuk mengahpus kepala antrian. 
		 int hapus_3027 = q_3027.remove();
		 System.out.println("Hapus Elemen = " + hapus_3027);
		 System.out.println(q_3027);
		 
		 // untuk melihat antrian terdepan 
		 int depan_3027 = q_3027.peek();
		 System.out.println("Kepala Antrian = " + depan_3027);
		 
		 int banyak_3027 = q_3027.size();
		 System.out.println("Size Antrian = " + banyak_3027);
	}

}
