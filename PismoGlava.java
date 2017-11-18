
import java.util.Scanner;


public class PismoGlava {

	public static void main(String[] args) {
		// Napisati metodu koja prima jedan argument te simulira
		//bacanje novčića toliko puta. Nakon što se simulacija završi,program
		// ispisuje koliko puta je novčić pokazao glavu a koliko puta pismo.
		//"Malo se zabrljalo"
        Scanner unos = new Scanner(System.in);
        System.out.println("Molimo unesite broj;");
		int bacanja = unos.nextInt();
		  pismo( bacanja);
	         glava( bacanja);
	          unos.close();
		
	}public static int  pismo(int bacanja){
        return 0;
    }public static int glava(int bacanja){    
		System.out.println( ("Pisama iznosi: "+ bacanja %2+"."+"Glava iznosi: "+bacanja%3) );
		
 return 0;
 }}
	




