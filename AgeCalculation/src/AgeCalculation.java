import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				  
		  String input = JOptionPane.showInputDialog("Enter your birthday:");
	      String [] bdaySplit = input.split("/");
	      String bYear = bdaySplit [2];
	      String bDay = bdaySplit [1];
	      String bMonth = bdaySplit [0];
	      
	      LocalDate systemDate = LocalDate.now();
		  String currentDate = systemDate.toString();
		  String [] currentDateSplit = currentDate.split("-");
		  String cYear = currentDateSplit [0];
	      String cDay = currentDateSplit [2];
	      String cMonth = currentDateSplit [1];
	      JOptionPane.showMessageDialog(null,"The current date is "+ LocalDate.now());
	      
	      int cYearInt=Integer.parseInt(cYear);
	      int cMonthInt = Integer.parseInt(cMonth);
	      int cDayInt = Integer.parseInt(cDay);
	      int bYearInt= Integer.parseInt(bYear);
	      int bMonthInt=Integer.parseInt(bMonth);
	      int bDayInt=Integer.parseInt(bDay);
	      
	  
	      int yearDiff=cYearInt-bYearInt;
	      int monthDiff=cMonthInt-bMonthInt;
	      int dayDiff= cDayInt-bDayInt;
	      
	     
	      int maxDaysPrevMonth=0;
	      
	      if (cMonthInt%2==1 && cMonthInt!=3)
	      {
	    	  maxDaysPrevMonth=30;
	      }
	      else if (cMonthInt%2==0) {
	    	  maxDaysPrevMonth=31;
	      }
	      else {
	    	  maxDaysPrevMonth=28;
	      }
	      
	      
	      
	      
	      if (monthDiff<0)
	      {
	    	  yearDiff--;
	    	  monthDiff = 12 - bMonthInt +cMonthInt;
	      }
	      else if (monthDiff==0 && dayDiff<0)
	      {
	    	  yearDiff--;
	    	  monthDiff=11;
	      }
	    	      
	      
	      if (dayDiff>0)
	      {
	    	  dayDiff = cDayInt-bDayInt;
	      }
	      else if(dayDiff<0) 
	      {
	    	 monthDiff--;
	    	 dayDiff = maxDaysPrevMonth - (bDayInt-cDayInt);
	      }
	      else {
	    	  dayDiff=0;
	    	  if (monthDiff==12)
	    	  {
	    		  yearDiff++;
	    		  monthDiff=0;
	    	  }	  
	      }

	      JOptionPane.showMessageDialog(null,"You are "+yearDiff+" year(s) "+monthDiff+" month(s) "+dayDiff+" day(s) old.");
	 
	}

}

