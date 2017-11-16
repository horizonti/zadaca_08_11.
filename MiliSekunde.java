
public class MiliSekunde {

	
		public static String pretvoriMilisekunde(long millis) {
			
		 //Metoda treba da koristi sljedeći header:
	     //public static String pretvoriMilisekunde(long millis).
			
					long sekundi = millis / 1000;
					long sekunde = sekundi % 60;
					long minuta = (sekundi / 60) % 60;
			 	    long sati = ((sekundi / 60) / 60) / 24;
			 		return sati + ":" + minuta + ":" + sekunde;
			 	}
			 
			 	public static void main(String[] args) {
			 		System.out.println(pretvoriMilisekunde(100000));
	}

}
