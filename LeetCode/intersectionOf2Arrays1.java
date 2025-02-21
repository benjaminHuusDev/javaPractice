class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        if(nums1.length < nums2.length){
            return intersection(nums2,nums1);
        }

        int p = 0;

        HashMap<Integer, Boolean> nums1Hash = new HashMap<Integer, Boolean>();

        while(p<nums1.length){
            nums1Hash.put(nums1[p],true);
            p++;

        }

        HashMap<Integer, Boolean> intersection = new HashMap<Integer, Boolean>();

        int arrLen = 0;
        for(int x:nums2){
            if(nums1Hash.get(x) != null & intersection.get(x) == null){
                intersection.put(x,true);
                arrLen += 1;
            }
        }

        Set<Integer> keys = intersection.keySet();


        if(arrLen > 0) {

            int[] solution = new int[arrLen];
            int i = 0;

            for(int key: keys){
                solution[i] = key;
                i++;
            }

            return solution;
            
        } else {
            return new int[0];
        }
        
    }
}