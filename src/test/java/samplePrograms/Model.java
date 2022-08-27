package samplePrograms;

public class Model {
	public int publicNum;
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	String name;
	final int  finalInt;
	
	{
		System.out.println("instance block publicNum =" + publicNum);
	}
	
	static
	{
		System.out.println("static block =" );
	}
	 void consume(int a,int b)  
	    {  
	        System.out.println(a+" consumed!!");  
	    }  
	 
	    static void consume(int a)  
	    {  
	        System.out.println("consumed static "+a);  
	    }  
	    
	public Model(){
		//super();
		finalInt=0;
		System.out.println("Default constructor");
		System.out.println("publicNum =" + publicNum);
		System.out.println("privateNum =" + privateNum);
		System.out.println("defaultNum =" + defaultNum);
		System.out.println("protectedNum =" + protectedNum);
		System.out.println("str =" + name);
	}
	
	public Model(int num, String str){
		this();
		int a;
		a=10;
		System.out.println("Parameterized constructor");
		this.publicNum=num;
		this.privateNum=num;
		this.defaultNum=num;
		this.protectedNum=num;
		this.name=str;
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//Model m = new Model();
		Model m1 = new Model(5, null);
		//m1.finalInt=10;
		
		final int a ;
		a=10;
		
		//int a= null;
		
    	Model m2 = new Model();
    	m2.name="name here ";
    	//System.out.println(m2.in);
    	System.out.println(m2 instanceof Model);//true  
//		//Model m3 =	(Model)m2.clone();
//		String str = null;
//		System.out.println("str =" + str);
//		//System.out.println("int a = " + a);
    	//m1.consume(10,19);
    	
    	//Comparing string with string buffer
    	String str="abc";
    	StringBuffer strBuff = new StringBuffer(str);
    	
    	System.out.println("Comparing string with stringbuffer " + str.equals(strBuff.toString()) );
    	//strBuff.append(str);
    	
    	//Comparing string with stringBuilder
    	StringBuilder strBld = new StringBuilder(str);
    	strBld.append(12345);
    	System.out.println("strBld =" + strBld);
    	System.out.println("Comparing string with stringbuilder " + str.equals(strBld.toString()) );
    	
    	
	}
	
}
