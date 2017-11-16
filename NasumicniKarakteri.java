
public class NasumicniKarakteri {

	public static int NasumicanBroj(int i){
	
		   //Napisati metodu koja printa 100
		   //nasumičnih uppercase karaktera i 100 
		   //nasumičnih brojeva, 10 po liniji. 
	
	
	 		int broj = (int) (Math.random() * 1000);
	 		return broj;
	 	}
	 
	 	public static char nasumicnoSlovo(int i) {
	 		char slovo = 'A';
	 		int broj = (int) (Math.random() * 25);
	 		while (broj != 0) {
	 			slovo++;
	 			broj--;
	 		}
			return slovo;
	 	}
	
	 	public static void main(String[] args) {
	 		int brojac = 0;
	 		for (int i = 1; i <= 100; i++) {
	 			brojac++;
	 			if (brojac % 10 != 0) {
				System.out.print(NasumicanBroj(i) + " " + nasumicnoSlovo(i) + " ");
	 			} else {
	 				System.out.println(NasumicanBroj(i) + " " + nasumicnoSlovo(i) + " ");
				}
			}
	 	}
	}

	     

		  
	   
	    
	  
	     
       
	     

	

		
	


