import java.util.Scanner;


public class Stednja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite iznos uplate : ");
		
		double uplata = unos.nextDouble();
		double kamata = 0.00417;
		
		System.out.println("Unesite broj mjeseci : ");
		
		double mjesec = unos.nextDouble();
		double ukupno = uplata * (1 + kamata);
		double brojac = 0;
		
		while (brojac < mjesec) {
			brojac+= mjesec;
			System.out.print("Stanje na racunu je: " + (uplata + ukupno) * (1 + 0.00417));
		
			unos.close();
			
		    }
		
                 unos.close();
      }
}
