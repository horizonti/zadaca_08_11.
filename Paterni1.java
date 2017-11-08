import java.util.Scanner;


public class Paterni1 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Molimo unesite cijeli broj koliko redova zelite:");
		   int n = unos.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j <= n - i; j++)
	                System.out.print(" ");
	            for (int k = 1; k <= i ; k++) {
	                System.out.print("1");
	                
	            }
	           
	            	
	            
	            System.out.println();
	            unos.close();
	            
	        }
			
		        }
		
			
			} 
			
		
	


