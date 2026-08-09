class Solution {
    public boolean isPossible(int c ,int[] arr , int d){
        int load = 0;
        int days = 1 ;
        for(int  i = 0 ; i < arr.length ;i++ ){
            if(load + arr[i] <= c){
                load += arr[i];
            }
            else{ 
             days++;
            load = arr[i];
            }

        }
        return days <= d ;
    }
    public int shipWithinDays(int[] arr, int d) {
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int num:arr){
            mx = Math.max(mx,num);
            sum +=num;
        }

        int low = mx ;
        int high = sum;
        int minC = sum;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(mid,arr,d)){
                minC = mid ;
                high = mid - 1;
            }
            else low = mid + 1; 
        }
        return minC ;
    }
}