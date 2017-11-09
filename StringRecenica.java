import java.util.Scanner;


public class StringRecenica {

	public static void main(String[] args) {
		//	//Napisati program koji izracunava procenat pojavljivanja velikih
		//i malih slova u nekom stringu koji unese korisnik. 
        //recenica-Volim String ne Volim Petlje
	char slovo;
	 		int brojac = 0;
	 		int brojac1=0;
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite string recenicu : ");
			String recenica = unos.nextLine();
	 		for (int i = 0; i < recenica.length(); i++) {
	 			slovo = recenica.charAt(i);
	 			if (Character.isUpperCase(slovo)) {
	 				brojac++;
	 				}
	 			}
	 				
	 				for(int i = 0; i< recenica.length();i++){
	 				slovo=recenica.charAt(i);
	 				if(Character.isLowerCase(slovo)){
	 				brojac1++;	
	 				}
	 				}	
	 				System.out.println("Velikih slova je: " + 100 * brojac / recenica.length() + " %");
	 				
	 				System.out.println("Malih slova je: "+100*brojac1/recenica.length()+"%");  
	 				
	 				unos.close();
	}

}
