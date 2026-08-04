class Solution {
    public void moveZeroes(int[] arr) {
        int noz = 0 ;
        int n  = arr.length ;
        for(int ele : arr){
            if(ele == 0) noz++;
        }

        for(int j = 0 ; j < noz ; j++){
            for(int i =0 ; i < n-1-j;i++){
                if(arr[i]==0){
                int temp  = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp ;
                }
            }
        }        
    }
}