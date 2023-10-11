package TNSjava.List.ArrayList;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(34);
        al.add(35);
        al.add(35);
        al.add(36);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);

    }
}
