package TNSjava.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("one");
        v.add("two");
        v.add("four");
        v.add("three");

        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
// However, It is synchronized and contains many methods that are not the part of Collection
// framework.