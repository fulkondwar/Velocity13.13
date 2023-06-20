package Non_Static;

public class diffClass {
	public static void main(String[] args) {
		
		diffClass d=new diffClass ();
		d.t11();
		d.t12();
		
		sameClass d2=new sameClass ();
		d2.M1();
		d2.M2(15, 10);
		d2.M3();
	}
     public void t11() {
    	 System.out.println("Welcome to the word");
     }
     
     public void t12() {
    	 System.out.println("Good morning");
     }
}
