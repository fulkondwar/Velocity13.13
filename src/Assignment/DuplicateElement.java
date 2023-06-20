package Assignment;

public class DuplicateElement {
	
    public static void main(String[] args) {
       
    int Arr [] = {12,15,36,12,89,75,36,85};
    
    for(int i=0; i<Arr.length; i++)
    {
    	for(int j=i+1; j<Arr.length; j++)
    	{
    		if(Arr[i] == Arr[j])
    			System.out.println(Arr[i]);
    	}
    }
}
}