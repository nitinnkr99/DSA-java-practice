import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //when we don't know how many variables arguments we will pass we can simply write function like this:
        /*
        static return_type func_name (return_type ...v){
                body
            }
         */

        fun(1,2,3,4,5,6,7,8,9,0);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); //this function can take as many arguments as u want
        //it takes int values and convert them in to array
    }
}
