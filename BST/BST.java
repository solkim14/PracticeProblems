/**
* Binary Search Tree (BST) Implementation
*/

import java.util.Stack;

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
			while (current!=node) { //find node
				if (node.data < current.data) {
					parent = current;
					current = current.left;
				} else {
					parent = current;
					current = current.right;
				}
			}
			//delete node 
			if (current.left==null && current.right==null) { //if no children
				if (current==root) root=null;//if root
				if (parent.left==null) parent.right=null;
				else  parent.left=null;
			} else if (current.left!=null && current.right==null) { //if one left child
				if (parent.left==current) parent.left=current.left;
				else parent.right=current.left;
			} else if (current.left==null && current.right!=null) { //if one right child
				if (parent.left==current) parent.left=current.right;
				else parent.right=current.right;
			} else {//if two children
				Node minRightSubParent=current; //find minimum value in right subtree
				Node minRightSub=current.right;
				System.out.println("starting removal");
				System.out.println("parent:" + minRightSubParent.data + " current:" + minRightSub.data);
				while (minRightSub.left!=null) {
					minRightSubParent=minRightSub;
					minRightSub=minRightSub.left;
					System.out.println("finding");
					System.out.println("parent:" + minRightSubParent.data + " current:" + minRightSub.data);
				}
				System.out.println("found minimum");
				System.out.println("parent:" + minRightSubParent.data + " current:" + minRightSub.data);
				int temp = current.data; //swap node data with minimum node data in right subtree
				current.data = minRightSub.data;
				minRightSub.data = temp;
				if (minRightSubParent.right==minRightSub) minRightSubParent.right=minRightSubParent.right.right; //remove minimum node in right subtree
				else {
					if (minRightSub.left==null && minRightSub.right==null) minRightSubParent.left=null; //if minRightSub is a leaf node
					else minRightSubParent.left=minRightSub.right;//minRightSub has a right child
				}
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
	public void preorder() {
		if (root==null) return; //if empty there's nothing to traverse
		else {
			Stack<Node> stack = new Stack<>();
			stack.push(root);
			while (!stack.empty()) {
				Node popped = stack.pop();
				System.out.println(popped.data);
				if (popped.right!=null) stack.push(popped.right);
				if (popped.left!=null) stack.push(popped.left);
			}
		}
	}
	
	/** inorder - recursive */
	/** inorder - iterative */
	
	/** postorder - recursive */
	/** postorder - iterative */
}