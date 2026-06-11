package pekan9_2511533027;

public class BTree_2511533027 {
	private Node_2511533027 root_3027;
	private Node_2511533027 currentNode_3027;
	public BTree_2511533027() {
		root_3027 = null;
	}
	
	public boolean search(int data_3027) {
		return search_3027(root_3027, data_3027);
	}
	
	private boolean search_3027(Node_2511533027 node_3027, int data_3027) {
		if (node_3027.getData_3027() == data_3027)
			return true;
		if (node_3027.getLeft_3027() != null)
			if (search_3027(node_3027.getLeft_3027(), data_3027))
				return true;
		if (node_3027.getRight_3027() != null)
			if (search_3027(node_3027.getRight_3027(), data_3027))
				return true;
		return false;
	}
	
	public void printInorder_3027() {
		root_3027.printInorder_3027(root_3027);
	}
	
	public void printPreorder_3027() {
		root_3027.printPreorder_3027(root_3027);
	}
	
	public void printPostorder_3027() {
		root_3027.printPostorder_3027(root_3027);	
	}
	
	public Node_2511533027 getRoot_3027() {
		return root_3027;
	}
	
	public boolean isEmpty_3027() {
		return root_3027 == null;
	}
	
	public int countNodes_3027() {
		return countNodes_3027(root_3027);
	}
	
	private int countNodes_3027(Node_2511533027 node_3027) {
		int count_3027 = 1;
		if (node_3027 == null) {
			return 0;
		} else {
			count_3027 += countNodes_3027(node_3027.getLeft_3027());
			count_3027 += countNodes_3027(node_3027.getRight_3027());
			return count_3027;
		}
	}
	
	public void print_3027() {
		root_3027.print_3027();
	}
	
	public Node_2511533027 getCurrent_3027() {
		return currentNode_3027;
	}
	
	public void setCurrent_3027(Node_2511533027 node_3027) {
		this.currentNode_3027 = node_3027;
	}
	
	public void setRoot_3027(Node_2511533027 root_3027) {
		this.root_3027 = root_3027;
	}

}