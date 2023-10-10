package TNSjava.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("one");
        ll.add("two");
        ll.add("three");

        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//LinkedList implements the Collection interface. It uses a doubly linked list internally to store
// the elements. It can store the duplicate elements. It maintains the insertion order and is not
// synchronized. In LinkedList, the manipulation is fast because no shifting is required.