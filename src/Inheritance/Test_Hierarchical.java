package Inheritance;

public class Test_Hierarchical {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Properties of son 1--------------");
		Hierarchical_son1 s1=new Hierarchical_son1 ();
		s1.bike();
		s1.car();
		s1.money();
		s1.m2();
		s1.shop();
		
		System.out.println("----------------Properties of son 2-----------------");
		Hierarchical_son2 s2=new Hierarchical_son2 ();
		s2.bike();
		s2.car();
		s2.money();
		s2.location();
		s2.school();
	}

}
