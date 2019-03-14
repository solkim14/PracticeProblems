/**
* Singly Linked List implementation (NOT circular)
* 
* @version 1.0
*/

public class SinglyLinkedList {
	private Node head;
	
	/** CONSTRUCTORS */
	public SinglyLinkedList() {
		head=new Node();
	}
	
	public SinglyLinkedList(Node n) {
		head=n;
	}
	
	/**** FUNCTIONS ****/
	/**
	* Inserts given element at the beginning of the list
	* @param 
	* @return 
	*/
	public void insertFirst(Node n) {
		if(head==null) {
			head=n;
		} else {
			n.setNext(head);
			head=n;
		}
	}
	
	/**
	* Inserts given element at the end of the list	
	* @param 
	* @return 
	*/
	public void insertLast() {
		//solution logic
	}
	
	/**
	* Inserts element at given index; If less than 0, will insert at beginning;
	* If greater than last index will insrt at end		
	* @param 
	* @return 
	*/
	public void insert() {
		//solution logic
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
		
		public Node(Node n){ //given next node
			next = n;
		}
		
		public Node(int d, Node n) { //given data and next node
			data=d;
			next=n;
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
		SinglyLinkedList listWData = new SinglyLinkedList(new Node(5));
		System.out.println(listWData.getFirst().getData());
	}
}