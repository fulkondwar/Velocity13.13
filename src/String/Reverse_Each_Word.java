package String;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		
		String str = "Welcome To Java";
		
		String [] Words = str.split(" "); // spliting strings into words
		
		String reverse = "";
		
		for(int i=0;i<Words.length;i++)
		{
			String word = Words[i];
			String revWord = "";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				revWord = revWord + word.charAt(j); //emocleW
			}
			reverse = reverse + revWord + " ";
		}
         System.out.println(reverse);
	}

}
