package String;

public class StringMethod {

	public static void main(String[] args) {
		String s="Welcome";
		String s1=" To java";
		
		System.out.println(s.length());//count number of character in string
		
		System.out.println(s.concat(s1));//joining two string
		
		String s3="  welcome  ";
		System.out.println("Before trimming :"+s3);
		System.out.println("After trimming :"+s3.trim()); // Remove space starting and ending
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.contains("Wel")); // it retuen the boolean value
		
		System.out.println(s.equals("Welcome")); // True
		System.out.println(s.equals("welcome")); // False
		
		System.out.println(s.equalsIgnoreCase("Welcome")); //true
		System.out.println(s.equalsIgnoreCase("welcome")); //true
		
		System.out.println(s.replace('e', 'p'));
		System.out.println(s1.replace("java", "selenium"));
		
		System.out.println(s.substring(0, 4));
		

	}

}
