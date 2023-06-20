package String;

public class Reverse_String {

	public static void main(String[] args) {
		
		String Str = "Sunil Fulkondwar";
		
		String str = "";
		
		for(int i=Str.length()-1;i>=0;i--)
		{
			str = str + Str.charAt(i);
		}
		System.out.println(str);

	}

}
