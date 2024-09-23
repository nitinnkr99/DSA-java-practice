public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {34, 23 ,34 , 45 ,21 ,13 , 15};
        int start = 2;
        int end = 5;
        int key = 45;
        boolean ans  = rangeSearch(arr, key, start , end);
        System.out.print(ans);
    }
    static boolean rangeSearch(int[] arr , int key , int start , int end){
        if (arr.length == 0){
            return false;
        }

        for(int i = start ; i <= end ; i++){
            if (key == arr[i]){
                return true;
            }

        }
        return false;
    }
}
