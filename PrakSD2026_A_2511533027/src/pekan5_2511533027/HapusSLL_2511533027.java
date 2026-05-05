package pekan5_2511533027;

public class HapusSLL_2511533027 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511533027 deleteHead_3027(NodeSLL_2511533027 head_3027) {
		// jika SLL kosong
		if (head_3027 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3027 = head_3027.next_3027;
		// return head baru
		return head_3027;     }
	// fungsi mengahpus node terakhir SLL
	public static NodeSLL_2511533027 removeLastNode_3027(NodeSLL_2511533027 head_3027) {
		// jika list kosong, return null
		if (head_3027 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_3027.next_3027 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2511533027 secondLast = head_3027;
		while (secondLast.next_3027.next_3027 != null) {
			secondLast = secondLast.next_3027;
		}
		// hapus node terakhir
		secondLast.next_3027 = null;
		return head_3027;      }
		
// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533027 deleteNode_3027(NodeSLL_2511533027 head_3027, int position_3027) {
		NodeSLL_2511533027 temp_3027 = head_3027;
		NodeSLL_2511533027 prev_3027 = null;
		// jika linked list null
		if (temp_3027 == null)
			return head_3027;
		// kasus 1: head dihapus
		if (position_3027 == 1) {
			head_3027 = temp_3027.next_3027;
			return head_3027;
		}
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang dihapus
	for (int i = 1; temp_3027 != null && i < position_3027; i++) {
		prev_3027 = temp_3027;
		temp_3027 = temp_3027.next_3027;   }
		// jika ditemukan, hapus node
		if (temp_3027 != null) {
			prev_3027.next_3027 = temp_3027.next_3027;
		} else {
			System.out.println("Data tidak ada");     }
		return head_3027;      }

	// fungsi mencetak SLL
		public static void printList_3027(NodeSLL_2511533027 head_3027) {
			NodeSLL_2511533027 curr_3027 = head_3027;
			while (curr_3027.next_3027 != null) {
				System.out.print(curr_3027.data_3027+"-->");
				curr_3027 = curr_3027.next_3027; }
			if (curr_3027.next_3027==null) { 
				System.out.print(curr_3027.data_3027);  }
			System.out.println();
		}
			
			// kelas main
			public static void main(String[] args) {
				// buat  SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
				NodeSLL_2511533027 head_3027 = new NodeSLL_2511533027(1);
				head_3027.next_3027 = new NodeSLL_2511533027(2);
				head_3027.next_3027.next_3027 = new NodeSLL_2511533027(3);
				head_3027.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(4);
				head_3027.next_3027.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(5);
				head_3027.next_3027.next_3027.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(6);
				// cetak list awal 
				System.out.println("List awal: ");
				printList_3027(head_3027);
				// hapus head
				head_3027 = deleteHead_3027(head_3027);
				System.out.println("List setelah head dihapus: ");
				printList_3027(head_3027);
				// hapus node terakhir
				head_3027 = removeLastNode_3027(head_3027);
				System.out.println("List setelah simpul terakhir dihapus: ");
				printList_3027(head_3027);
				// deleting node at position 2
				int position_3027 = 2;
				head_3027 = deleteNode_3027(head_3027, position_3027);
				// print list after deletion
				System.out.println("List setelah posisi 2 dihapus: ");
				printList_3027(head_3027);
			}
}
