import java.util.Arrays;
public class MultipleVarArgs {
    public static void main(String[] args) {

        //when u want to give a mixture of arguments in a same function like strings , int etc;
        multiple( 3 , 4 , "abcdefgh");
    }
    //Also notice that ...v always comes in last because if put it in middle compiler will not be able to identify
    //when u have completed the ...v argument it will give an error
    static void multiple(int a , int b , String ...v){
        System.out.println(Arrays.toString(v) + a + b);
    }
}
