package OCT.Array;

public class ex_2D_Array_iterate {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // 3 row
        //3 coloumn

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
