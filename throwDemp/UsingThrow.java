package TNSjava.throwDemp;

import java.util.Scanner;

public class UsingThrow {
     public static void acceptNumber(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
//
//        try{
//            if(n<0){
//                throw new NegativeArithmeticException;
//            }
//            else if (n>100) {
//                throw new GreaterArithmaticException;
//            }
//            else{
//                System.out.println("valid percentage");
//            }
//        }
//        catch(GreaterArithmaticException ge){
//            System.out.println("error is occurred"+ge);
//        }
//        catch(NegativeArithmeticException ne){
//            System.out.println("error is occurred");
//        }

    }

    public static void main(String[] args) {
        System.out.println("enter percentage");
        acceptNumber();
    }

    public class NegativeArithmeticException extends Exception {
        public NegativeArithmeticException() {
            System.out.println("negative number is not valid");
        }


    }

    public class GreaterArithmaticException extends Exception{
        public GreaterArithmaticException(){
            System.out.println(" greater than 100 number is not valid");
        }
    }

}
