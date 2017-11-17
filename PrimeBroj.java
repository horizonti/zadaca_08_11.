
public class PrimeBroj {

	public static boolean isPrime(int broj) {
		// TODO Auto-generated method stub

		boolean prost=true;
		for(int x=2;x <= (broj/2); x++){
			if( broj % x==0){
			prost=true;
			break;
		   
		   }}  return prost;
	}
		 public static void main(String[] args){
				  int n=1000;
				  System.out.print("Prost:\n");
	 	  for(int i = 2; i <= n ;i++){
				if(isPrime(i)==true){
				
			 		System.out.print(i+" ");
			
	         }}
	 	  }}

