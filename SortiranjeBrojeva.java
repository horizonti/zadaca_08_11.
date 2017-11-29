package zadaca_28_11;
import java.util.Arrays;
public class SortiranjeBrojeva{
		public static void mergeSort(int [] niz1, int[] niz2){
			// Definisanje treceg niza
			int[] niz3= new int[niz1.length+niz2.length];
			{
				// Kopira dva niza u treci niz
				System.arraycopy(niz1, 0, niz3, 0, niz1.length);
				System.arraycopy(niz2, 0, niz3, niz1.length, niz2.length);
				// Sortira treci niz
				Arrays.sort(niz3);
				// Ispisuje treci niz
				for( int vesna: niz3)
					System.out.println(vesna);		
			}
		}
		public static void main(String[] args) {
			java.util.Scanner unos= new java.util.Scanner(System.in);
			System.out.println(" Unesi broj elemenata prvog niza:");
			int n=unos.nextInt();
			int[] niz1= new int[n];
			// Unošenje elemenata prvog niza
			for( int i=0; i<n; i++) {
				System.out.printf("niz1[%d]", i);
			niz1[i]=unos.nextInt();
			}
			System.out.println(" Unesi broj elemenata drugog niza:");
			int m=unos.nextInt();
			int[] niz2= new int[m];
			// Unošenje elemenata drugog niza
			for( int i=0; i<m; i++) {
				System.out.printf("niz2[%d]", i);
			niz2[i]=unos.nextInt();
			}
			// Poziv metode
			mergeSort(niz1, niz2);
			unos.close();

	}

}
