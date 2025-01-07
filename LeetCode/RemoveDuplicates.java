class RemoveElement {

    public int removeDuplicates(int[] nums) {

        int p = 1;
        int f = 1;
        int val = nums[0];

        while(f<nums.length){

            if(nums[f] == val){
                f++;
            }

            else {
                nums[p] = nums[f];
                val = nums[p];
                f++;
                p++; 
            }
        }
        return p;   
    }
}