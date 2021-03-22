package romanNumeral;

import javax.swing.JOptionPane;

public class romanNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("Enter a year:");
		int year=Integer.parseInt(input);
		String romanNumeral="";
		int milenia = year/1000%10;
		int centuries = year/100%10;
		int decades = year/10%10;
		int years = year/1%10;
		if (year<=3999 && year>0) {
			//millennia
				while (milenia>0) {
					romanNumeral+="M";
					milenia--;
				}
				
				//centuries
				while (centuries>0) {
					if (centuries==9)
					{
						romanNumeral+="CM";
						centuries-=9;
					}
					else if (centuries>=5)
					{
						romanNumeral+="D";
						int x = centuries-5;
						centuries-=5;
						while (x>0) {
							romanNumeral+="C";
							centuries--;
							x--;
						}
					}
					else if (centuries==4) {
						romanNumeral+="CD";
						centuries-=4;
					}
					else {
						while (centuries>0) {
							romanNumeral+="C";
							centuries--;
						}
					}
					
				}
				
				//decades
				while (decades>0) {
					if (decades==9)
					{
						romanNumeral+="XC";
						decades-=9;
					}
					else if (decades>=5)
					{
						romanNumeral+="L";
						int x = decades-5;
						decades-=5;
						while (x>0) {
							romanNumeral+="X";
							decades--;
							x--;
						}
					}
					else if (decades==4) {
						romanNumeral+="XL";
						decades-=4;
					}
					else {
						while (decades>0) {
							romanNumeral+="X";
							decades--;
						}
					}
				}
					
					//years
					while (years>0) {
						if (years==9)
						{
							romanNumeral+="IX";
							years-=9;
						}
						else if (years>=5)
						{
							romanNumeral+="V";
							int x = years-5;
							years-=5;
							while (x>0) {
								romanNumeral+="I";
								years--;
								x--;
							}
						}
						else if (years==4) {
							romanNumeral+="IV";
							years-=4;
						}
						else {
							while (years>0) {
								romanNumeral+="I";
								years--;
							}
						}
						
					}
				
			 JOptionPane.showMessageDialog(null, "Roman Numeral: "+romanNumeral);
			
			}
			else {
				 JOptionPane.showMessageDialog(null, "Not a valid input");
				 
			}
		
		
		
	
	}
}
