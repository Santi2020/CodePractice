package samplePrograms;

import java.util.*;

public class CovertSetToList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> set1 = new HashSet<String>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.add("six");
		set1.add("seven");
		set1.add("eight");
		set1.add("one");
		System.out.println("Set = " + set1);
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			System.out.println("Iterating .." + it.next());
		}
		
		ArrayList<String> lst = new ArrayList<String>(set1);
		System.out.println("Set to arrayList = " + lst);
		
		Collections.sort(lst);
		System.out.println("After sorting arraylist = " + lst);
	}

}
