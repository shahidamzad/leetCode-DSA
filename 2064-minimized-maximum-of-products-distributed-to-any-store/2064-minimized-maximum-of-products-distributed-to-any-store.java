class Solution {
     public boolean isPossible(int maxQ, int n, int[] arr) {
        int stores = 0;

        for (int i = 0; i < arr.length; i++) {
            stores += (arr[i] + maxQ - 1)/ maxQ; 
        }

        return stores <= n;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int mx = Integer.MIN_VALUE;
        for(int ele : arr){
            mx = Math.max(mx,ele);
        }
        int low = 1 ;
        int  high = mx;
        int ans = mx;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(mid, n,arr)){
                ans = mid ;
                high = mid -1 ;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}