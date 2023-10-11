package TNSjava.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GetSet {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        //get element
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.set(4,20));
        System.out.println(l);

        for (Integer x:l) {
            System.out.println(x);}
        //sorting
        Collections.sort(l);
        for (Integer x:l) {
            System.out.println(x);}


    }
}
