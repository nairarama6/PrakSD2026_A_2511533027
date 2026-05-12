package pekan6_2511533027;

public class PenelusuranDLL_2511533027 {
	// fungsi penelusuran maju
	static void forwardTraversal_3027(NodeDLL_2511533027 head_3027) {
		// memulai penelusuran dari head
		NodeDLL_2511533027 curr_3027 = head_3027;
		// lanjutkan sampai akhir 
		while (curr_3027 != null) {
			// print data
			System.out.print(curr_3027.data_3027 + " <-> ");
			// pindah ke node berikutnya
			curr_3027 = curr_3027.next_3027;
		}
		// print spasi
		 System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversal_3027(NodeDLL_2511533027 tail_3027) {
		// mulai dari akhir
		NodeDLL_2511533027 curr_3027 = tail_3027;
		// lanjut sampai head
		while (curr_3027 != null) {
			// cetak data
			 System.out.print(curr_3027.data_3027 + " <-> ");
			// pindah ke node sebelumnya
			 curr_3027 = curr_3027.prev_3027;
		}
		// cetak spasi
		 System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL 
		NodeDLL_2511533027 head_3027 = new NodeDLL_2511533027(1);
		NodeDLL_2511533027 second_3027 = new NodeDLL_2511533027(2);
		NodeDLL_2511533027 third_3027 = new NodeDLL_2511533027(3);
		
		head_3027.next_3027 = second_3027;
		second_3027.prev_3027 = head_3027;
		second_3027.next_3027 = third_3027;
		third_3027.prev_3027 = second_3027;
		
		System.out.println("Penelusuran maju:");
		forwardTraversal_3027(head_3027);
		
		System.out.println("Penelusuran mundur:");
		backwardTraversal_3027(third_3027); 
	}

}
