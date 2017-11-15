
public class ProstiBroj {
	static boolean isProstiBroj(int broj){
	//Napisati metodu sa sljedećim headerom: public static 
	//boolean isProstiBroj(int broj) koja provjerava da li je broj 
	//prost/prime. Napisati test program koji poziva ovu metodu i
	//	ispisuje sve proste brojeve u rasponu od 0 do 100 000. 	
	//"Na konzoli nestaje rezultat"	
		
		boolean prost=true;
		for(int x=2;x <= (broj/2); x++){
			if( broj % x==0){
			prost=true;
			break;
		    }}
		    return prost;
	}
		 public static void main(String[] args){{
				  int s=100000;
				  System.out.print("Prost:");
	 	  for(int i = 2; i <= s  ;i++){
				if(isProstiBroj(i)==true){
				
			 		System.out.print(i+" ");
			
	         }}}


		 }}
