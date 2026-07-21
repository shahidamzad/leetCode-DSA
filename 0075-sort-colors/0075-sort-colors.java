class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length ;
        int numberOfZero = 0 ;
        int numberOfOnes = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                numberOfZero++ ;
            }
            if(nums[i] == 1){
                numberOfOnes++ ;
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(i<numberOfZero){
                nums[i] = 0 ;
            }
            else if (i < numberOfZero + numberOfOnes){
                nums[i] = 1 ;
            }
            else{
                nums[i] = 2 ;
            } 
        }
        
    }
}