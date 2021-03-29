
public class BankThreshold {


	 private double balance;
	 private double interestPercent;
	 private double threshold;
	 private int months=0;
	 
	 public BankThreshold(double sB,double i)
	   {
	      balance = sB;
	      interestPercent=i;

	   }
		public void interestThreshold(double threshold)
		{
			threshold=threshold;
			while (balance<=threshold)
			{
				double interestAmount = balance*interestPercent;
				balance = balance+interestAmount;
				months++;
			}
			
		}
		public int getMonths() {
			return months;
		}
		public void resetMonths() {
			months=0;
		}
		public void resetBalance(double sB) {
			balance=sB;
		}
		
		
		
		

}
