package Assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		
	//	int A []= {13,15,24,17};
		int num=11;
		int temp=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i ==0)
			{
				temp=temp+1;
			}
		}
		  if(temp == 0)
		  {
			  System.out.println("The number is prime");
		  }
		  else
		  {
			  System.out.println("The number is not prime");
		  }
		
		
	}

}
