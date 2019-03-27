/**
* Binary Search Tree (BST) Implementation
*/

public class BST {
	public Node root;
	
	public BST() {
		this.root=null;
	}
	
	public void add(Node node) {
		if (root==null) root = node; //if empty
		else { //not empty
			Node current = root;
			while (current!=null) {
				if (node.data < current.data) {
					Node prev = current;
					current = current.left;
					if (current==null) prev.left=node;
				} else {
					Node prev = current;
					current = current.right;
					if (current==null) prev.right=node;
				}
			}
		}
	}

	//delete
	
	//search

	//count nodes
	
	//isEmpty
	
	//preorder
	
	//inorder
	
	//postorder
}