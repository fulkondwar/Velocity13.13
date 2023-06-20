package Variable;

public class GlobalVar {

// ststic global variable
	
	static int Number=50;   // static global variable
	static String name="Java";
	
	String sname="Rohit Sharma";
	

	public static void main(String[] args) {
		 
		int number=500;  // static global var
		GlobalVar.demo();
		System.out.println(name);

}
	public static void demo() {
		int RRR=30;  // NON local variable
		System.out.println(Number); // 50
		System.out.println(name);   // Java
		
		GlobalVar GV=new GlobalVar ();
		
		System.out.println(GV.sname);
	}

}
