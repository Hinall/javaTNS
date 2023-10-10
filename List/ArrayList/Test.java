package TNSjava.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> Al=new ArrayList<>();
        Al.add("one");
        Al.add("two");
        Al.add("three");
        Al.add("four");

        Iterator<String> itr=Al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//LinkedList implements the Collection interface. It uses a doubly linked list internally to
// store the elements. It can store the duplicate elements. It maintains the insertion order
// and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.

