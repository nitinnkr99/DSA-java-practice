import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //Why do we need an array?
        //answer  : suppose u have to store roll_no of 50 students , it will not be convenient to define 50 variables
        //separately and initialize them , it will be better to use a array of 50 integer variables.
        //SYNTAX:
        /*
        STEP: 1 Declaration : //at this moment the arr named reference variable pointing towards an array of integers
         is defined in stack memory
            int[] arr ;
                    OR
            int arr[] ;
        STEP :2 Initialization : //it happens at runtime , the allocation of arr of 5 int variables happens at runtime
             int[] arr = new int[5];
                    OR
             int arr[] = new int[5];

       //this is also possible : int[] arr = {1,2,3,4,5} //here java figures out by itself how much size is to be allocated
       //these values(objects) are stored in heap and things stored in heap are not continuous

         */

        int[] arr = new int[5]; //declaration + initialization
        //now arr is a reference variable stored in stack memory pointing towards an array of five integer variables present in heap
        int[] roll_no = {21,32,43,54,67};
        //how to access each element in an array ?
        //answer : each element in array has an index value which can be used to access any particular value of an array

        System.out.println(roll_no[0]);//output : 21
        System.out.println(roll_no[4]);//output : 67

        //Above were the array of primitive datatype , they have default value as zero when nothing is assigned to them
        System.out.println(arr[3]); //output : 0

        //but array of non-primitive like Strings have a default value of null;
        String[] red = new String[10];
        System.out.println(red[2]); //output : null , null is special literal same as None in python

        //INPUT USING for LOOP :
        Scanner in = new Scanner(System.in);

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }

        //And PRINTING :
        System.out.println(Arrays.toString(arr));
        //this will print array in [] enclosed square brackets

        //Another method to print arrays is by loop
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        //there's enhanced version of this loop also :
        for (int j : arr) { //here j will be having the value of elements in array
            System.out.println(j);
        }
    }
}
