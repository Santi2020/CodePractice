package guru99;

public abstract class AbstractDemo {

	int a;
	public int num;
	
	public abstract void abstractMethod();
	
	
	public void concreatMethod() {
		System.out.println("Concrete method ");
		a=10;
		num =100;
	}
	
}
