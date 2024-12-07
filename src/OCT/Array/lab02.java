package OCT.Array;

public class lab02 {
    public static void main(String[] args) {

        // if we dont have pre defined value
        int [] marks = new int[5];
        System.out.println(marks.length);
        marks [0] = 12;
        marks [1] = 12;
        marks [2] = 12;
        marks [3] = 12;
        marks [4] = 12;
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        System.out.println(marks[10]); // it will thrown an exceptions


    }
}
