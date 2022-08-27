package samplePrograms;

public class FibbonacciDemo {
	
	public static void generateFibbonnaci(int stopAt) {
		int prevNum=1;
		int currentNum=2;
		int temp;
		
		System.out.println("Generating fibbonacci numbers from " + prevNum +" to " + stopAt );
		System.out.print(prevNum +" , " +currentNum);
		
		while (stopAt>=(currentNum+prevNum)) {
			temp = prevNum;
			prevNum=currentNum;
			currentNum=prevNum+temp;
			System.out.print(" , " + currentNum);
			
		}
		
		}
		
	
	public static void generateEvenNumbers(int stopAt) {
		System.out.println("\n\nGeneretion even numbers from 1 to " + stopAt);
		for (int i=0;i<=stopAt;i++) {
			//System.out.println(i +" /2 = " + (i%2) );
			if(i%2==0)
				System.out.print(" " + i);
			//else
				//System.out.println("== " +i);
				
		}
	}
	
	
	public static void generateOddNumbers(int stopAt) {
		System.out.println("\n\nGeneretion Odd numbers from 1 to " + stopAt);
		for (int i=0;i<=stopAt;i++) {
			if(i%2!=0)
				System.out.print(" "+ i);
		}
	}
	
	
	public static void generatePrimeNumbers(int stopAt) {
		for (int i=0;i<=stopAt ; i++)
		{	
			int div=2;
			for (int num=i ;num<div;i++ ) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateFibbonnaci(14);
		generateEvenNumbers(14);
		generateOddNumbers(14);
	}

}
