package StaticMethod;

public class Static_diffClass {
	public static void main(String[] args) {
		
		Static_sameClass.m1();
		Static_sameClass.m2();
		Static_sameClass.studentInfo("Arjun Das", 12, 'B', 65.32f);
		Static_sameClass.studentName("Rahul Malhotra");
		System.out.println("-----------------------------------");
		m3();
		mul(10,20);
		
		
		
	}
	
	public static void m3() {
		System.out.println("M3 method for same class");
	}
	
    public static void mul(int a,int b) {
    	int multiplication=a*b;
    }
}
