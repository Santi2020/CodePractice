package samplePrograms;


public class TryCatchDemo {  
	  
    public static void main(String[] args) throws Exception {  
    	TryCatchDemo tc = new TryCatchDemo();
    	String result = tc.tryCatchDemo();
    	System.out.println("rest of the code.. result  = " + result );
    }  
      
    public String tryCatchDemo() throws Exception {
    	try  
        {  
        int data=50/0; //may throw exception   
        return "Success" ;
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(Exception e)  
        {  
        	
        	System.out.println("Catch block 1");
        	System.out.println(e);  
        	System.out.println("Catch block 2");
        	return "error";
        }
        finally {
        	System.out.println("Finally block");
        }
        
    }
    
    protected void finalize() throws Throwable{
    //protected void finalize() {
    	System.out.println("Garbage collecting");
    	super.finalize();
    }
    
}  