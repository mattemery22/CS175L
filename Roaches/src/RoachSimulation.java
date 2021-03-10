import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.util.Scanner;
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		String input = JOptionPane.showInputDialog("Enter starting roach population:");
		double sP = Double.parseDouble(input);
		
		RoachPopulation bugs = new RoachPopulation(sP);
		DecimalFormat wholeFormat = new DecimalFormat("0");
		JOptionPane.showMessageDialog(null,  "The initial roach population is "+wholeFormat.format(bugs.getRoachPopulation()));
		
		int spP=0;
		int x=1;
		while (x<5)
		{
			bugs.breed();
			JOptionPane.showMessageDialog(null,  "The Roach Population after cycle "+x+" breeding is "+wholeFormat.format(bugs.getRoachPopulation()));
			if (x==1) {
				String inputTwo = JOptionPane.showInputDialog("Enter spray percent(Ex:50 for 50%):");
				spP = Integer.parseInt(inputTwo);
			
			}
			bugs.spray(spP);
			JOptionPane.showMessageDialog(null,  "The Roach Population after cycle "+x+" "+spP+" percent spraying is "+wholeFormat.format(bugs.getRoachPopulation()));
			spP=spP+10;
			x++;
		}
		
	}

}
