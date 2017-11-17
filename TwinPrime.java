
public class TwinPrime {

	public static void main(String[] args) {
		// Twin prime brojevi su par prostih brojeva koji se razlikuju
		//za 2. Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 
		//i 11 i 13 su također twin primes. Napisati program koji ispisuje
		//sve twin prime brojeve manje od 10000, 10 parova po liniji.
		//Koristiti metode za rješenja zadatka. 
	    //Metoda twinPrimes
			 int brojac = 0;
		        for (int i = 2; i < 10000; i++){
		            if (twinPrimes(i) && twinPrimes( i + 2)){
		            	brojac++;
		            	
						if (brojac % 10 != 0) {
							System.out.print("(" + i + " " + (i + 2) + ") ");
						} else {
							System.out.println("(" + i + " " + (i + 2) + ") ");
					  }
					}
		          }
		        }
      
		    public static boolean twinPrimes(long s){
		        if (s < 2) return false;
		        for (int i = 2; i <= s/ 2; i++){
		            if (s % i == 0) return false;
		        } return true;
		   }
	}


