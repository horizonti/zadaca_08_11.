import java.util.Scanner;


public class ObimPovrsina {

	public static void main (String[] args){ 
		//Napisati metode koje izračunavaju obim i površinu kvadrata.
		//Metode trebaju imati sledeće headere: 
        //public static double obim(double stranica) 
        //public static double povrsina(double stranica)
        //Napisati test program koji pita korisnika da unese dužinu
        //stranice kvadrata i ispisuje mu obim i površinu tog kvadrata.
		Scanner unos=new Scanner(System.in);
		System.out.println("Molimo unesite double stranicu kvadrata:");
         double stranica=unos.nextDouble();
         obim(stranica);
         povrsina(stranica);
          unos.close();
	}public static double obim(double stranica){
         return 0;
     }public static double povrsina(double stranica){    
 		System.out.println( ("Obim iznosi: "+4*stranica+"."+"Povrsina iznosi: "+2*stranica) );
		
  return 0;
  }}
	

	

		

 	
        	
        		
        	 
         
        

	


