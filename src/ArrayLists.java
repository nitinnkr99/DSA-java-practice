import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //what is need for ArrayLists ??
        //answer : when using a normal array we have to specify the size of an array but if we don't know that
        //how many elements will be there in the array we use ArrayLists .

        //====SYNTAX====
        /*
            ArrayList<Data_Type> name_of_list = new ArrayList<> (initial capacity) ;

         */
        //what does initial capacity means: it's just for providing a number it's not actually the real capacity pf arraylist
        //when more elements than the specified capacity are provided it simply replaces the old capacity by new capacity .

        ArrayList <Integer> my_list = new ArrayList<>(10);

        //how to add elements in we have a function called as add(value to be added)
        my_list.add(45);//this function adds the 45 at 0th index of Arraylist
        my_list.add(55);
        my_list.add(33);

        //if u want to find a element in an arraylist how'd u do it? ====> by using contains(value u want to find)
        System.out.println(my_list.contains(33)); //this will return a Boolean value so we need to print it


        //for removing a element from list we can use a new function called remove
        my_list.remove(1); //index value is provided in the remove function as an argument
        System.out.println(my_list); //checking is element at index 1 ie 55 is removed or not;

        //

    }
}
