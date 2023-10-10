package TNSjava.List.Vector.Stack;

import java.util.Iterator;
import java.util.Stack;

//The stack is the subclass of Vector. It implements the last-in-first-out data structure,
// i.e., Stack. The stack contains all of the methods of Vector class and also provides its
// methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties
public class Test {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("one");
        s.push("two");
        s.push("three");
        s.pop();

        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
