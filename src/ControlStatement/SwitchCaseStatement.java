package ControlStatement;

public class SwitchCaseStatement {
  //switch case is used to check tne number of condition
	public static void main(String[] args) {
		int day=5;
		switch(day)
	{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wenesday");break;
		case 5: System.out.println("Thrusday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default: System.out.println("Invalid day");
	}

 }

}
