package TNSjava.Queues.PriorityQueue;
import java.util.*;




public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("one");
        pq.add("two");
        pq.add("three");
        pq.add("four");
        System.out.println(pq.element());
        System.out.println(pq.peek());
        Iterator<String> itr=pq.iterator();
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        pq.poll();
        while(pq.iterator().hasNext()){
            System.out.println(itr.next());
        }

    }
}
