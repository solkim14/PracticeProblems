/**
* Binary Search Tree (BST) Implementation
*/

public class BST {
	public Node root;
	
	public BST() {
		this.root=null;
	}
	
	/** add - iterative */
	public void add(Node node) {
		if (root==null) root = node; //if empty
		else { //not empty
			Node current = root;
			while (current!=null) {
				if (node.data < current.data) {
					Node parent = current;
					current = current.left;
					if (current==null) parent.left=node;
				} else {
					Node parent = current;
					current = current.right;
					if (current==null) parent.right=node;
				}
			}
		}
	}
	
	/** add - recursive */

	/** delete - iterative */
	public void delete(Node node) {
		//find node
		if (root==null || node==null) return; //if root empty or node is null
		else { //not empty
			Node parent=null;
			Node current = root;
			while (current!=node) {
				System.out.println(current.data);
				if (node.data < current.data) {
					parent = current;
					current = current.left;
				} else {
					parent = current;
					current = current.right;
				}
			}
			//delete node
			if (current.left==null && current.right==null) current=null; //if no children
			else if ((current.left!=null && current.right==null) || (current.left==null && current.right!=null)) { //if one child
				if (current.left!=null && current.right==null) parent=current; //if has left child
			} else { //if two children
				//find minimum value in right subtree
					//first try and do 
			}	
		}
	}
	
	/** delete - revursive */
	
	/** binary search */

	/** count nodes */
		//isEmpty
	
	/** count leaves */
		
	/** preorder - recursive */
	/** preorder - iterative */
	
	/** inorder - recursive */
	/** inorder - iterative */
	
	/** postorder - recursive */
	/** postorder - iterative */
}