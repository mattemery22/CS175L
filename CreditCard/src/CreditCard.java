
import java.util.Scanner;
public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while (run) {
			
			System.out.println("Please enter a credit card number\n or 'End' to end the program: ");
			Scanner in = new Scanner (System.in);
			String number = in.nextLine();
			if (number.equalsIgnoreCase("end")){
				run=false;
				System.out.println("Goodbye!");
			}
			else {
				number=number.replaceAll(" ","");
				number=number.replaceAll("-", "");
				System.out.println(number);
			}
			
		}
	}

}
