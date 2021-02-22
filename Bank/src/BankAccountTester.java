import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner 
		System.out.println("Welcome to our bank!\n");
		Scanner in = new Scanner(System.in);
		boolean run =true;
		//Starting balance
		System.out.print("Please enter the starting balance: ");
		double stB = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(stB);
		System.out.println("You successfully created an account with starting balance $"+myBankAccount.getBalance());
		System.out.println();
	
		while (run==true) {
			System.out.print("Enter '1' for Withdraw, '2' for Deposit, '3' to end the transactions: ");
			int choice = in.nextInt();
			
			
			//Withdraw
			if (choice==1) {
				System.out.print("Please enter the withdraw amount: ");
				double withD = in.nextDouble();
				myBankAccount.withdraw(withD);
				System.out.println("You successfully withdrew $"+withD+".\nYour current balance is $"+myBankAccount.getBalance());
				System.out.println();
			}
			
			//Deposit
			else if (choice==2) {
				System.out.print("Please enter the deposit amount: ");
				double deP = in.nextDouble();
				myBankAccount.deposit(deP);
				System.out.println("You successfully deposited $"+deP+".\nYour current balance is $"+myBankAccount.getBalance());
			}
			
			//End
			else if (choice==3) {
				run=false;
			}
			System.out.println();
		}
		System.out.println("Thank you for using our bank!");
		
	
		
		
		
		
		
	}

}
