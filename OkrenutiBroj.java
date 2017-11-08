import java.util.Scanner;


public class OkrenutiBroj {

	public static void main(String[] args) {
		// Scanner
		Scanner unos=new Scanner(System.in);
		//Pitaj korisnika
         System.out.println("Unesite cijeli broj):");
         //Deklarisi varijable
         int broj=unos.nextInt();
         int poslednji=0;
         int cifreBroja=broj;
         //Petlja
             while(cifreBroja !=0){
        	 poslednji=cifreBroja%10;
        	 cifreBroja=cifreBroja/10;
        	 //ispisi rezultat
        	 System.out.print(poslednji);
        	 unos.close();
         }
	}

}
