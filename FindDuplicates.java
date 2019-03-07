/**
* How do you find the duplicate number on a given
* integer array?
*
* @version 1.0
* 
*/
import java.util.HashMap;

public class FindDuplicates{
	
	/**
	* O(n)
	*
	* loop through array and put elements in hashtable as keys, if that key is already in the table
	* it is a duplicate
	* @param array from which to find duplicates
	*/
    public static void findDup(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        if(array.length<2) {
            System.out.println("Array is too small for duplicates!");
            return;
        }
        
        for (int item : array) {
            if (!map.containsKey(item)) {
                map.put(item,1);
            } else {
                System.out.println("The duplicate is " + item);
                return;
            }
        }
     System.out.println("No duplicates!");   
    }


     public static void main(String []args){
        int[] array = {};
        
        findDup(array);
     }
}