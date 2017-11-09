
public class PalindromBroj {

	public static void main(String[] args) {
		// Napisati program koji pronalazi i ispisuje
		//najveci prosti palindrom manji od 1000.
		
		int palindrom = 0;
 		int[] niz = new int[1001];
 		for (int i = 0; i < 1001; i++) {
 			niz[i] = i;
 		}
 		for (int i = 1; i < 1001; i++) {
 			if (niz[i] != 0) {
 				for (int s= i; s< 1000 / i + 1; s++) {
 					niz[niz[i] * s] = 0;
 				}
 			}
 		}
 		for (int i = 100; i < 1001; i++) {
 			if (niz[i] % 10 == niz[i] / 100 && niz[i] != 0) {
 				palindrom = niz[i];
 			}
 		}
 		System.out.println("Najveci prosti palindrom je:"+palindrom);
	}

}
