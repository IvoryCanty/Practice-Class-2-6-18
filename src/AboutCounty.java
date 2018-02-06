
import java.util.Scanner;

public class AboutCounty {
	
	public static void main (String [] args)
	{ 	
		Scanner scan = new Scanner (System.in);
		
		County fries = new County (scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextDouble() );
		
		System.out.println(fries.CountyName  +  fries.CountyPopulation + fries.CountyYearEstablish + fries.CountyLandVolume);
	}

}
