import java.util.Scanner;


public class Novaproba {

	public static void main(String[] args) {
		
	  Scanner unos=new Scanner(System.in);
		
		System.out.println(" Unesi cijele pozitivne i negativne brojeve u nizu(0 prekida unos):");
		double broj=unos.nextDouble();

		double brojac1=0;
		double brojac2=0;
		double sum=0;
		double prosjek=0;
		while(broj!=0){
		sum=sum+broj;
			if (broj>0){
				brojac1++;}
			if (broj<0){
				brojac2++;}
			prosjek=sum/(brojac1+brojac2);
			broj=unos.nextDouble();
			}
System.out.println("Uneseni " + brojac1 + " pozitivni su, a "+brojac2+" negativni su.");
System.out.println("Suma brojeva je " + sum + ",prosjek je "+prosjek);
			unos.close();
			unos.next();
		}
			}
	


