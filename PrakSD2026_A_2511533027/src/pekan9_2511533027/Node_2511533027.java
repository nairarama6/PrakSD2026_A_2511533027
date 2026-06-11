package pekan9_2511533027;

import org.w3c.dom.Node;

public class Node_2511533027 {
	int data_3027;
	Node_2511533027 left_3027;
	Node_2511533027 right_3027;
	public Node_2511533027(int data_3027) {
		this.data_3027 = data_3027;
		left_3027 = null;
		right_3027 = null;
	}
	
	public void setLeft_3027(Node_2511533027 node_3027) {
		if (left_3027 == null)
			left_3027 = node_3027;
	}
	
	public void setRight_3027(Node_2511533027 node_3027) {
		if (right_3027 == null)
			right_3027 = node_3027;
	}
	
	public Node_2511533027 getLeft_3027() {
		return left_3027;
	}
	
	public Node_2511533027 getRight_3027() {
		return right_3027;
	}
	
	public int getData_3027() {
		return data_3027;
	}
	
	public void setData_3027(int data_3027) {
		this.data_3027 = data_3027;
	}
	
	void printPreorder_3027(Node_2511533027 node_3027) {
		if (node_3027 == null)
			return;
		System.out.print(node_3027.data_3027 + " ");
		printPreorder_3027(node_3027.left_3027);
		printPreorder_3027(node_3027.right_3027);
	}
	
	void printPostorder_3027(Node_2511533027 node_3027) {
		if (node_3027 == null)
			return;
		printPostorder_3027(node_3027.left_3027);
		printPostorder_3027(node_3027.right_3027);
		System.out.print(node_3027.data_3027 + " ");
	}
	
	void printInorder_3027(Node_2511533027 node_3027) {
		if (node_3027 == null)
			return;
			printInorder_3027(node_3027.left_3027);
			System.out.print (node_3027.data_3027 + " "); 
			printInorder_3027(node_3027.right_3027);
	}
	
	public String print_3027() {
			return this.print_3027("",true,"");
	}
	
	public String print_3027(String prefix_3027, boolean isTail_3027, String sb_3027) {
			if (right_3027 != null) {
			right_3027.print_3027(prefix_3027 + (isTail_3027 ? "|   " : "   "), false, sb_3027);
			}
			System.out.println ( prefix_3027+(isTail_3027 ? "\\-- " : "/-- ") +data_3027); 
			if (left_3027 != null) { 
			left_3027.print_3027(prefix_3027+ (isTail_3027 ?"  " : "|   "), true, sb_3027);
			}
			return sb_3027;
	}

}
