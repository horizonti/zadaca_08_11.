import java.util.Scanner;


public class Probapiramida {

	public static void main(String[] args) {
		// Kreiraj scanner
	      Scanner unos= new Scanner(System.in);
	      //Pitaj korisnika 
	        System.out.println("Molimo unesite cijeli broj");
	        //Deklarisi
	         int n = unos.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j <= n - i; j++)
	                System.out.print(" ");
	            for (int k = 1; k <= i * 2 - 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            unos.close();
	        }
	}

}
