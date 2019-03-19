/**
* How are duplicate nodes removed in an unsorted linked list?
* 
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class LinkedListRemoveDups {

	/**
	* O(n)
	*
	* Summary:  Iterate through linked list, put into hash map, if contains key remove from linked list
	*			
	* @param 
	* @return 
	*/
	public static void removeDups(SinglyLinkedList list) {
		Map<Node,Integer> map = new HashMap<>();
		Node current = list.getFirst();
		
		while(current!=null) {
			if (map.containsKey(current)) {
				current=list.remove(current);
			}
			current=current.next();
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		Node node5 = new Node(5);
		
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(4));
		list.addLast(node5);
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(node5);
		list.remove(node5);
		list.addLast(new Node(9));
		
		list.display();
		
		//removeDups(list);
		
		list.display();
	}
}