package Array;

public class Adding_Number {

	public static void main(String[] args) {
		
		int a=123456789;
	// output = 1+2+-----+9
		int temp=0;
		int evenCount=0;
		int oddCount=0;
		
		while(a>0)
		{
			temp=a%10; // 
		//	a=a/10; // quotient 
			
			if(temp%2==0) //
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			
			}
			a=a/10; //12345678
		}
		
           System.out.println("odd number -------->"+ oddCount);
          System.out.println("even number---------->"+ evenCount);
	}

}
