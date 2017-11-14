import java.util.Scanner;


public class IspisiBrojevePremaRastucemRedoslijedu {

	public static void main(String[] args) {
		//Napisati metodu sa sljedećim headerom koja ispisuje tri 
		//broja u rastućem redosljedu: public static void ispisiSortiraneBrojeve
		//(double broj1, double broj2, double broj3). Napisati program
		//koji pita korisnika da unese tri broja te ispiše ta tri broja u rastućem redosljedu.
		Scanner unos=new Scanner(System.in);
		System.out.println("Molimo unesite prvi broj");
        System.out.println("Molimo unesite drugi broj");
        System.out.println("Molimo unesite treci broj");
        double broj1=unos.nextDouble();
        double broj2=unos.nextDouble();
        double broj3=unos.nextDouble();
		unos.close();
		
		
		rastuciRedoslijed(broj1,broj2,broj3);
		
	}  public static void rastuciRedoslijed(
		double broj1,double broj2,double broj3){
		     if(broj1>broj2 && broj2> broj3){
		    	 System.out.println("Rastuci redoslijed:"+broj3+"."+broj2+"."+broj1);  
		           }
		           if(broj1>broj3 && broj3>broj2){
		         System.out.println("Rastuci redoslijed:"+broj2+"."+broj3+"."+broj1);
		           }
		           if(broj2>broj1 && broj1>broj3){
		         System.out.println("Rastuci redoslijed:"+broj3+"."+broj1+"."+broj2);	   
		           }
		           if(broj2>broj3 && broj3> broj1){
		         System.out.println("Rastuci redoslijed:"+broj1+"."+broj3+"."+broj2);  
		           }
		           if(broj3>broj2 && broj2>broj1){
		           }
		         System.out.println("Rastuci redoslijed:"+broj1+"."+broj2+"."+broj3);
			       
			       if(broj3>broj1 && broj1>broj2){
			       }
			   
			       

	}

}
