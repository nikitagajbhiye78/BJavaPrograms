package OCT.Array;

public class findMaximumValue_Array {
    public static void main(String[] args) {

        int [] array = {55,68,20,49,90,48};
        System.out.println("find the max value");

       int max_value = give_max(array);
       System.out.printf("The max value is %d", max_value);

    }

    static int give_max (int [] array){
        int max = array[0];

     for ( int i=0; i<array.length; i++){
          if (array[i]>max){
         max = array[i];
   }

     }
    return max;

    }
}
