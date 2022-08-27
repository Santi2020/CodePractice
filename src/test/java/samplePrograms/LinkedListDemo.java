package samplePrograms;
import java.util.*;

public class LinkedListDemo {	
	       public static void main(String[] args) {
	        //create a LinkedList object and initialize it with Array elements converted to list
	            //LinkedList<Integer> intList = new LinkedList(Arrays.asList(10,20,30,40,50));
	            //print the LinkedList just created
	            //System.out.println("Contents of first LinkedList: " + intList);
	    	   	List<String> lst = new ArrayList();
	            //create an empty list
	            lst.add("1 new");
	            lst.add("2 new");
	    	   	
	    	   	LinkedList<String> colorsList = new LinkedList();
	            //add elements to the linkedList using add method.
	            colorsList.add("one");
	         colorsList.add("two");
	            colorsList.add("three");
	            colorsList.add("four");
	            colorsList.add("five");
	            System.out.println("\nContents of second LinkedList: " + colorsList);
//	            colorsList.add(null)d
//	            colorsList.addAll(colorsList)
//	            colorsList.addFirst(null);d
//	            colorsList.addLast(null);
//	            colorsList.clear();
//	            colorsList.contains(colorsList)
//	            colorsList.getFirst()
//	            colorsList.indexOf(colorsList)
//	            colorsList.isEmpty()
//	            colorsList.pop()
	            String s = colorsList.get(2);
	            System.out.println("S= " + s);
	            colorsList.peekLast();
	            colorsList.pop();
	         // print the LinkedList
	            System.out.println("\nAfter pop LinkedList: " + colorsList);
	            
	            System.out.println("\nSize of LinkedList: " +colorsList.size());
	            colorsList.addAll(3, lst);
	            System.out.println("After adding new elements :"  + colorsList);
	            System.out.println("\nAfter adding new elements Size of LinkedList: " +colorsList.size());
	     
	            colorsList.remove(2)	;
	            System.out.println("After removing  elements :"  + colorsList);
	            
	            
	            Collections.sort(colorsList);
	            System.out.println("After sorting  elements :"  + colorsList);
	            
	            
	    
	}
}
