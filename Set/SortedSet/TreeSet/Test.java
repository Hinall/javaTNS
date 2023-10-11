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
        System.out.println(ts.contains("one"));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println("fgdrg"+ts.higher("one"));
        System.out.println("fgdrg"+ts.lower("one"));
        System.out.println("fgdrg"+ts.higher("two"));
        System.out.println("fgdrg"+ts.lower("two"));
        System.out.println("fgdrg"+ts.higher("three"));
        System.out.println("fgdrg"+ts.lower("three"));
        ts.pollFirst();
        System.out.println(ts);




    }
}
