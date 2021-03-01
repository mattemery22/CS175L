/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
	//instance variable
   private double balance;
   private double interestPercent;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double sB,double i)
   {
      balance = sB;
      interestPercent=i;
      System.out.println("	Created an account with starting balance $"+balance+" \n	and an interest rate of "+interestPercent);
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
      System.out.println("	You successfully deposited $"+amount+".\n	Your current balance is $"+balance);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
     
      if (balance-amount>=0) {
    	    balance = balance - amount;
			System.out.println("	You successfully withdrew $"+amount+".\n	Your current balance is $"+balance);
			System.out.println();
		}
		else {
			System.out.println("	Insufficient funds to support withdrawl");					}
   }
   
   //calculate interest
   public void calcInterest(){
	   double interestAmount = balance*interestPercent;
	   balance = balance+interestAmount;
	   System.out.println("	  Interest generated: $"+interestAmount);
	   System.out.println("	  New Balance: $"+balance);
	   
	   
   }

   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
   
}
