import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4,5};
        change(arr); // passing the copy of reference variable in the function as argument
        System.out.println(Arrays.toString(arr));
        //Arrays.toString is just a function which converts array items to string

    }

    static void change(int[] a){
        a[0]=9; //changing the first number in arr by 9
        // here arr is a non-primitive datatype and both a and arr are pointing towards same object
        //any change made by any of the two reference variables will be reflected back in the original object
    }
}
//OUTPUT : Array is changed and 1 is replaced by 9 as we wanted