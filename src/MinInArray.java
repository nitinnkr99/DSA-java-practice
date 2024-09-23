public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {22 , 33, 45 ,31 , 21 , 45  , 67 , 89};
        int ans = minimum(arr);
        System.out.println(ans);

    }

    static int minimum(int[] arr ){
        int ans = arr[0];
        if (arr.length == 0){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++ ){
            if (ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
