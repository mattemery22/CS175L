package randArrayAndSearch;
import java.util.Random;

public class randArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int array[]=new int [50];
		int integer;
		int counter=0;
		boolean valueSet=false;
		int largest=0;
		int smallest=0;
		for (int i=0;i<array.length;i++)
		{
			
			integer = rand.nextInt(25)+1;
			if (!valueSet)
			{
				largest=integer;
				smallest=integer;
				valueSet=true;
			}
			array[i]=integer;
			if (integer>largest) {
				largest=integer;
			}
			if (integer<smallest)
			{
				smallest=integer;
			}
			
		}
		
		for (int x=0; x<array.length;x++) {
			System.out.print(array[x]+" ");			
		}
		int count = 1;
		int temporaryCount;
		int popularNumber = array[0];
		int temporary = 0;
		for (int x=0;x<(array.length-1);x++)
		 {
			temporary=array[x];
			temporaryCount=0;
		    for (int y=1;y<array.length; y++)
		    {
		      if (temporary==array[y])
		    	  temporaryCount++;
		    }
		    if (temporaryCount>count)
		    {
		      popularNumber=temporary;
		      count=temporaryCount;
		    }
		  }
		System.out.println("\nLargest: "+largest);
		System.out.println("Smallest: "+smallest);
		System.out.println("Product of largest and smallest: "+(largest*smallest));
		System.out.println("Most frequent number: "+popularNumber);
		System.out.println("Times present in array: "+ count);
	}

}
