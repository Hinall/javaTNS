package TNSjava.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> lst=new ArrayList<String>();
        lst.add("hinal");
        lst.add("dolly");
        lst.add("zeal");
        lst.add("vanshita");
        System.out.println(lst);

        Iterator itr=lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
