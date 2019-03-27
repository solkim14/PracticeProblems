/**
* Test for BST and Node
*/

public class BSTTest {
	public static void main(String[] args) {
		Node node = new Node(5);
		System.out.println(node.data);
		
		BST tree = new BST();
		
		tree.add(new Node(8));
		tree.add(new Node(3));
		tree.add(new Node(10));
		tree.add(new Node(1));
		tree.add(new Node(6));
		tree.add(new Node(2));
		tree.add(new Node(4));
		tree.add(new Node(7));
		tree.add(new Node(14));
		tree.add(new Node(13));
		
		System.out.println("					" + tree.root.data + "					");
		System.out.println();
		System.out.println("			" + tree.root.left.data + "				" + tree.root.right.data + "			");
		System.out.println();
		System.out.println("		" + tree.root.left.left.data + "		" + tree.root.left.right.data + "				" + tree.root.right.right.data + "		");
		System.out.println("			" + tree.root.left.left.right.data + "   " + tree.root.left.right.left.data + "		" + tree.root.left.right.right.data + "		" + tree.root.right.right.left.data + "		");
	}
}