import java.util.Scanner;


public class MetriStope {

	public static void main(String[] args) {
		// Napisati metodu koja pretvara stope u metre. Metoda treba da ima sledeći
		//header:public static double stopeUMetre(double stope). 1 stopa = 0,305 m.

	Scanner unos = new Scanner(System.in);
		
		System.out.print("Molimo vas unesite broj stopa: ");
		double stope = unos.nextDouble();
		
	 unos.close();
		
		 stopeUMetre(stope);
		
		}public static double stopeUMetre(double stope){
		
			double metri=stope*0.305;
			
				System.out.println(stope + " stopa iznosi " + metri + " metara.");
				{
	      return 0;
	      }
		  
}}
