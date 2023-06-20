package String;

public class Count_Occurance {

	public static void main(String[] args) {
		
		String str="Java programming language";
		
		int total=str.length();
		System.out.println(total); //25
		
		int remove_A=str.replaceAll("a", "").length(); // total length after removing A
		System.out.println(remove_A);
		
		int count=total - remove_A;
		System.out.println("occurance character in given String ="+count);

	}

}
