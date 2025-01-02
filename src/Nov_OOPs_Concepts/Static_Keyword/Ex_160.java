package Nov_OOPs_Concepts.Static_Keyword;

public class Ex_160 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        System.out.println(student.school_name);
        // static variable is comman for all instaces

        student.school_name = "XYZ convent";
        System.out.println(student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);
    }
}

class student {
    int age; // non static variable
    static String school_name = "ABC convent"; // static in nature

//IIB
//Instance initialization Block
// depends on no. of object created, no. of IIB will be executed

    {
        System.out.println("IIB is created");
        System.out.println("Here we can write IIB code");
        System.out.println("Read the sql DP()");
    }
// static will be executed only once
   static  {
       System.out.println("SIB is created");
       System.out.println("Here we can run SIB code");
    }



}


