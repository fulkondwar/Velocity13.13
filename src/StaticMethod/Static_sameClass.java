package StaticMethod;

public class Static_sameClass {
	// Without Parameter
	public static void m1() {
		System.out.println("Regular method for same class--> M1");
	}

	public static void m2 () {
		System.out.println("Regular method for same class --> M2");		
	}
	
	// With Parameter
	public static void addition (int a,int b) {
		int sum=a+b;
		System.out.println(sum);		
	}
	
	public static void studentName (String sname) {
		System.out.println(sname);
	}
	
	public static void studentInfo (String name,int RollNo,char grade,float percentage) {
		System.out.println(name);
		System.out.println(RollNo);
		System.out.println(grade);
		System.out.println(percentage);
	}
	
	public static void main(String[] args)
	{
		// Call Direct method name
		m1();
		m2();
		addition(20,40);
		studentName("Narendra Modi");
		studentInfo("Sunil",120,'A',86.55f);
	}
	
	
	
}
