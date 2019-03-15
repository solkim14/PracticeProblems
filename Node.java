//Node class

public class Node {
	private int data;
	private Node next;
	/** CONSTRUCTORS */
	public Node() {} //given no data
	public Node(int d) { //given data
		this.data = d;
	}
	/** FUNCTIONS */
	public int getData() {return data;}
	public Node next() {return next;}
	public void setData(int d) {data=d;}
	public void setNext(Node n) {next=n;}
}