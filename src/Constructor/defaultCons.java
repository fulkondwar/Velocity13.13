package Constructor;

public class defaultCons {
	/* public defaultCons (){
	 *    super();  -->  constructor call must be the first statement in a constructor
	 * }

*/
	public void m1() {
		System.out.println("Default method");
	}
	
	public void division () {
		int a=51;
		int b=17;
		int div=a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) {
		defaultCons d=new defaultCons ();
		d.m1();
		d.division();
	}

}
