package TNSjava.Interface;

public abstract class implentClass implements child {
    public void show(){
        System.out.println("show method");
    }

    @Override
    public void print() {
        System.out.println("print method");
    }
}
