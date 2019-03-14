/**
* Singly Linked List implementation (NOT circular)
* 
* @version 1.0
*/

public class SinglyLinkedList {
	private Node head;
	
	/** CONSTRUCTORS */
	public SinglyLinkedList() {
	}
	
	public SinglyLinkedList(Node n) {
		head=n;
	}
	
	/**** FUNCTIONS ****/
	/**
	* Inserts given node at the beginning of the list
	* @param node node to add to the beginning of the list
	*/
	public void addFirst(Node node) {
		System.out.println("Inserting!");
		if(head==null) {
			System.out.println("Linked list empty! inserting first :-)");
			head=node;
		} else {
			System.out.println("Adding element to beginning of list!");
			node.setNext(head);
			head=node;
		}
	}
	
	/**
	* Adds given Node at the end of the list	
	* @param node node to add to the end of the list
	*/
	public void addLast(Node node) {
		if(head==null) {
			System.out.println("Linked list empty! inserting at head :-)");
			head=node;
		} else {
			System.out.println("inserting linked list at the end :-)");
			Node current=head;
			while(current.getNext() != null) {
				System.out.println("while");
				current=current.getNext();	
			}
			current.setNext(node);
		}
	}
	
	/**
	* Adds element after given index; If less than 0, will insert at beginning;
	* If greater than last index will insrt at end		
	* @param 
	* @return 
	*/
	public void add(Node node) {
		if(head==null) {
			System.out.println("Linked list empty! inserting at head :-)");
			head=node;
		} else {

		}
	}
	
	/**
	* Removes the first element of the list		
	* @param 
	* @return 
	*/
	public void removeFirst() {
		//solution logic
	}
	
	/**
	*			
	* @param 
	* @return 
	*/
	public void removeLast() {
		//solution logic
	}
	
	/**
	*			
	* @param 
	* @return 
	*/
	public void remove() {
		//solution logic
	}
	
	/**
	* Returns the first node of the Linked List		
	* @return head the first node
	*/
	public Node getFirst() {return head;}
	
	/**
	*			
	* @param 
	* @return 
	*/
	public void get() {
		//solution logic
	}
	
	/**
	*			
	* @param 
	* @return 
	*/
	public void traverse() {
		//solution logic
	}
	
	/**
	*			
	* @param 
	* @return 
	*/
	public void search() {
		//solution logic
	}

	/**** NODE INNER CLASS ****/
	private static class Node {
		private int data;
		private Node next;
		
		/** CONSTRUCTORS */
		public Node() {} //given no data
		
		public Node(int d) { //given data
			data = d;
		}
		
		/** FUNCTIONS */
		public int getData() {return data;}
		public Node getNext() {return next;}
		public void setData(int d) {data=d;}
		public void setNext(Node n) {next=n;}
	}
	
	//tests
	public static void main(String[] args) {
		/**
		Node node = new Node(5,new Node(17));
		System.out.println(node.getData());
		System.out.println(node.getNext());
		
		node.setData(4);
		node.setNext(new Node(5));
		System.out.println(node.getData());
		System.out.println(node.getNext());
		System.out.println(node.getNext().getData());
		*/
		
		SinglyLinkedList list = new SinglyLinkedList();
		//SinglyLinkedList list = new SinglyLinkedList(new Node(5));
		list.addLast(new Node(1));
		
		list.addFirst(new Node(43));
		Node current = list.getFirst();
		
		System.out.println("current:" + current.getData() + " next:" + current.getNext().getData());
		list.addLast(new Node(-7));
		System.out.println("current:" + current.getData() + " next:" + current.getNext().getData() + " nextnext:" + current.getNext().getNext().getData());
		
	}
}