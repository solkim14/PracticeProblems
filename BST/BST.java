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
					current = current.left;
				} else {
					current = current.right;
				}
			}
			current=node;
		}
	}

	//delete
	
	//search

	//count nodes
	
	//isEmpty
	
	//BFS
	
	//DFS
}