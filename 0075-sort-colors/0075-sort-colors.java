class Solution {
    public void sortColors(int[] arr) {
         int n = arr.length;

        int mid = 0 , low = 0 , high = n -1 ;

        while(mid <= high){
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp ;
                low++; mid++;
            }
            else if (arr[mid] == 1) mid++ ;
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp ;
                high--;
            }
        }
        
    }
}