package Constructor;

public class userDefined1 {
	// Varible Declaration
	int speed;
	int time;
	
	// Variable Initualization
	userDefined1 (){
		speed=40;
		time=10;
	}
	
	// Usages
	public void dist() {
		int distance=speed*time;
		System.out.println(distance);
	}
	
	public static void main(String[] args) {
		
		userDefined u00=new userDefined ();
		u00.addition();
		u00.velocity();
		
		userDefined u01=new userDefined (12,12);
		u01.multiplication();
		
		userDefined1 u11=new userDefined1 ();
		u11.dist();
		
	}

}
