class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int i = 0;
        int a = 0;
        int[] arr = new int[nums.length];

        for(int x=0; x < nums.length; x++){
            if(nums[x] == val){i++;}
            else {

                arr[a] = nums[x];
                a++;
            }
        }

        for(int x = 0; x < nums.length; x++){
            nums[x] = arr[x];
        }
        
        return nums.length - i;
    }

}