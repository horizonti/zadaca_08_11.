package zadaca_10_11;

import java.util.Scanner;

public class OkreniString {

	public static void main(String[] args) {
		     //Napisati program koji pita korisnika da unese neki
		     //string te ispisuje taj isti string naopako.
		     //poruka=Naopaki string
		
		 Scanner unos=new Scanner(System.in);
		     //Pitaj korisnika
	     System.out.println("Molimo unesite string poruku:");
            //Ispisi naopako
         System.out.println("String poruka naopako:"+ new StringBuilder(unos.nextLine()).reverse());
        
         unos.close();
	}

}
