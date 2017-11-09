import java.util.Scanner;


public class BrojiNovcice {

	public static void main(String[] args) {
		// Dati su vam novcici u vrijednosti od 1,
		//3 i 5 maraka, korisnik unosi konacni iznos koji
		//trebate isplatiti, trebate napisati program koji 
		//izracunava i ispisuje najmanji broj novcica koji vam
		//je potreban da isplatite dati iznos. 
		

	        Scanner unos = new Scanner(System.in);
	        System.out.print("Unesi iznos za placanje: ");
	        int iznos = unos.nextInt();
	        //kovanice od 5
	        int brojKovanica = iznos /5; 
	        iznos %= 5;                  
            //kovanice od 3
	        brojKovanica += iznos/3;  
	        iznos %= 3;               
            //kovanice od 1
	        brojKovanica += iznos;    

	        System.out.println("Konacan broj kovanica za placanje je: " + brojKovanica);
						
				unos.close();	
				
			
					
	
		
		      
        
			
	
	}}

