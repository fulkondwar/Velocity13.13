package StaticMethod;

public class Method {
	
	// main method overries by passing different parameter
	public static void main(String[] args) {
		System.out.println("main method running");
		
		main("sunil");
		main(10,15);
	}
	
	public static void main(String sname) {
		System.out.println(sname);
	}
	
	public static void main(int a,int b) {
		int add=a+b;
		System.out.println(add);
		
	}

}
