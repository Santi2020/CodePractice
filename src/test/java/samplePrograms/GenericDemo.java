package samplePrograms;

public class GenericDemo {
	public static void main1(String a[]){
		
		
		//GenericDemo gen = new GenericDemo();
		//gen.switchCaseDemo();
	}
	
	public static void main(String[] args) {
		System.out.println("Length of args=" + args.length);
		
		int num;
		String name = new String();
		//System.out.println("num = " + num);
		System.out.println("name = " + name);
	}

	/**
	 * 
	 */
	public static void switchCaseDemo() {
		int price = 6;
		switch (price) {
			default: System.out.println("It is: default");
			break;
			case 2: System.out.println("It is: 2");
			break;
			case 5: System.out.println("It is: 5");
			break;
			case 9: System.out.println("It is: 9");
			
		}
	}
}
