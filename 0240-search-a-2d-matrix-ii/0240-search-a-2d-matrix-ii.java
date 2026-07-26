class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length ;
        int n = arr[0].length;

        int row = 0;
        int cols = n-1 ;

        while(row < m && cols >= 0){
            if(arr[row][cols]==target){
                return true;
            }else if(arr[row][cols] > target){
                cols--;
            }else row++;
        }

        
        return false;
    }
}