import java.util.Scanner;


public class RastuciRedoslijedDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Molimo unesite  prvi broj:");
        System.out.println("Molimo unesite drugi broj:");
        System.out.println("Molimo unesite treci broj:");
        double num1=unos.nextDouble();
        double num2=unos.nextDouble();
        double num3=unos.nextDouble();
		unos.close();
		
 	
	    ispisiSortiraneBrojeve(num1,num2,num3);
	
} public static void ispisiSortiraneBrojeve(
	double num1,double num2,double num3){
	     if(num1>num2 && num2> num3){
	    	 System.out.println("Redoslijed:"+num3+"."+num2+"."+num1);  
	           }
	           if(num1>num3 && num3>num2){
	         System.out.println("Redoslijed:"+num2+"."+num3+"."+num1);
	           }
	           if(num2>num1 && num1>num3){
	         System.out.println("Redoslijed:"+num3+"."+num1+"."+num2);	   
	           }
	           if(num2>num3 && num3>num1){
	         System.out.println("Redoslijed:"+num1+"."+num3+"."+num2);  
	           }
	           if(num3>num2 && num2>num1){
	           }
	         System.out.println("Redoslijed:"+num1+"."+num2+"."+num3);
		       
		       if(num3>num1 && num1>num2){
		       }

}
}