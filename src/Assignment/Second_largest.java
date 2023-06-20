package Assignment;

public class Second_largest {

	public static void main(String[] args) {
		
		int A []= {2,5,10,13,25,45,87,32};
		int temp;
	    
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		  System.out.println("Second larget number -->"+A[A.length-2]);
		

	}

}
