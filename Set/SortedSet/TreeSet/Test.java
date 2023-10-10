package TNSjava.Set.SortedSet.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
