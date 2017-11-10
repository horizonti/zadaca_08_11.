package zadaca_10_11;

public class Amstrong {

	public static void main(String[] args) {
		// . Napisati program koji ispisuje sve Armstrongove brojeve
		//izmedju 0 i 1000. Armstrongov broj je broj ciji je zbir kubova 
		//svih cifri jednak samom broju. Npr. 371 je Armstrongov broj jer 
		//je 33 + 73 + 13 = 371.
		
		    int n = 0,  b,  sum = 0;
	        System.out.print("Armstrongovi brojevi od 0 do 1000 su:");
	        for(int i = 1; i <= 1000; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }
			}

		
		

	}


