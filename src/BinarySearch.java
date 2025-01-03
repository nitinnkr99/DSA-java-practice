public class BinarySearch {
    public static void main(String[] args) {
        /*
            binary search algorithm is a faster way to find a element in a sorted array.
            Step-1 : In the given sorted array find the middle element.
            Step-2 : compare the key with middle element.
            Step-3 : If the key is smaller , element is in first half , search in left part.
            Step-4 : If the key is larger , element is in second half , search in right.
            Step-5 : Make the starting and ending point in the array where element is and again repeat from step-1.

              mid = (Start pt. + end pt.)/2
              best case = O(1)
              worst case = O(log n)
         */

        int[] ar = {12,14,16,18,20,22,24,26};
        int target = 26;
        int ans = Binarysearch(ar , target);
        //print the index of target element.
        System.out.println(ans);

    }
    static int Binarysearch(int[] arr , int target) {
        int start = 0;
        int end = ((arr.length)-1);

        while (start <= end){
            //find the middle element !!
            int mid = start + ((end-start)/2);

            if (target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid; //element or target found , return the index of targett.
            }
        }
        return -1; //if target not found in the array then this will return -1 as index

    }
}
