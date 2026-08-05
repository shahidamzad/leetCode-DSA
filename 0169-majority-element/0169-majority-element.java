class Solution {
    public void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
    public int majorityElement(int[] nums) {
        int n = nums.length ;

        for(int i =1 ; i < n;i++){
            int j = i ;

            while(j >= 1 && nums[j] < nums[ j - 1]){
                swap(nums , j , j - 1);
                j--;
            }
        }
        return nums[n/2];
    }
}