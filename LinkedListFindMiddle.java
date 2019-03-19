/**
* How do you find the middle element of a singly linked list
* in one pass?
*
* @version 1.0
*/

public class LinkedListFindMiddle {

	/**
	* O(n)
	*
	* Summary:  Iterates through every element of the linked list. Keeps 2 pointers, "current" which will pass each element once
	*			and "middle" a pointer that keeps track of the middle element from the beginning of the list to the "current" pointer
	*			
	* @param list the LinkedList where you will find the middle element
	* @return middle the middle node of list
	*/
	public static Node findMiddle(CircularSinglyLinkedList list) {
		int counter=0;
		if (list.size()<1) return null; //if empty return
		
		Node middle=list.getNode(0); //start at the head
		Node current=list.getNode(0);
				
		while(current.next() != list.getLast()) { //while not at the last element of list
			current=current.next();
			counter++;
			
			if(counter%2==0) middle=middle.next();
		}
		return middle;
	}

	public static void main(String[] args) {
		
		//LinkedList<Node> list = new LinkedList<Node>();
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		
		
		list.addLast(new Node(1));
		/**
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(4));
		list.addLast(new Node(5));
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(new Node(9));
		list.addLast(new Node(10));
		*/
		list.display();
		//LinkedList<Integer> list = new LinkedList<>();
		
		Node middle = findMiddle(list);
		
		if (middle != null) System.out.println("middle node is " + middle.getData());
	}
}