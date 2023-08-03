package TNSjava.wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        //unboxing =>obj to var
        Integer i=new Integer(10);
        System.out.println(i);
        int a=i.intValue();
        System.out.println(a);
        int b=i;
        System.out.println(b);

        //autoboxing=>var to obj
        int p=2;
        Integer Q=p;
        System.out.println(p);
        System.out.println(Q);
    }
    //unboxing=>wrapper into primitive type


}
