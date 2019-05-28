import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    int[] A = {1, -1000, -1000, -2, -5, 0, 3};
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    Iterator<Integer> itr2 = queue.iterator();
    public Queue(){
        try{
            addToList(A, queue);
            System.out.println(" First element : "  + queue.peek());// gives -1000
            removeNegativeIntegers(queue);
            System.out.println("New first element: " + queue.peek()); // gives 0

        }catch(Exception e){
            System.out.println(e.getCause());
        }

    }
    public static void main(String[] args) {
    Queue que = new Queue();
    }

    public void addToList(int[] A, PriorityQueue queue){
        for(int i=0; i<A.length; i++){
            queue.add(A[i]);
        }
    }

    public void removeNegativeIntegers(PriorityQueue<Integer> queue){
        boolean repeat = true;
        while(repeat){
            if (queue.peek() < 0) queue.poll();
            else {repeat = false;}
        }
    }


}
