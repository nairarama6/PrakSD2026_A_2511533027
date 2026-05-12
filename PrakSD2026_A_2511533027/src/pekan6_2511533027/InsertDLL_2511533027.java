package pekan6_2511533027;

public class InsertDLL_2511533027 {
	// menambahkan node di awal DLL
	static NodeDLL_2511533027 insertBegin_3027(NodeDLL_2511533027 head_3027, int data_3027) {
		// buat node baru
		NodeDLL_2511533027 new_node_3027 = new NodeDLL_2511533027(data_3027);
		// jadikan pointer nextnya head
		new_node_3027.next_3027 = head_3027;
		// jadikan pointer prev head ke new_node
		if (head_3027 != null) {
			head_3027.prev_3027 = new_node_3027;
		}
		return new_node_3027;
	}
	
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511533027 insertEnd_3027(NodeDLL_2511533027 head_3027, int newData_3027) {
		// buat node baru
		NodeDLL_2511533027 newNode_3027 = new NodeDLL_2511533027(newData_3027);
		// jika dll nu;; jadikan head
		if (head_3027 == null) {
			head_3027 = newNode_3027;
		} 
		else {
			NodeDLL_2511533027 curr_3027 = head_3027;
			while (curr_3027.next_3027 != null) {
				curr_3027 = curr_3027.next_3027;
			}
			curr_3027.next_3027 = newNode_3027;
			newNode_3027.prev_3027 = curr_3027;
		}
		return head_3027;
	}
	
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533027 insertAtPosition_3027(NodeDLL_2511533027 head_3027, int pos_3027, int new_data_3027) {
		// buat node baru
		NodeDLL_2511533027 new_node_3027 = new NodeDLL_2511533027(new_data_3027);
		if (pos_3027 == 1) {
			new_node_3027.next_3027 = head_3027;
			if (head_3027 != null) {
				head_3027.prev_3027 = new_node_3027;    }
			head_3027 = new_node_3027;
			return head_3027;     }
		NodeDLL_2511533027 curr_3027 = head_3027;
	for (int i = 1; i < pos_3027 - 1 && curr_3027 != null; ++i) {
			curr_3027 = curr_3027.next_3027;    }
		if (curr_3027 == null) {
			System.out.println("Posisi tidak ada");
			return head_3027;     }
		new_node_3027.prev_3027 = curr_3027;
		new_node_3027.next_3027 = curr_3027.next_3027;
		curr_3027.next_3027 = new_node_3027;
		if (new_node_3027.next_3027 != null) {
			new_node_3027.next_3027.prev_3027 = new_node_3027;   }
		return head_3027;
	}
	public static void printList_3027(NodeDLL_2511533027 head_3027) {
		NodeDLL_2511533027 curr_3027 = head_3027;
		while (curr_3027 != null) {
			System.out.print(curr_3027.data_3027 + " <-> ");
			curr_3027 = curr_3027.next_3027;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533027 head_3027 = new NodeDLL_2511533027(2);
		head_3027.next_3027 = new NodeDLL_2511533027(3);
		head_3027.next_3027.prev_3027 = head_3027;
		head_3027.next_3027.next_3027 = new NodeDLL_2511533027(5);
		head_3027.next_3027.next_3027.prev_3027 = head_3027.next_3027;
		// cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_3027(head_3027);
		// tambah 1 di awal
		head_3027 = insertBegin_3027(head_3027, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		printList_3027(head_3027);
		// tambah 6 di akhir
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data = 6;
		head_3027 = insertEnd_3027(head_3027, data);
		printList_3027(head_3027);
		// menambah 4 node di posisi 4
		System.out.print("Tambah node 4 di posisi 4: ");
		int data2_3027 = 4;
		int pos_3027 = 4;
		head_3027 = insertAtPosition_3027(head_3027, pos_3027, data2_3027);
		printList_3027(head_3027);
	}

}
