package samplePrograms;

//For a given array of size N, write a code to print the reverse of the array

public class ReverseArray {
	
	char[] charArray={'a','b','c','d','e'};
	int[] intArray= {9,8,7,6,5,4,3,2,1};
	boolean[] boolArray;
	
	public void Reversechar() {
		int len = charArray.length;
		char[] revCharArray = new char[len];
		int idx =0;
		for (int i = len-1; i>=0 ; i--)
		{
			revCharArray[idx]=charArray[i];
			idx=idx+1;
			//System.out.println("value of i " + i);
		}
	
		//System.out.println("To string = "+ revCharArray.toString());
		
		
        System.out.print("Original Character array is " );
		dispCharArray(charArray);
		System.out.println("\n\nReverese of character array is " );
		dispCharArray(revCharArray);	
	}
	
	
	public void ReverseInt() {
		int len = intArray.length;
		int[] revIntArray = new int[len];
		int idx =0;
		for (int i = len-1; i>=0 ; i--)
		{
			revIntArray[idx]=intArray[i];
			idx=idx+1;
			//System.out.println("value of i " + i);
		}
	
		//System.out.println("To string = "+ revCharArray.toString());
		
		
        System.out.print("Original integer array is " );
		dispIntArray(intArray);
		System.out.println("\n\nReverese of integer array is " );
		dispIntArray(revIntArray);
		
		
	}
	
	
	public void dispCharArray(char[] arr) {
		for (int i =0; i<arr.length ; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
	
	public void dispIntArray(int[] arr) {
		for (int i =0; i<arr.length ; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray rev = new ReverseArray();
		rev.Reversechar();
		rev.ReverseInt();
	}

}
