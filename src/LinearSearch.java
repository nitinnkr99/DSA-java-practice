public class LinearSearch {
    public static void main(String[] args) {
        //SEARCHING : finding a key in a sorted/unsorted array and return the index of key
        //if key is found return Index otherwise return -1
        int[] arr = {2, 4 , 6 , 8 ,10 , 12 , 14 ,16 , 18};
        int ans = linearSearch(arr, 6);
        System.out.println(ans); //this ill print 2 ie index of 6

        //suppose u gave a value which is not actually in the arr :
        int ans2 = linearSearch(arr , 9); //returns -1
        System.out.println(ans2);
    }

    static int linearSearch(int[] arr , int key){
        if (arr.length == 0){
            return -1;
        }

        for(int index = 0 ; index<arr.length ; index++){
            if(arr[index] == key){
                return index; //return the index at which key is found
            }
        }


        return -1; //this will only be executed if value is not found
    }
}
