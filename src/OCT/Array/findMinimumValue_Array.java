package OCT.Array;

public class findMinimumValue_Array {
    public static void main(String[] args) {

        int [] array = {37,48,20,19,33,66};
        System.out.println("find the minimum value");
        int min_value = give_min(array);
        System.out.printf("The minimum number is %d", min_value);
    }

    static int give_min (int [] array){
      int min = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            
        }
        return min;
    }
}
