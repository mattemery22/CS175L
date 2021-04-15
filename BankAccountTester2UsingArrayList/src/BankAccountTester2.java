import java.util.*;

public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount gil = new BankAccount("Gil",500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);
		
		ArrayList<BankAccount> accountList= new ArrayList<>();
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		

		for(BankAccount index : accountList)
		{
			System.out.println(index.getAccount());
			
		}
		
		accountList.add(sally);
		System.out.println("\nAccount Added: "+sally.getAccount());

		double highestBalance=accountList.get(0).getBalance();
		double currentBalance=0;
		String highestAccountInfo="";
		for(BankAccount index : accountList)
		{
			currentBalance=index.getBalance();
			if (currentBalance>highestBalance)
			{
				highestBalance=currentBalance;
				highestAccountInfo=index.getAccount();
			}
			
		}
		System.out.println("\nHighest Balance Account Info: ");
		System.out.println(highestAccountInfo+"\n");
		
		System.out.println("Account Removed: "+sally.getAccount()+"\n");
		accountList.remove(sally);
		
		highestBalance=accountList.get(0).getBalance();
		currentBalance=0;
		highestAccountInfo="";
		for(BankAccount index : accountList)
			{
				currentBalance=index.getBalance();
				if (currentBalance>highestBalance)
				{
					highestBalance=currentBalance;
					highestAccountInfo=index.getAccount();
				}
				
		}
		System.out.println("Highest Balance Account Info: ");
		System.out.println(highestAccountInfo);
		
	}

}
