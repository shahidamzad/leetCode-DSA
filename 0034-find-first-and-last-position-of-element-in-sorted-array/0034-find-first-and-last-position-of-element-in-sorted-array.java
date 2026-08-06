class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int n = arr.length;
        int low = 0 ;
        int high = n-1 ;
        boolean flag = false;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                flag = true ;
                break;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }  

        }
        if(flag == false) return ans;
        // lower bound
        low = 0;
        high = n - 1;
      int   lowerBound = n ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                lowerBound = mid;
                high = mid - 1 ;
            }
            else  low = mid + 1 ;
        }
        ans[0] = lowerBound;

        // upper Bound
        low = 0;
        high = n - 1;
        int upperBound = n ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                upperBound = mid;
                high = mid - 1;
            }
            else low = mid + 1 ;
        }
        ans[1] = upperBound - 1;
        return ans;
    }
}