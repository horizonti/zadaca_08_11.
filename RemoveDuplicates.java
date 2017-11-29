package zadaca_28_11;


import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
      
       public static void removeDuplicate(ArrayList<Integer> list){
              
            
              
              
               for(int i = 0; i < list.size() - 1; i++){
                       for(int j = i + 1; j < list.size(); j++){
                               if(list.get(i) == list.get(j)){
                                       list.remove(j);
                               }
                       }
               }
               System.out.println(list);
              
              
              
       }


       public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);
               ArrayList<Integer> lista = new ArrayList<>();
              
              
               System.out.println("Unesite 10 cijelih brojeva");
               for(int i = 0; i < 10; i++){
                       lista.add(sc.nextInt());
               }
               sc.close();
               removeDuplicate(lista);

	}

}
