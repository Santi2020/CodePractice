package samplePrograms;

class StaticDemo {
	static {
		System.out.println("Executing static block");
	}
	
	
	static int age;
	String name;
	static {
		System.out.println("Inside 2nd static block static block. static valiable = " + age);
		age= 45;
		System.out.println("Itialsed static valiable" + age);
	}
		
	public void testFinalise() {
		String name1="Santoshi";
		if(name1.length()>5) {
			TryCatchDemo tc = new TryCatchDemo();
			
		}
		System.out.println("Your name is :" + name1);
			
	}

		//class Main{

		   public  static void main(String args[])throws Throwable{

			   StaticDemo p1 = new StaticDemo();
			   StaticDemo p2 = new StaticDemo();
			   //name = "";
		       p1.age = 30;
		       p2.age = 31;
		       
		       StaticDemo.age = 32;

		       System.out.println("P1\'s age is: " + p1.age);
		       System.out.println("P2\'s age is: " + p2.age);
		       
		       p1.testFinalise();
		       try {
		    	   System.out.println("before finalise"+ p1.name);
		    	   p1.finalize();
		    	   System.out.println("after finalise"+ p1.name);
		       
		       }
		       finally {
		    	   System.out.println("executing finalize ");
		       }
		   }
		}

