/**
* How do you find the length of a singly linked list?
*
* @version 1.0
*/

//imports

public class LinkedListFindLength {

	/**
	* O(n)
	*
	* Summary:  Iterate through the given linked list and keep a counter of all elements
	*			
	* @param list the list to iterate through
	* @return the number of elements in list
	*/
	public static int length(SinglyLinkedList list) {
		int counter=0;
		Node current = list.getFirst();

		while(current!=null) {
			current=current.next();
			counter++;
		}
		return counter;
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
		System.out.println("# of nodes: " + length(list));
	}
}