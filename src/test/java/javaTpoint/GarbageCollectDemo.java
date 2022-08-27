package javaTpoint;

public class GarbageCollectDemo {
	//public class TestGarbage1{  
	public void finalize(){
		System.out.println("object is garbage collected");
	}  
	public static void main(String args[]){  
		//GarbaGarbageCollectDemo
		
		GarbageCollectDemo s1=new GarbageCollectDemo();  
		GarbageCollectDemo s2=new GarbageCollectDemo();  
		s2=null;  
		
		//s1=null;  
		//s2=null;  
		//System.gc();
		System.out.println("More code to execute");
		s1=null;
		System.gc();  
	}  
}  

