package samplePrograms;

import java.util.concurrent.atomic.AtomicIntegerArray;

//For a given array A, write a code to delete the duplicate elements in the array

public class DeleteDupEleFromArray {
	//int[] intArray= {10,4,10,1,4,10};
	int[] intArray= {3,4,3,2,5};
	
	
	public void deleteDuplicateElement() {
		int len = intArray.length;
		int[] newArray = new int[len];
		boolean dupFound =false;
		newArray[0]=intArray[0];
		int newIdx=1;
		for (int i =1; i<intArray.length; i++) {
			for (int j=0; j <newArray.length; j++) {
				System.out.println("Comparing " + intArray[i] + "==" + intArray[j]);
				if (intArray[i]==newArray[j]) {
					System.out.println("Duplicate found");
					dupFound=true;
					continue; 
				}
			}
			
			if (!dupFound) {
				//System.out.println("adding");	
				System.out.println("Adding " + intArray[i] + " at index " + newIdx);
				
				newArray[newIdx]=intArray[i];
				newIdx= newIdx+1;
				dupFound =false;
			}
		}
		System.out.println("Original Array" );
		
		for (int i =0; i<intArray.length; i++) {
			System.out.print("  "+ intArray[i]);
		}
		
		
		System.out.println("After depuplication Array" );
		for (int i =0; i<newArray.length; i++) {
			System.out.print("  "+ newArray[i]);
		}
		
	}
	
//	public void deleteDuplicateElement_old() {
//		int len = intArray.length;
//		int[] newArray = new int[len];
//		boolean dupFound =false;
//		newArray[0]=intArray[0];
//		int newIdx=1;
//		for (int i =1; i<intArray.length; i++) {
//			for (int j=i+1; j <intArray.length; j++) {
//				System.out.println("Comparing " + intArray[i] + "==" + intArray[j]);
//				if (intArray[i]==intArray[j]) {
//					//System.out.println("shipping this iterarion");
//					dupFound=true;
//					continue; 
//				}
//			}
//			if (!dupFound) {
//				//System.out.println("adding");
//				newArray[newIdx]=intArray[i];
//				newIdx= newIdx+1;
//				dupFound =false;
//			}
//		}
//		
//		System.out.println("Original Array" );
//		
//		for (int i =0; i<intArray.length; i++) {
//			System.out.print("  "+ intArray[i]);
//		}
//		
//		
//		System.out.println("After depuplication Array" );
//		for (int i =0; i<newArray.length; i++) {
//			System.out.print("  "+ newArray[i]);
//		}
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteDupEleFromArray dd = new DeleteDupEleFromArray();
		dd.deleteDuplicateElement();
	}

}
