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
		this.head=n;
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
			node.setNext(null);
		} else {
			System.out.println("Adding element to beginning of list!");
			node.setNext(head);
			head=node;
		}
	}
	
	public void setHead(Node n) {
		head=n;
	}
	
	/**
	* Adds given Node at the end of the list	
	* @param node node to add to the end of the list
	*/
	public void addLast(Node node) {
		if(head==null) {
			//System.out.println("Linked list empty! inserting at head :-)");
			head=node;
		} else {
			//System.out.println("inserting linked list at the end :-)");
			Node current=head;
			while(current.next() != null) {
				//System.out.println("while");
				current=current.next();	
			}
			current.setNext(node);
		}
	}
	
	/**
	* Adds element after given index; If less than 0, will insert at beginning;
	* If greater than last index will insert at end		
	* @param node node to add to the list
	* @param index the index 
	* @return 
	*/
	public void add(Node node, int index) {
		Node current=head;
			
		if(head==null) { //if list is empty
			System.out.println("Linked list empty! inserting at head :-)");
			head=node;
		} else if(index<=0) { //if index is 0 or negative, insert at the head
			System.out.println("here we at");
			System.out.println(head.getData());
			node.setNext(head);
			System.out.println(node.getData());
			System.out.println(node.next().getData());
			head=node;
			System.out.println(head.getData());
			System.out.println(node.next().getData());
		} else {
			for (int i=0; i<index; i++) {
				if(current.next()==null) { //if index >= last element index insert at end
					current.setNext(node);
					return;
				}
				current=current.next();
			}
			//insert node here
			node.setNext(current.next());
			current.setNext(node);
		}
	}
	
	/**
	* Removes the first element of the list		
	* @param 
	* @return 
	*/
	public Node removeFirst() {
		System.out.println("Removing!");
		Node removed=null;
		if(head==null) { //empty
			System.out.println("Linked list empty! Nothing to remove");
		} else if (head.next()==null) { //only one element
			removed=head;
			head=null;
		} else {
			removed=head;
			head=head.next();
		}
		return removed;
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
	public Node remove(Node node) {
		Node removed = null;
		System.out.println("Removing!");
		if(head==null) { //empty
			System.out.println("Linked list empty! Nothing to remove");
		} else if (head.next()==null) { //only one element
			head=null;
		} else if (node==head) {
			head=head.next();
		} else {
			Node prev=head;
			Node next=node.next();
			while(prev.getData()!=node.getData()) {
				System.out.println(prev.getData());
				prev=prev.next();
				if (prev.getData()!=node.getData()) {
					break;
				}
			}
			prev.setNext(next);
			removed=prev;
		}
		return removed;
	}
	
	/**
	* Returns the first node of the Linked List		
	* @return head the first node
	*/
	//public Node getLast() {return head;}
	
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
	* Prints the entire linked list: O(n)
	*
	* @param none
	* @return none
	* @throws NullPointerException
	*/
	public void display() {
		Node printNode = head;
		
		if (printNode != null) { //only display if the linked list is not empty
			while(printNode.next() != null) {
				System.out.print(printNode.getData() + ", ");
				printNode = printNode.next();
			}
			System.out.println(printNode.getData()); //last node
			//System.out.println(" head is " + head.getData() + ", tail is " + tail.getData());
		} else {
			System.out.println("No nodes to display :/");
		}
	}

	/**
	//tests
	public static void main(String[] args) {
	
		Node node = new Node(5,new Node(17));
		System.out.println(node.next());
		System.out.println(node.next());
		
		node.setData(4);
		node.setNext(new Node(5));
		System.out.println(node.next());
		System.out.println(node.next());
		System.out.println(node.next().getData());
		
		SinglyLinkedList list = new SinglyLinkedList();
		//SinglyLinkedList list = new SinglyLinkedList(new Node(5));
		list.addLast(new Node(1));
		
		list.addFirst(new Node(43));
		Node current = list.getFirst();
		
		System.out.println("current:" + current.getData() + " next:" + current.next().getData());
		list.addLast(new Node(-7));
		System.out.println("current:" + current.getData() + " next:" + current.next().getData() + " nextnext:" + current.next().next().getData());
		list.add(new Node(2),-4);
		
		current = list.getFirst();
		System.out.println("current:" + current.getData() + " next:" + current.next().getData() + " nextnext:" + current.next().next().getData());
		//System.out.println(current.getData() + " " + current.next().getData() + " " + current.next().next().getData() + " " + current.next().next().next().getData());
	}
	*/
}