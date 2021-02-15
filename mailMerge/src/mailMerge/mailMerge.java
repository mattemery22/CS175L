package mailMerge;
import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating scanner
		Scanner in = new Scanner (System.in);
		
		//getting info from user
		String promptText1="Please enter your first name: ";
		System.out.print(promptText1);
		String firstName = in.nextLine();
		
		String promptText2="Please enter your last name: ";
		System.out.print(promptText2);
		String lastName = in.nextLine();
		
		String promptText3="Please enter your house number: ";
		System.out.print(promptText3);
		String houseNumber = in.nextLine();
		
		String promptText4="Please enter your street: ";
		System.out.print(promptText4);
		String street = in.nextLine();
		
		
		
		//entering user info into text
		String replaceText1 = "Dear "+firstName+" "+lastName+",";
		String replaceText2 = "Please confirm that your address is " + houseNumber + " "+street+".";
		
		//outputting text with user info
		System.out.println();
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		
		//confirming info with user
		String promptText5="Is this address correct? ";
		System.out.print(promptText5);
		String yesNo = in.nextLine();
		String replaceText3 = "Your answer is: " + yesNo + " Goodbye!";
		
		//ending program
		System.out.println(replaceText3);
		
	}

}
