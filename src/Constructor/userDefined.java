package Constructor;

public class userDefined {
	
	// Variable Declaration
	float displacement;
	float time;
	int num1;
	int num2;
	
	// Variable initilization
	userDefined (){            // without parameter
		displacement=503;
		time=40;
	}
	
	userDefined (int a,int b){  // with parameter
		num1=a;
		num2=b;
	}
    
	// Usages
	public void velocity() {
		float velo=displacement/time;
		System.out.println(velo);
	}
	
	public void addition () {
		float add=displacement+time;
		System.out.println(add);
	}
	
	public void multiplication () {
		int mul=num1*num2;
		System.out.println(mul);
		
	}
}
