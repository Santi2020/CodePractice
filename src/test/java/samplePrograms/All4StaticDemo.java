package samplePrograms;

class Test{
	   //Static variable
	   static int i;

	   static int j;
	   //Multiple Static Blocks
	   static{
	       System.out.println("Initializing the value of i");
	       i = 20;
	   }

	   static{
	       System.out.println("Initializing the value of j");
	       j = i * 30;
	   }

	   //Static Method

	   public static void display(){
	       System.out.println("The value of i is: " + i);
	       System.out.println("The value of j is: " + j);
	   }

	   //Static Nested Class

	   static class NestedTest{
	       public void changer(){
	           i = i + 10;
	           j = j + 10;
	           System.out.println("The updated value of i is: " + i);
	           System.out.println("The updated value of j is: " + j);
	       }
	   }
	}

	 class All4StaticDemo{
	   public static void main(String args[]){
	       Test.display();
	       Test.NestedTest t = new Test.NestedTest();
	       t.changer();
	   }
	}