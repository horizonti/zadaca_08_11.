
public class PalindromPrime {

	public static void main(String[] args) {
		
	
		//Palindrome prime je prosti broj koji je također
				//i palindrom. Na primjer, 131 je palindrome prime,
				//kao i brojevi 313 i 757. Napisati program koji ispisuje
				//prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
				//Koristiti metode za rješenja zadatka.
		
	     System.out.println("\nPalindrome  >>");
	        for (int i = 100; i <= 1000; i++) {
	            if (palindromPrime(i) == true) {
	            
	            	
	                System.out.print(i + " ");
	            }
	        }
	    }
    
         public static boolean palindromPrime(int num) {
            		        int num1 = num;
            		        int rem;
            		        int result = 0;
            		        while (num > 0) {
            		            rem = num % 10;
            		            num = num / 10;
            		            result = (result + rem) * 10;
            		        }
            		        result /= 10;
            		        if (result == num1) {
            		            return true;
            		        } else {
            		            return false;
            		        }
         }}

            		