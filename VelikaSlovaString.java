import java.util.Scanner;


public class VelikaSlovaString {

	public static void main(String[] args) {
	         // Napisati program koji pita korisnika da unese neki string te ispisuje 
		     //koliko je velikih slova (uppercase slova) u datom stringu.
		     //recenica:Postati Covjek je Bolje nego postati Kralj.
		char slova;
		int  brojac=0;
		 Scanner unos=new Scanner(System.in);
		 System.out.println("Molimo unesite string recenicu: ");
		 String recenica=unos.nextLine();
		 for (int i = 0;i<recenica.length(); i++) {
	 			slova = recenica.charAt(i);
	 			if (Character.isUpperCase(slova)) {
	 				brojac++;
	 System.out.println("Velika slova su: "+slova+brojac);
	
	 unos.close();
	 
	}

}
}}