package Array;

public class Fibona_Series {

	public static void main(String[] args) {
		
		int n1=0,n2=1,num;
		System.out.print(n1+" "+n2);
        
		for(int i=2;i<=10;i++)
		{
		num=n1+n2;
		System.out.print(" "+num);
		n1=n2;
		n2=num;
	}
	}
}
