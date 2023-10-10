package TNSjava.Queues.Deque.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("one");
        dq.add("two");
        dq.add("three");
        dq.add("four");

        for(String element:dq){
            System.out.println(element);
        }


    }
}
