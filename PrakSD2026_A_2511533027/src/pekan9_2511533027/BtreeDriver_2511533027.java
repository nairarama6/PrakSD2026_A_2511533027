package pekan9_2511533027;

public class BtreeDriver_2511533027 {
	public static void main(String[] args) {
        // Membuat Pohon
        BTree_2511533027 tree_3027 = new BTree_2511533027();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_3027.countNodes_3027());

        // menambahkan simpul data 1
        Node_2511533027 root_3027 = new Node_2511533027(1);

        // menjadikan simpul 1 sebagai root
        tree_3027.setRoot_3027(root_3027);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3027.countNodes_3027());

        Node_2511533027 node2_3027 = new Node_2511533027(2);
        Node_2511533027 node3_3027 = new Node_2511533027(3);
        Node_2511533027 node4_3027 = new Node_2511533027(4);
        Node_2511533027 node5_3027 = new Node_2511533027(5);
        Node_2511533027 node6_3027 = new Node_2511533027(6);
        Node_2511533027 node7_3027 = new Node_2511533027(7);
        Node_2511533027 node8_3027 = new Node_2511533027(8);
        Node_2511533027 node9_3027 = new Node_2511533027(9);

        root_3027.setLeft_3027(node2_3027);
        node2_3027.setLeft_3027(node4_3027);
        node2_3027.setRight_3027(node5_3027);
        node4_3027.setRight_3027(node8_3027);

        root_3027.setRight_3027(node3_3027);
        node3_3027.setLeft_3027(node6_3027);
        node3_3027.setRight_3027(node7_3027);
        node6_3027.setLeft_3027(node9_3027);
	
		// Set root
		tree_3027.setCurrent_3027(tree_3027.getRoot_3027());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_3027.getCurrent_3027().getData_3027());
	
		System.out.println("Jumlah simpul setelah simpul 7 ditambahkan");
		System.out.println(tree_3027.countNodes_3027());
	
		System.out.println("InOrder: ");
		tree_3027.printInorder_3027();
	
		System.out.println("\nPreorder: ");
		tree_3027.printPreOrder_3027();
	
		System.out.println("\nPostorder : ");
		tree_3027.printPostOrder_3027();
	
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_3027.print_3027();
	}
	
}
	
	