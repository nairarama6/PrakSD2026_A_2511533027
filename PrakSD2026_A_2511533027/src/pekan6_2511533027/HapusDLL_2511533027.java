package pekan6_2511533027;

public class HapusDLL_2511533027 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533027 delHead_3027(NodeDLL_2511533027 head_3027) {
		if (head_3027 == null) {
			return null;		}
		NodeDLL_2511533027 temp_3027 = head_3027;
		head_3027 = head_3027.next_3027;
		if (head_3027 != null) {
			head_3027.prev_3027 = null;		}
		return head_3027;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533027 delLast_3027(NodeDLL_2511533027 head_3027) {
		if (head_3027 == null) {
			return null;		}
		if (head_3027.next_3027 == null) {
			return null;		}
		NodeDLL_2511533027 curr_3027 = head_3027;
		while (curr_3027.next_3027 != null) {
			curr_3027 = curr_3027.next_3027;
		}
		// update pointer previous node
		if (curr_3027.prev_3027 != null) {
			curr_3027.prev_3027.next_3027 = null;		}
		return head_3027;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533027 delPos_3027(NodeDLL_2511533027 head_3027, int pos_3027) {
		// jika DLL kosong
		if (head_3027 == null) {
			return head_3027;		}
		NodeDLL_2511533027 curr_3027 = head_3027;
		// telusuri sampai ke node yang akan di hapus
		for (int i = 1; curr_3027 != null && i < pos_3027; ++i) {
			curr_3027 = curr_3027.next_3027;		}
		// jika posisi tidak ditemukan
		if (curr_3027 == null) {
			return head_3027;		}
		// update pointer
		if (curr_3027.prev_3027 != null) {
			curr_3027.prev_3027.next_3027 = curr_3027.next_3027;		}
		if (curr_3027.next_3027 != null) {
			curr_3027.next_3027.prev_3027 = curr_3027.prev_3027;		}
		// jika yang di hapus head
		if (head_3027 == curr_3027) {
			head_3027 = curr_3027.next_3027;		}
		return head_3027;
	}
	// fungsi mencetak DLL
	public static void printList_3027(NodeDLL_2511533027 head_3027) {
		NodeDLL_2511533027 curr_3027 = head_3027;
		while (curr_3027 != null) {
			 System.out.print(curr_3027.data_3027 + " <-> ");
			 curr_3027 = curr_3027.next_3027;
		}
		 System.out.println();
	}
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511533027 head_3027 = new NodeDLL_2511533027(1);
		head_3027.next_3027 = new NodeDLL_2511533027(2);
		head_3027.next_3027.prev_3027 = head_3027;
		head_3027.next_3027.next_3027 = new NodeDLL_2511533027(3);
		head_3027.next_3027.next_3027.prev_3027 = head_3027.next_3027;
		head_3027.next_3027.next_3027.next_3027 = new NodeDLL_2511533027(4);
		head_3027.next_3027.next_3027.next_3027.prev_3027 = head_3027.next_3027.next_3027;
		head_3027.next_3027.next_3027.next_3027.next_3027 = new NodeDLL_2511533027(5);
		head_3027.next_3027.next_3027.next_3027.next_3027.prev_3027 = head_3027.next_3027.next_3027.next_3027;
		
		 System.out.print("DLL Awal: ");
		 printList_3027(head_3027);
		 
		 System.out.print("Setelah head dihapus: ");
		 head_3027 = delHead_3027(head_3027);
		 printList_3027(head_3027);
		 
		 System.out.print("Setelah node terakhir dihapus: ");
		 head_3027 = delLast_3027(head_3027);
		 printList_3027(head_3027);
		 
		 System.out.print("Menghapus node ke 2: ");
		 head_3027 = delPos_3027(head_3027, 2);
		 
		 printList_3027(head_3027);
	}

}
