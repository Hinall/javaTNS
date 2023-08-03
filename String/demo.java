package TNSjava.String;
//
public class demo {
    public static void main(String[] args) {
        char c[]={'t','N','s'};
        String s=new String(c);
        String s1=new String(s);
        System.out.println(s);
        System.out.println(s1);

        String s2=new String("india");
        System.out.println(s2);

        String ss=s2.toUpperCase();
        System.out.println(ss);

        System.out.println(ss.length());
        System.out.println(ss.substring(1));
        System.out.println(ss.trim());
        System.out.println(ss.isEmpty());
        //string comparison

        String str1=new String("good evening");
        String str2=new String("good evening");
        System.out.println(str1==str2);//compares object
        System.out.println(str1.equals(str2));//cmparescontent

    }




}
