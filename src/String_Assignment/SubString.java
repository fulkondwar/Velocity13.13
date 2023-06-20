package String_Assignment;

public class SubString {

	public static void main(String[] args) {
		// Input = "1234abcd";
		// Output = "abcd1234";
		
		String s="1234abcd";
		String Output=s.substring(4)+s.substring(0, 4);
		System.out.println(Output);
		

	}

}
