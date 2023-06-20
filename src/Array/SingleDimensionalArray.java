package Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int a[]=new int[5]; //declare array with size 5
		
		//inserting the values
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Declare an array without specifying size
		int b[]= {10,20,30,40,50};
		System.out.println(b.length); //print size of array
		
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+",");
		
		}
		System.out.println("-------------------");
		// Read the data using Enhanced/for each loop
		for(int j:b)
		{
			System.out.print(j+",");
		}

	}

}
