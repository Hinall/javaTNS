package TNSjava.StringBuffer;

public class Sbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello All");
        System.out.println(sb.length());
        System.out.println(sb.capacity());//default is 16+new

        sb=new StringBuffer(40);

        String s;
        int a=42;
        s=sb.append("aaa:").append(a).append("!!!").toString();
        System.out.println(s);
        System.out.println(sb);

        //insert()
        sb=new StringBuffer("hjfheklrj");
        sb.insert(2,"jjjjj");
        System.out.println(sb);

        //delete
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);




    }
}
