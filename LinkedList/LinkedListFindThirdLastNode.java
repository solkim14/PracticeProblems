/**
* How do you find the third node from the end in a singly linked list?
*
* @version 1.0
*/

//imports

public class LinkedListFindThirdLastNode {

	/**
	* O(n) - TWO POINTER SOLUTION
	*
	* Summary:  Set 2 pointers. Set the second pointer 2 elements ahead of the first pointer. Return if second pointer is null
	*			else, iterate both pointers forward until 
	*			
	* @param list the list to iterate through
	* @return the third node from the end of the list
	*/
	public static Node thirdToLast(SinglyLinkedList list) {
		Node pointer1=list.getFirst();
		Node pointer2=list.getFirst();
		
		for(int i=0; i<3; i++) { //move pointer2 two nodes ahead of pointer1
			if(pointer2==null) return null;
			else pointer2=pointer2.next();
		}
		
		while (pointer2!=null) { //move pointers until pointer2 reaches end
			pointer1=pointer1.next();
			pointer2=pointer2.next();
		}
		return pointer1;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		
		list.addLast(new Node(3));
		
		list.addLast(new Node(4));
		list.addLast(new Node(4));
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(new Node(4));
		
		
		list.display();
		
		Node thirdToLast=thirdToLast(list);
		if(thirdToLast==null) {
			System.out.println("Linked List is too small!");
		} else {
			System.out.println("3rd to last node: " + thirdToLast.getData());
		}
	}
	/**
	* O(n) - ONE POINTER SOLUTION
	*
	* Summary:  Iterate through the given linked list and looks for 2 nodes ahead of the current element. Return this node;
	*			
	* @param list the list to iterate through
	* @return the third node from the end of the list
	
	public static Node thirdToLast(SinglyLinkedList list) {
		Node current=list.getFirst();
		
		if(current==null || current.next()==null || current.next().next()==null) return null;
		
		while (current.next().next().next()!=null) {
			current=current.next();
		}
		return current;
	}
	*/
}