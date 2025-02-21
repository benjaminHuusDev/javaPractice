class Solution {
    public int search(int[] nums, int target) {

        int p = nums.length /2;
        int[] range = {0, nums.length-1};
        
        while(p>=range[0] & p<=range[1]){

            if(nums[p]==target){
                return p;

            } else if(nums[p]<target){
                range[0] = p + 1;
                p = p + (range[1]+1-p)/2;
            } else {
                range[1] = p - 1;
                p = p - (p + 1 - range[0])/2;
            }
        }  
        return -1;
    }
}