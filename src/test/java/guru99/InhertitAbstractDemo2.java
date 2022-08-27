package guru99;

public class InhertitAbstractDemo2 extends AbstractDemo {

	public void abstractMethod() {
		System.out.println("implemented abstractMethod");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InhertitAbstractDemo2 abs2 = new InhertitAbstractDemo2();
		abs2.concreatMethod();
		abs2.abstractMethod();
	}

}
