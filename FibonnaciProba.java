package zadaca_28_11;

import java.util.Scanner;

public class FibonnaciProba {

	
 public static void main(String[] args) {
	 
	 for(int i=0;i<100;i++){
		 
	 }
 }
		int fibonaci(int broj)
		{
		    if (broj <= 1)
		        return 1;
		    else
		        return fibonaci(broj - 1) + fibonaci(broj - 2);
		}
		void main()
		{
		   
		     Scanner unos=new Scanner(System.in);
		   
		    System.out.println ( "Unesite broj clanova  niza: ");
		
			int broj = unos.nextInt();
			 		for (int i = 0; i < 100; i++) 
		    System.out.println ( "Fibonacijev niz je: " + fibonaci(broj) );
		   unos.close();
	}

}
