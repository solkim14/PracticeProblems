/**
* An implementation of a Singly Linked List (circular)
*
*
* @author Sol Kim
* @version 1.0
* @since 8/27/18
*/

public class CircularSinglyLinkedList {
	private Node head;
	private Node tail;
		
	/**
	* Insert node to the beginning of the linked list: O(1)
	*
	* @param firstNode the node to add to the beginning of the list
	* @return none
	*/
	public void addFirst(Node firstNode) {
		if (head==null && tail==null) { //if the linked list is empty
			head = firstNode;
			tail = firstNode;
			head.setNext(tail);
			tail.setNext(head);
		} else { 
			firstNode.setNext(head);
			tail.setNext(firstNode);
			head = firstNode;
		}
	}
	
	/**
	* Add node to the end of the linked list: O(1)
	*
	* @param lastNode the node to add to the end of the linked list
	* @return none
	*/
	public void addLast(Node lastNode) {
		if (head==null && tail==null) { //if the linked list is empty
			head = lastNode;
			tail = lastNode;
			head.setNext(tail);
			tail.setNext(head);
		} else {
			tail.setNext(lastNode);
			tail = lastNode;
			tail.setNext(head);
		}
	}
	
	/**
	* Remove the first node of the linked list: O(1)
	*
	* @param none
	* @return the first node of the linked list removed
	*/
	public Node removeFirst() {
		Node firstNode = null;
				
		if (head==null && tail==null) { //if empty
			System.out.println("Linked list is empty! Can't remove!");
			//System.out.println("test 1");
		} else if (head == tail) { //if only one element in the linked list
			head = tail = null;
			//System.out.println("test 2");
		} else {
			//System.out.println("test 3");
			firstNode = head;
			head = head.next();
			firstNode.setNext(null);
			tail.setNext(head);
		}
		return firstNode;
	}
	
	/**
	* Remove the last node of the linked list: O(n)
	*
	* @param none
	* @return the last node of the linked list removed
	*/
	public Node removeLast() {
		Node lastNode = null;
		Node findNode = head;
		Node secondToLast = null;
				
		if (head==null && tail==null) { //if empty
			System.out.println("Linked list is empty! Can't remove!");
		} else if (head == tail) { //if only one element in the linked list
			head = tail = null;
		} else {
			while (findNode != tail) { //find the second to last node
				if (findNode.next() == tail) { //found it
					secondToLast = findNode;
					break;
				}
				findNode = findNode.next();
			}
			lastNode = tail;
			lastNode.setNext(null);
			tail = secondToLast;
			tail.setNext(head);
		}
		return lastNode;
	}
	
	public Node getLast() {return tail;}
	
	/**
	* Returns the size of the linked list: O(n)
	*
	* @param none
	* @return the size of the linked list
	*/
	public int size() {
		int size = 0;
		Node countNode = head;
		
		if (head==null && tail==null) { //if empty
			size = 0;
		} else if (head == tail) { //if only one element in the linked list
			size = 1;
		} else {
			size = 1;
			while (countNode.next() != head) { //find the second to last node
				size++;
				countNode = countNode.next();
			}
		}
		return size;
	}
	
	/**
	* Returns the node at given index (first element at 0); if index does not exist prints "INDEX DOES NOT EXIST" and returns a null node: O(n)
	*
	* @param index the index of the node to be returned
	* @return the node at the given index
	*/
	public Node getNode(int index) {
		int numNodes = 1;
		Node iterateNode = null;
		
		if (index < 0) { //if index is negative then it doesn't exist
			iterateNode = null;
			System.out.println("That index doesn't exist!");
		} else if (head==null && tail==null) { //if empty
			iterateNode = null;
			System.out.println("The linked list is empty, nothing to return!");
		} else if (index == 0) { //if requesting the first element
			iterateNode = head;
		} else {
			iterateNode = head.next();
			while (iterateNode != head) { //find the node at the given index
				if (numNodes == index) { //found it
					return iterateNode;
				}
				iterateNode = iterateNode.next();
				numNodes++;
			}
			//if it got through then the index requested is larger than the number of nodes
			iterateNode = null;
			System.out.println("Index too large! There are only " + numNodes + " nodes in the linked list.");
		}
		return iterateNode; //dummy node
	}
	
	/**
	* Adds a node to the given index. If index does not exist prints "INDEX DOES NOT EXIST": O(n)
	*
	* @param index the index of the node to be added
	* @param node the node to be added
	* @return none
	*/
	public void add(int index, Node node) {		
		if (index < 0) { //if index is negative then it doesn't exist
			System.out.println("Can't add! That index doesn't exist!");
		} else if (index == 0) {
			addFirst(node);
		} else { //index > 0 //ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ NEED TO FIX THIS
			int counter = 0;
			Node prev = tail;
			Node current = head;
			
			if ((head!=null && tail!=null) && (head.next() != head)) { //if linked list is greater than 1 element
				prev = head;
				current = prev.next();
				counter++;
				
				//find the node at the given index by iterating through linked list
				while (current != head) {
					if (counter == index) { //found it
						break;
					}
					prev = current;
					current = prev.next();
					counter++;
				}
				
				if (index > counter) {
					System.out.println("Index too large! There are only " + counter + " nodes in the linked list.");
					return;
				} else { //insert node
					node.setNext(current);
					prev.setNext(node);
				}
			} else { //if linked list is empty or 1 element
				System.out.println("Index too large! There are only " + counter + " nodes in the linked list.");
			}
		}
		return;
	}
	
	/**
	* Prints the entire linked list: O(n)
	*
	* @param none
	* @return none
	* @throws NullPointerException
	*/
	public void display() {
		//System.out.println("i'm in display");
		Node printNode = head;
		
		if (printNode != null) { //only display if the linked list is not empty
			while(printNode != tail) {
				System.out.print(printNode.getData() + ", ");
				printNode = printNode.next();
			}
			System.out.println(printNode.getData()); //last node
			//System.out.println(" head is " + head.getData() + ", tail is " + tail.getData());
		} else {
			System.out.println("No nodes to display :/");
		}
	}
}


/** NODE CLASS FOR SINGLY LINKED LIST */
/**
class Node {
	//node constructor
	public int data;
	public Node next;
	
	public Node(int nodeData) {
		data = nodeData;
		next = null;
	}
*/
