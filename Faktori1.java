package zadaca_10_11;

import java.util.Scanner;

public class Faktori1 {

	public static void main(String[] args) {
		// Napisati program koji pita korisnika da unese cijeli
		//broj, a zatim ispisuje sve faktore tog broja. Ako broj m 
		//podijelimo brojem n pri cemu je ostatak dijeljenja 0,
		//onda je broj n faktor broja m.
		
         Scanner unos=new Scanner(System.in);
           
         System.out.println("Molimo unesite cijeli broj:");
           int broj=unos.nextInt();
           for (int i = 1; i <= broj; i++) {

               if (broj % i == 0)
               System.out.println(i+" ");
               unos.close();
           }
          

	}

}
