package String;



public class Split_Reverse {

	public static void main(String[] args) {
		
		String str = "HONEY COMB PADS FOR EXTRA CHILL";
		
		String [] abc = str.split(" ");
		
		//String A = "";
		
		for(int i=abc.length-1; i>=0; i--)
		{
			System.out.print(abc[i]+" ");
		}
		System.out.println("------------------------------------");
		
		String a="This is my school";
	//	String b="";
	String b1 []=	a.split(" ");
	for(int i=b1.length-1;i>=0;i--)
	{
		System.out.print(b1[i]+" ");
	}
		

 
	}

}
