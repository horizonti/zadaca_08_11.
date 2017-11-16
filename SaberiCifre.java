import java.util.Scanner;




public class SaberiCifre {

	public static int saberiCifre(long n) {
		// Napisati metodu koja izračunava zbir svih
		//brojeva u cijelom broju. Koristite sljedeći header:
		//public static int saberiCifre(long n). Na primjer,ako 
		//pozovemo metodu i proslijedimo broj 234 (saberiCifre(234))
		//metoda treba da vrati 9. (2 + 3 + 4 = 9)
	      
		     
		     int zbir=0;
		     while (n > 0) {
		            zbir += n % 10;
		            n /= 10;
		     		}
		     		return zbir;
	}
	 public static void main(String[] args) {
		   Scanner unos=new Scanner(System.in);
	  	 System.out.println("Molimo unesite broj:");  	 		
	  	long broj=unos.nextLong();
	    	 	
	    	
	    	System.out.println("Suma cifara broja je " + saberiCifre(broj) );
	    	unos.close();
	     		
		
	}}


