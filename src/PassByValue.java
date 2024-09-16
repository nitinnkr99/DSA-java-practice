public class PassByValue {
    public static void main(String[] args) {
//in java when an argument is given then a copy of reference variable is passed into the function and they both point
        //at the same object (or different maybe totally dependent on java in case of primitive data-types)


    String name = "noob";
    changeName(name); //output : noob
    System.out.println(name); //it should've changed the value of name variable but it didn't actually
    } //why doesn't the value changed??



    static String changeName(String x){
        //this x will be getting a copy of name reference variable
        //but here we're not changing that value by this below
        x = "another noob";
        // instead it creates a new object in heap memory and x starts pointing towards
        return x;
        //"another noob" and name still points towards the "noob" object in heap memory so there's no change in name at all
    }



    //NOTE:
    //java only has pass by value feature and not pass by reference that cpp and c has
    //only the value of a reference variable is passed as argument in a function
    //for primitives value of reference is passed only (it depends on java that both var will point towards same object or different
    //for non-primitives copy of reference is passed so both points towards same object
}
