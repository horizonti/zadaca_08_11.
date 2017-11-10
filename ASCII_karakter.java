package zadaca_10_11;

import java.util.Scanner;

public class ASCII_karakter {

	public static void main(String[] args) {
	    //Napisati program koji pita korisnika da unese ASCII kod
		//(cijeli broj od 0 do 127) 
		//i ispisuje karakter koji odgovara tom kodu.
		//Scanner
         Scanner unos=new Scanner(System.in);
         //Pitaj korisnika
         System.out.println("Unesite ASCII broj:");
         //Ispisi 
         System.out.println("Karakter koji odgovara tom broju je:"+(char)unos.nextInt());
         unos.close();
	}

}
