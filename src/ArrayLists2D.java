import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists2D {
    public static void main(String[] args) {
        //just like arrays there are 2-d arrays simmlly we have 2-d ArrayList

        //DECLARATION :
        ArrayList < ArrayList <Integer> > list = new ArrayList< > (10);


        //INITIALISATION :
        for(int i = 0 ; i <3 ; i++){
            list.add(new ArrayList<>());
        }

        Scanner in = new Scanner(System.in);
        //ADD-ELEMENTS :
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                list.get(i).add(in.nextInt());
            }
        }

        //PRINT
        System.out.println(list);
    }
}
