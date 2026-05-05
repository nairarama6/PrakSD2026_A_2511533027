package pekan5_2511533027;

public class PencarianSLL_2511533027 {
	static boolean searchKey_3027(NodeSLL_2511533027 head_3027, int key_3027) {
		NodeSLL_2511533027 curr_3027 = head_3027;
		while (curr_3027 != null) {
			if (curr_3027.data_3027 == key_3027) 
				return true;
			curr_3027 = curr_3027.next_3027;  }
		return false;  }
	public static void traversal_3027(NodeSLL_2511533027 head_3027) {
		// mulai dari head
		NodeSLL_2511533027 curr_3027 = head_3027;
		// telusuri sampai pointer null
		while (curr_3027 != null) {
			System.out.print(" " + curr_3027.data_3027);
			curr_3027 = curr_3027.next_3027;  }
		System.out.println();            }
		public static void main(String[] args) {
			NodeSLL_2511533027 head = new NodeSLL_2511533027(14);
			head.next_3027 = new NodeSLL_2511533027(21);
			head.next_3027.next_3027 = new NodeSLL_2511533027(13);
			head.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(30);
			head.next_3027.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(10);
			System.out.print("Penulusuran SLL: ");
			traversal_3027(head);
			// data yang akan dicari
			int key_3027 = 30;
			System.out.print("Cari data " +key_3027+ " = ");
			if (searchKey_3027(head, key_3027))
				System.out.println("Ketemu");
			else 
				System.out.println("Tidak ada");
		} }
