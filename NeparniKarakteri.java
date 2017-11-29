package zadaca_28_11;

import java.util.Scanner;
public class NeparniKarakteri {
    
    public static void printCharacter(String str){
        
        char[] ch = str.toCharArray();
        for(int i = 1; i <= str.length(); i++){
                if(i % 2 != 0){
                        System.out.print(ch[i - 1]);
                }
        }
}

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = null;
       
        System.out.print("Unesite niz brojeva:");
        s = sc.nextLine();
        sc.close();
       
        printCharacter(s);	
		
		
		
		
		
		
	}
	}


