package housePainting;
import java.util.Scanner;
import java.text.DecimalFormat;



public class housePaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("#.00");
		

		double houseLength=0;
		double houseWidth=0;
		double houseHeight=0;
		int numberOfWindows=0;
		double lengthOfWindows=0;
		double widthOfWindows=0;
		int numberOfDoors=0;
		double lengthOfDoors=0;
		double widthOfDoors=0;
		double costPerSqFt=0;
		
		

		System.out.println("Enter length of house (horizontal):");
		houseLength = in.nextDouble();
		
		System.out.println("Enter width of house(vertical not including peak):");
		houseWidth = in.nextDouble();

		System.out.println("Enter height of house (base of house to peak):");
		houseHeight = in.nextDouble();
		
		System.out.println("Enter the number of windows on the house:");
		numberOfWindows = in.nextInt();
		
		System.out.println("Enter length of one window (horizontal):");
		lengthOfWindows = in.nextDouble();
		
		System.out.println("Enter width of one window (vertical):");
		widthOfWindows = in.nextDouble();
		
		System.out.println("Enter the number of doors on the house:");
		numberOfDoors = in.nextInt();
		
		System.out.println("Enter length of one door on the house (horizontal):");
		lengthOfDoors = in.nextDouble();
		
		System.out.println("Enter width of one door on the house (vertical):");
		widthOfDoors = in.nextDouble();
		
		System.out.println("Enter the cost per square foot:");
		costPerSqFt = in.nextDouble();
		

		double peakHeight = houseHeight-houseWidth;
		double peakSqFt = peakHeight*houseLength;
		double houseSqFt = houseLength*houseWidth*4;
		double preTotalSqFt = peakSqFt+houseSqFt;
		double windowsSqFt = lengthOfWindows*widthOfWindows*numberOfWindows;
		double doorsSqFt = lengthOfDoors*widthOfDoors*numberOfDoors;
		double finalTotalSqFt = preTotalSqFt - windowsSqFt - doorsSqFt;
		double totalCost = finalTotalSqFt*costPerSqFt;
		
		System.out.println("Your total square footage is "+finalTotalSqFt);
		System.out.println("Your cost estimate is $"+df2.format(totalCost));
		in.close();
	
		
				
		
		
	}

}
