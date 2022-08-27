package javaTpoint;

public class FinalizeTest {  
    int j=12;  
    public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	void add()  
    {  
        j=j+12;  
        System.out.println("J="+j);  
    }  
    public void finalize()  
    {  
        System.out.println("Object is garbage collected");  
    }  
    public static void main(String[] args) {  
        new FinalizeTest().add();  
        new FinalizeTest().getJ();
        System.gc();  
        new FinalizeTest().add(); 
        new FinalizeTest().getJ();
    }  
}  