package Non_Static;

public class sameClass {
	public static void main(String[] args) {
		
		sameClass s1=new sameClass();
		s1.M1();
		s1.M2(1000,10);
		s1.M3();    // Static method call by object referance but showing WARNING
		
	}
   
	public void M1() {
		System.out.println("Non static method M1");
	}
	
	public void M2(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
		System.out.println("Hello");
		
	}
	
	public static void M3() {
		System.out.println("Static method call by Non-static way");
	}
	
	
	
}
