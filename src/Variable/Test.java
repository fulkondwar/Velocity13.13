package Variable;

public class Test {

	public static void main(String[] args) {
		
		// variable declaration & initialization
		// datatype varname=values;
		
		String Firstname="Rohit";
		String Lastname="Sharma";
		
		System.out.println("Firstname-->" + Firstname);
		System.out.println("Lastname-->" + Lastname);
		
		//Object creation
		// Classname objectreferance=new Classname ();
		
		Test obj=new Test();
		
		obj.Test1();
		obj.Test2();
		obj.Test3(); // static method call by Non-static way
		
		// Direct calling static method
		Test3();
		

	}
	//Types of variables
	// 1. Local variable --> Non static
	// 2. Global variable --> 1. static 2. non-static
	
	public void Test1() {
		int Number=50;  // Nonstatic local var
	//	static number=500;  Not allowed static variable into non-static method
		
		System.out.println(Number);
	}
	
	public void Test2 () {
		
		String name="Virat";
		System.out.println(name);
	//	System.out.println(Number);
	}
	
	public static void Test3 () {
		System.out.println("Demo");
	}

}
