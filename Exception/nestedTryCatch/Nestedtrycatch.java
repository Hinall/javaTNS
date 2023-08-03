package TNSjava.Exception.nestedTryCatch;
public class Nestedtrycatch{
    public static void check() {
        String s1="TNS";
        String s2=null;
        System.out.println("start of method");
        try {
            System.out.println(s1.charAt(6));

            try {
                System.out.println(s2.length());
            } catch (NullPointerException np) {
                System.out.println("innner catch" + np.getMessage());
            }
        }
        catch (StringIndexOutOfBoundsException si){
            System.out.println("outter catch"+si.getMessage());
        }
        System.out.println("end of method");

        
    }
}