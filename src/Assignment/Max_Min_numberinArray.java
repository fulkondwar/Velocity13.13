package Assignment;

public class Max_Min_numberinArray {
   public static void main(String[] args) {
	
	   int arr [] = {10,15,6,78,52,34,63};
   	   
	   int max=arr[0];
	   int min=arr[0];
	   
	   for(int i=1;i<arr.length;i++)
	   {
		   if(arr[i]>max)
		   {
			   max=arr[i];
		   }
		   if(arr[i]<min)
		   {
			   min=arr[i];
		   }
	   }
	   System.out.println("maximum number ="+ max);
	   System.out.println("Minimun number ="+ min);
}
}
