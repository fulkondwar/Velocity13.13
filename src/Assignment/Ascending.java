package Assignment;

public class Ascending {
	public static void main(String[] args) {
		
		int A [] = {42,36,12,78,16,3,56};
		int temp;
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i] > A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
			System.out.print(" " + A[i]);
		}
		 System.out.println("Second larget number -->"+A[A.length-2]);
	}

}
