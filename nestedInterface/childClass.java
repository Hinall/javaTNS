package TNSjava.nestedInterface;

public class childClass implements outter.inner {
    @Override
    public void display() {
        System.out.println("inner method");
    }
}
