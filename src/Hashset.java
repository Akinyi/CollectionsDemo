import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
import java.util.function.Predicate;

public class Hashset {
// hashsets dont have indexing only hashcodes so to iterate use iterator
    // Hashsets has unique but do not sort elements. Only TreeSets sort elements
    int[] A = {1, -1000, -1000, 0, 3};
    HashSet<Integer> set = new HashSet<Integer>();

    public Hashset(){
        try{
            addToList(A, set);
            Iterator<Integer> itr2 = set.iterator();
            while(itr2.hasNext()){
                Object element = itr2.next();
                System.out.println((element));
            }


        }catch(Exception e){
            System.out.println(e.getCause());
        }

    }
    public static void main(String[] args) {
       Hashset set = new Hashset();
    }

    public void addToList(int[] A, HashSet set){
        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }
    }


}
