
public class Matrica {

	public static void main(String[] args) {
		//Napisati metodu koja ispisuje n x n matricu
		//koristeći se sljedećim headerom: public static void 
		//printMatrix(int n). Svaki element u matrici je ili 0 
		//ili 1, nasumično generisana. Napisati test program koji
		//pita korisnika da unese broj n te mu ispiše n x n matricu
		//u konzoli. 
		
		printMatrica(6);
    }
	public static void printMatrica(int n){
  for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
  
  int random = (int)(Math.random() * 2);
  System.out.print(random + " ");
          }
  System.out.println();

	}
  
	}
  
  
	}


