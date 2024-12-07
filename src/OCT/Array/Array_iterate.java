package OCT.Array;

import java.util.Arrays;

public class Array_iterate {
    public static void main(String[] args) {

        int [] marks = {10,50,30,76,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for ( int i= 0; i>marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        int index_search = Arrays.binarySearch(marks, 76);
        System.out.println(index_search);

    }
}
