/**
* How do you find the third fnode from the end in a singly linked list?
*
* @version 1.0
*/

//imports

public class LinkedListFindThirdLastNode {

	/**
	* O(n)
	*
	* Summary:  Iterate through the given linked list and looks for 2 nodes ahead of the current element. Return this node;
	*			
	* @param list the list to iterate through
	* @return the third node from the end of the list
	*/
	public static Node thirdToLast(SinglyLinkedList list) {
		Node current=list.getFirst();
		
		if(current==null || current.next()==null || current.next().next()==null) return null;
		
		while (current.next().next().next()!=null) {
			current=current.next();
		}
		return current;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		
		list.addLast(new Node(1));
		/**
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(4));
		list.addLast(new Node(4));
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(new Node(4));
		*/
		
		list.display();
		
		Node thirdToLast=thirdToLast(list);
		if(thirdToLast==null) {
			System.out.println("Array is too small!");
		} else {
			System.out.println("3rd to last node: " + thirdToLast.getData());
		}
	}
}