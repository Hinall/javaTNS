package TNSjava.Set.LinkedHashSet;
import java.util.*;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");


        Iterator<String> itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
