import java.text.DecimalFormat;
import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner 
		System.out.println("Welcome to our bank!\n");
		Scanner in = new Scanner(System.in);
		DecimalFormat decFormat = new DecimalFormat("0.00");
		boolean run =true;
		//Starting balance
		System.out.print("Please enter the starting balance: ");
		double stB = in.nextDouble();
		System.out.print("Please enter the interest percentage\n(enter with decimals ex: 5% is .05): ");
		double inP = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(stB,inP);
		BankThreshold threshold = new BankThreshold(stB,inP);
		System.out.println("Please enter your interest threshold: ");

		while (in.hasNextDouble()) {
				
				double thresholdAmount = in.nextDouble();
				threshold.interestThreshold(thresholdAmount);
				System.out.println("Your interest threshold of $"+decFormat.format(thresholdAmount)+" will be met in "+threshold.getMonths()+" months at your current rate.");
				threshold.resetMonths();
				threshold.resetBalance(stB);
				System.out.println("Please enter your interest threshold or enter 'End' to continue to the rest of the bank functions: ");
				
		}
		in.next();
		in.nextLine();



		while (run==true) {
			System.out.print("Enter '1' for Withdraw, '2' for Deposit,\n'3' to generate interest, '4' to check the balance,\n'5' to end transactions ");
			int choice = in.nextInt();
			
			
			//Withdraw
			if (choice==1) {
					System.out.print("\nPlease enter the withdraw amount: ");
					double withD = in.nextDouble();
					myBankAccount.withdraw(withD);				
			}
			
			//Deposit
			else if (choice==2) {
				System.out.print("\nPlease enter the deposit amount: ");
				double deP = in.nextDouble();
				myBankAccount.deposit(deP);
			}
			
			//Calculate Interest
			else if (choice==3) {
				myBankAccount.calcInterest();
			}
			else if (choice==4) {
				System.out.println("The current balance is $"+myBankAccount.getBalance());
			}
			//End
			else if (choice==5) {
				run=false;
			}
			System.out.println();
		}
		System.out.println("Thank you for using our bank.\nHave a nice day!");
	
	}

}
