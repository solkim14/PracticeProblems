/**
* How do you check if a given linked list contains a cycle? How do you find the starting node of the cycle?
* 
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class LinkedListFindCycle {

	/**
	* O(n)
	*
	* Summary:  Iterate throught the linked list and look for a node that current.next() twice OR if any node is pointing to head
	*			by putting into a HashMap			
	* @param 
	* @return 
	*/
	public static boolean hasCycle(SinglyLinkedList list) {
		Map<Node, Node> map = new HashMap<>();
		boolean hasCycle = false;
		Node cycleStartNode;
		Node current=list.getFirst();
		Node next=current.next();
		
		while (next != null) {
			if(map.containsKey(next) || list.getFirst()==next) { //if node is next twice OR if any node is pointing to head
				hasCycle=true;
				cycleStartNode=map.get(next);
				break;
			} else {
				map.put(next,current);
				current=next;
				next=current.next();
			}
		}
		//bug? do we need to account for last node? infinite loop? need to set to null?
		
		return hasCycle;
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		Node node1=new Node(1);
		list.addLast(node1);
		Node node2=new Node(2);
		list.addLast(node2);
		list.addLast(new Node(3));
		Node node4=new Node(4);
		//node4.setNext(node2);
		node4.setNext(node1);
		list.addLast(node4);
		//list.addLast(new Node(5));
		//list.addLast(new Node(6));
		//list.addLast(new Node(7));
		//list.addLast(new Node(8));
		//list.addLast(new Node(9));
		
		//list.display();
		
		System.out.println(hasCycle(list));
	}
}