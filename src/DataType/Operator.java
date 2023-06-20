package DataType;

public class Operator {

	public static void main(String[] args) {
	int a=10;   //Operator contain symbol which is used to perform certain action
	int b=20;
	
	 //Arithmetic operator -->  + - *  / %
	System.out.println("----------------Arithmetic Operator------------------");
	System.out.println("sum of a and b :"+(a+b));
	System.out.println("diff of a and b :"+(a-b));
	System.out.println("Multiplication of a and b :"+(a*b));
	System.out.println("Division of a and b :"+(a/b));
	System.out.println("Mod div of a and b :"+(a%b));
	
	//Relational operator(comparision operator) --> == > < <= >= != 
	//Always return boollean value
	System.out.println("----------------Relational Operator------------------");
	System.out.println(a==b); //False
	System.out.println(a>b);  //False
	System.out.println(a<b);  //True
	System.out.println(a>=b); //False
	System.out.println(a<=b); //True
	System.out.println(a!=b); //True
	
	//Logical operator   && || !
	//Works between boolean
	boolean x=true;
	boolean y=false;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("----------------Logical Operator------------------");
	System.out.println(x && y); //false
	System.out.println(x || y); //true
	System.out.println(!x);     //false
	
	//Increment or decrement operator
	System.out.println("----------------Increment/Decrement Operator------------------");
	a=10;
	a++;  //a=a+1;
	System.out.println(a);
	
	b=20;
	b--; //b=b-1;
	System.out.println(b);
	
	}

}
