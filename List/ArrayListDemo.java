package TNSjava.List;

import java.util.List;

public class ArrayListDemo implements List {
    public static void main(String[] args) {
        List l=new ArrayListDemo();
        System.out.println(l.isEmpty());
        l.add(1);
        l.add(null);
        l.add(null);
        l.add('e');
        l.add("eeeee");
        System.out.println(l);




    }
}
