package TNSjava.String;

public class stringcomparison {
    public static void main(String[] args) {
        String s1="tns";
        String s2="tns";

        String s3=new String("tns");
        String s4=new String("tns");

        System.out.println(s1==s2);
        System.out.println(s3==s4);//obj
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s3.equals(s2));

        //compareTo()-compare two string lexographically by first converting it into a unicode
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
