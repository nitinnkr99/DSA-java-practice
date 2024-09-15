
public class Functions {
    public static void main(String[] args) {
        //functions are basically a piece or a block of code defined under a name performing a particular task
        //that same task can performed by calling that function name multiple times within a program
        //SYNTAX : (defining a function)
        //public static return_type name_of_function{
        //          body
        //     return some value or not
        //     }

        //calling a function is simple just write the name of function inside the main block with possible arguments
        //parameters are the storing variable that are defined within the function and for a function
        //whereas on the other hand arguments are the actual value of the variables passed by user in the function
        //at the time of calling it

        //example of function that takes input from user and adds it and returns the sum


        int ans = add(5 , 4);
        System.out.println("Sum :" + ans);


    }
    public static int add(int a , int b){
        return (a+b); //what return statement will be returning is the actual type of the function defined
        //anything written after return statement will not be executed as compiler will say its unreachable;
    }

}
