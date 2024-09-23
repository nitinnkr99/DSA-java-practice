import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3} ,
                {4,5,6},
                {7,8,9}
        };

        int key = 7;
        int[] a = search2d(arr, key);
        System.out.println(Arrays.toString(a));

    }
    static int[] search2d(int[][] arr ,int key){
        if (arr.length == 0) {
            return new int[] {-1,-1};
        }
        for (int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if (arr[i][j] == key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
