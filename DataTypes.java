package part1;
//8 primitive data types
//int,float,long,short,double,byte,boolean,char
public class DataTypes {
    public static void main(String[] args) {
        int maxrange=Integer.MAX_VALUE;
        int minrange=Integer.MIN_VALUE;
        System.out.println(maxrange);
        System.out.println(minrange);

        System.out.println("byte max value " + Byte.MAX_VALUE);
        System.out.println("byte min value " + Byte.MIN_VALUE);

        System.out.println("short max value " + Short.MAX_VALUE);
        System.out.println("short min value " + Short.MIN_VALUE);

        System.out.println("long max value " + Long.MAX_VALUE);
        System.out.println("long min value " + Long .MIN_VALUE);

        float floatnumber=10.2f;// mention f otherwise it will consider it as double
        double doublenumber=10.2;
        System.out.println("float max value " + Float.MAX_VALUE);
        System.out.println("float min value " + Float.MIN_VALUE);

        System.out.println("double max value " + Double.MAX_VALUE);//double is faster
        System.out.println("double min value " + Double.MIN_VALUE);

        int intnum=22/7;
        float floatnum=22f/7f;//decimal upto 6 digit
        double doublenum=22d/7d;//decimal upto 16 digit
        System.out.println("integer value " +intnum);
        System.out.println("float value "+floatnum);
        System.out.println("double value "+doublenum);

        char id='h';
        char id2='1';
        //char idd=id+id2; cant do operation on char
        //System.out.println("char concatunation"+idd);
        // 2 bytes width =means 16bits




        //practice question1
        int num1=23;
        byte num2=100;
        short num3=1111;
        long num4=(long)(num1*num2*num3);
        System.out.println(num4);

        //Calculate the quantity of petrol and diesel
        // in a budget of 1546.12 Rs according to respective prices 84.11, 74.91

        double petrol=84.11;
        double diesel=74.91;

        System.out.println("quantity of petrol "+(1546.12/petrol)+"litres");
        System.out.println("quantity of diesel "+(1546.12/diesel)+"litres");


    }
}
