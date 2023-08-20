package TNSjava.usingRunnable;

public class Usingrunnable implements Runnable {

    Thread t;

    public Usingrunnable() {
        t=new Thread();
        t.start();

    }
    public void run(){
        System.out.println("i am in run method");
    }

    public static void main(String[] args) {
        Usingrunnable ref=new Usingrunnable();

    }
}
