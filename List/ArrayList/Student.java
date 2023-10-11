package TNSjava.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    int rollno;
    int age;
    String name;
    Student(int rollno,int age,String name){
        this.rollno=rollno;
        this.age=age;
        this.name=name;

    }

    public static void main(String[] args) {
        Student s1=new Student(1,20,"hinal");
        Student s2=new Student(2,22,"zeal");

        ArrayList<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);

        Iterator<Student> itr=al.iterator();
        while(itr.hasNext()){
            Student st= (Student)itr.next();
            System.out.println(st.age);
            System.out.println(st.rollno);
            System.out.println(st.name);

        }


    }

}
