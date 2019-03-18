/**
* How do you reverse a linked list
*
* @version 1.0
*/

//imports

public class LinkedListReverse {

	/**
	* O(n)
	*
	* Summary:  iterate through the linked list: remove the head of the linked list and add to the head of the second. Continue until complete.
	*			
	* @param list the Singly Linked List we want to reverse
	* @return reverse the same elements of list but in reverse
	*/
	public static SinglyLinkedList reverse(SinglyLinkedList list) {
		SinglyLinkedList reverseList = new SinglyLinkedList();
		//iterate until last element
		Node current=list.getFirst();
		
		while (current != null) {
			Node node=list.removeFirst();
			reverseList.addFirst(node); //THIS IS THE BUG
			//list.display();
			//System.out.println(node.getData() + " -> " + node.next().getData());
			
			current=list.getFirst();
		}
		return reverseList;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(4));
		list.addLast(new Node(5));
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(new Node(9));
		
		list.display();
		
		SinglyLinkedList reverseList=reverse(list);
		/**
		SinglyLinkedList reverseList = new SinglyLinkedList();
		reverseList.addFirst(new Node(1));
		reverseList.addFirst(new Node(2));
		reverseList.addFirst(new Node(3));
		reverseList.addFirst(new Node(4));
		reverseList.addFirst(new Node(5));
		reverseList.addFirst(new Node(6));
		reverseList.addFirst(new Node(7));
		reverseList.addFirst(new Node(8));
		reverseList.addFirst(new Node(9));
		*/
		reverseList.display();
	}
}