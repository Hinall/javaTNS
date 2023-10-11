package TNSjava.Exception;


public class Test extends TestException{
    public static void main(String[] args) {
        try{
            System.out.println("under try block");
            throw new TestException();
        }
        catch (TestException e){
            System.out.println("exception is catch"+e.getMessage());
        }
    }
}
