package OCT.Array;

public class ArraysString {
    public static void main(String[] args) {

        // Array by string data types
        String[] names = {"nikita","pragati","sagar"};
        System.out.println(names.length);
        System.out.println(names[2]);

        String [] names1 = new String[4]; // when allocating size and no predefined values present
        names1 [0]= "Nikita";
        names1 [1]= "Anu";
        names1 [2]= "Sona";
        names1 [3]= "Rit";
        System.out.println(names1[2]);
        System.out.println(names1[0]);
        System.out.println(names1[3]);

        // Array by boolean data types
        boolean[] num = new boolean[2];
        num[0]= true;
        num[1]= false;
    }
}


