import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        //just like array we have 2-D array in which each element of array is itself an array
        /* {
                {1,2,3} ,
                {4,5,6} ,
                {7,8,9}
                                }
           Syntax :
           int[][] arr = new int[rows][columns];
           giving columns size isn't that important but rows is mandatory;

         */
        int[][] newarr;
        newarr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i = 0 ; i < newarr.length ; i++){
            System.out.println(Arrays.toString(newarr[i]));
        }

        //==========INPUT===========
        //how to take input for a 3*3 matrix :
        int[][] thisinput = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int r = 0 ; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                thisinput[r][c] = in.nextInt();
            }
        }
        //printing the inputted array :
        for(int i = 0; i< thisinput.length; i++){
            System.out.println(Arrays.toString(thisinput[i]));
        }

    }
}
