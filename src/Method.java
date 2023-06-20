
public class Method {
	int x=10;
	int y=20;
	
	//Case 1=not taking parameter and also not any return value
	void sum() 
	{
		System.out.println(x+y);
	}
	//Case 2=not taking parameter but return value
	int sum1()
	{
		return(x+y);
	}
	//Case 3=Taking parameter but not return value
	void sum3(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		Method m=new Method();
		m.sum(); //case 1
		int add=m.sum1(); //case 2
		System.out.println(add);
		
		m.sum3(15, 25);
		
	}

}
