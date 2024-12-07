package OCT.Array;

public class Array_Foreach {
    public static void main(String[] args) {

        int a [] = new int[3];
        a[0]= 90;
        a[1]= 45;
        a[2]= 10;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

     // foreach loop

        int [] num = {10,45,67,20};
        for (int numbers : num){
            System.out.println(numbers);
        }

        String[] names = {"nik","sona","rit","rony"};
        for (String name : names){
            System.out.println(name);
        }


    }
}
