/**
* How do you reverse a singly linked list without recursion?
*
* @version 2.0
*/

public class LinkedListReverse {
	
	/**
	* O(n) - NEW
	*
	* Summary:  iterate through the linked list, keep track of previous element and change next element pointer to point to previous
	*			
	* @param list the Singly Linked List we want to reverse
	* @return reverse the same elements of list but in reverse
	*/
	public static SinglyLinkedList reverse(SinglyLinkedList list) {
		Node prev=null;
		Node current=list.getFirst();
		Node next=null;
		
		while (current != null) {
			System.out.println("current: " + current.getData());
			next=current.next();
			current.setNext(prev);
			prev=current;
			current=next;
		}
		list.setHead(prev); //have to reset head
		return list;
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
	/**
	* O(n) - OLD, takes O(n) space vs O(1) in new solution
	*
	* Summary:  iterate through the linked list: remove the head of the linked list and add to the head of the second. Continue until complete.
	*			
	* @param list the Singly Linked List we want to reverse
	* @return reverse the same elements of list but in reverse
	
	public static SinglyLinkedList reverse(SinglyLinkedList list) {
		SinglyLinkedList reverseList = new SinglyLinkedList();
		Node current=list.getFirst();
		
		while (current != null) {
			Node node=list.removeFirst();
			reverseList.addFirst(node); //THIS IS THE BUG			
			current=list.getFirst();
		}
		return reverseList;
	}
	*/
}