
import javafx.util.Pair;

import java.util.*;

public class Main {
// Finding the smallest missing positive integer in array
    int[] A = {1, -1000, -1, 4, 0, 2, 3, 6};
    LinkedList<Integer> list = new LinkedList();
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public Main (){
       try {
           addToList(A, list);
           list.forEach(e -> System.out.println(e));

           System.out.println("********Sorting elements in List*****");
           Collections.sort(list);
           list.forEach(e -> System.out.println(e));

           System.out.println("********Sorting negative Integer elements in List*****");
           removesSmallestNegativeInteger(list);
           list.forEach(e -> System.out.println(e));

           System.out.println("Smallest missing positive integer: " + findSmallestMissingPositiveInteger(list));

/*
           System.out.println("********Iterating using Iterator and while hasNext()*******");
           Iterator<Integer> itr2 = list.iterator();
           while (itr2.hasNext()) {
               Object element = itr2.next();
               System.out.println((element));
           }*/

           /*System.out.println("********Added an element into List*****");
           list.add(new Integer(6));
           list.forEach(e -> System.out.println(e));
*/
       /*    System.out.println("********Finding largest element in List*****");
           System.out.println("Max element in Linkedlist  "  + Collections.max(list));*/

       }catch(Exception e){
           System.out.println(e.getCause()  + "\n" + e.getLocalizedMessage());
       }
    }

    public static void main(String[] args) {

        Main main = new Main();


    }
    public void addToList(int[] A, LinkedList list){
        for(int i=0; i<A.length; i++){
            list.add(i,A[i]);
        }
    }

    public void removesSmallestNegativeInteger(LinkedList<Integer> list){
        for(int i =0; i < list.size(); i++)
            if (Collections.min(list) < 0) list.remove(Collections.min(list));

    }

    public Integer findSmallestMissingPositiveInteger(LinkedList<Integer> list) {
        int difference, missingInteger = 0;
        for(int i = 1; i <= list.size()-1; i++) {
            for(int j = 0; j<= list.size()-1; j++) {
                difference = list.get(i) - list.get(j);
                if(difference == 0) continue;
                else if (difference >= 2) {
                    missingInteger = list.get(j);
                    break;
                }
            }
        }missingInteger +=1;
        return missingInteger + 1;
    }


}
