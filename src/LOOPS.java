public class LOOPS {
    public static void main(String[] args) {
        /*
        LOOPS :
        basic Syntax of for loop in java is same as cpp.

        for loop is used when we know exactly how many times we need to run the loop
        for example print ten numbers , sum of first 10 natural numbers .
        for (initialization ; condition ; increment / decrement ){
            body of loop;
            }

         */

        //Q : print all natural no.s from 1 to 10.

        for (int num = 1;num<=10;num++){
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("below is the output of while loop :");

        /*
        while loop is used when we don't exactly know how many iterations need to be done
        such that run the loop until the user presses X or something ; so here we dont know how many
        times exactly loop will be running u just provide the condition in the while loop and if it becomes
        false the loop will terminate itself.
        syntax for WHILE loop :
            while (condition) {
                body;
                increment/decrement;
             }
         */
        //Q : print first 5 natural numbers
        int n=1;
        while (n<=5){
            System.out.println(n);
            n++;
        }

        System.out.println("\n");
        System.out.println("below is the output of do-while loop :");

        /*
        there's one more kind of loop similar to while loop with a a small difference
        the do-while loop executes once doesn't matter if the condition specified is False or not
        other things are same as while loop.
        Syntax of do-while loop :
            do {
            body ;
            increment/decrement;
              }while(condition)
         */

        int x = 1;
        do {
            System.out.println("hello , world!");
        }while( x!=1);

        /* a program can be written in any of the loop  as they can be converted into each other*/



    }
}
