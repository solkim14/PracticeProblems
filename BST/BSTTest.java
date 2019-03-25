/**
* Test for BST and Node
*/

public class BSTTest {
	public static void main(String[] args) {
		Node node = new Node(5);
		System.out.println(node.data);
		
		BST tree = new BST();
		
		tree.add(new Node(2));
		tree.add(new Node(1));
		tree.add(new Node(3));
		
		System.out.println("root:" + tree.root.data + " left:" + tree.root.left.data); //+ " right:" + tree.root.right.data);
	}
}