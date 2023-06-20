package Assignment;

public class OddEven {

	public static void main(String[] args) {

         int a [] = {1,2,3,4,5,6};
         
         System.out.println("Print the Even number");
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]%2==0)
        		 System.out.print(a[i]+" ");
         }
         System.out.println("Print the Odd number");
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]%2!=0)
        		 System.out.print(a[i]+" ");
         }


	}

}
