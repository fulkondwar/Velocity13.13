package Assignment;

public class Swapping_Two_Number {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//Swapping the number using third variable
	/*	int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);*/
		
		a=a+b; //a=10+20=30
		b=a-b;// b=30-20=10
		a=a-b; //a=30-10=20
		System.out.println(a);
		System.out.println(b);

	}

}
