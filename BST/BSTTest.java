/**
* Test for BST and Node
*/

public class BSTTest {
	public static void main(String[] args) {
		Node node = new Node(5);
		System.out.println(node.data);
		
		BST tree = new BST();
		
		Node node8 = new Node(8);
		Node node3 = new Node(3);
		Node node10 = new Node(10);
		Node node1 = new Node(1);
		Node node6 = new Node(6);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node7 = new Node(7);
		Node node14 = new Node(14);
		Node node13 = new Node(13);
		
		tree.add(node8);
		tree.add(node3);
		tree.add(node10);
		tree.add(node1);
		tree.add(node6);
		tree.add(node2);
		tree.add(node4);
		tree.add(node7);
		tree.add(node14);
		tree.add(node13);
		
		tree.delete(node4);
		
		System.out.println("					" + tree.root.data + "					");
		System.out.println();
		System.out.println("			" + tree.root.left.data + "				" + tree.root.right.data + "			");
		System.out.println();
		System.out.println("		" + tree.root.left.left.data + "		" + tree.root.left.right.data + "				" + tree.root.right.right.data + "		");
		System.out.println("			" + tree.root.left.left.right.data + "   " + tree.root.left.right.left.data + "		" + tree.root.left.right.right.data + "		" + tree.root.right.right.left.data + "		");
	}
}