/**
* How do you find the sum of two linked lists using Stack?
*
* @version 1.0
*/

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.lang.Math;

public class LinkedListStackSum {

	/**
	* O(n)
	*
	* Summary:  Iterate through both given lists and add all nodes to stack. Pop each element off of stack and add to a sum variable until all
	*			elements popped
	*			
	* @param list1 the first list with elements to add using stack
	* @param list2 the second list with elements to add using stack
	* @return sum the sum of all node data from list1 and list2
	*/
	public static int sum(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		int totalSum=0;
		Stack<Integer> stack = new Stack<>();
		
		//push all elements from both lists onto the stack
		int counter=0; //keeps track of how many equal elements are in both lists
		while (list1.size()!=0 || list2.size()!=0) { //while neither list is empty
			if(biggerList(list1,list2)==null) { //if same size
				stack.push(list1.removeFirst());
				stack.push(list2.removeFirst());
				counter++;
			} else {
				stack.push(biggerList(list1,list2).removeFirst());
			}
		}
		
		/** pop off all elements and add together */
		boolean carry=false; //keeps track of if you need to carry the 1
		int digitPos = 0; //signifies which digit position we are at
		int digit1 = 0;
		int digit2 = 0;
		int tempSum = 0;
		while(!stack.empty()) {
			if (counter!=0) { //pop off and add all digits of same position
				counter--;
				digit1 = stack.pop();
				digit2 = stack.pop();
				tempSum = digit1 + digit2;				
			} else { //pop off remaining
				tempSum=stack.pop();
			}
			
			if (carry==true) tempSum++; //add the carried 1 if true
			
			if (tempSum>=10) {  //determine if you need to carry the 1
				carry=true;
				tempSum-=10;
			} else carry=false;
			
			totalSum+=Math.pow(10,digitPos)*tempSum;
			digitPos++;
		}
		return totalSum;
	}
	
	public static LinkedList<Integer> biggerList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		if(list1.size()>list2.size()) {
			return list1;
		} else if (list1.size()<list2.size()) {
			return list2;
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		/**
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(9);
		list1.add(1);
		list1.add(3);
		list1.add(9);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(7);
		list2.add(8);
		*/
		/**
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(7);
		list2.add(8);
		*/
		
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(1);
		list1.add(3);
		list1.add(9);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(9);
		list2.add(9);
		list2.add(9);
		
		
		//System.out.println(list1);
		//System.out.println(list2);
		System.out.println("total sum: " + sum(list1,list2));
	}
}