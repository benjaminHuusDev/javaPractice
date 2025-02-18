class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        int p1 = 0;
        int p2 = 0;
        int i = 0;

        int[] sortedArray = new int[len1+len2];

        while(p1<len1 & p2<len2){
            
            if(nums1[p1] < nums2[p2]){
                sortedArray[i] = nums1[p1];
                i++;
                p1++;
            } else {
                sortedArray[i] = nums2[p2];
                i++;
                p2++;
            }
        }

        while(p1<len1){
            sortedArray[i] = nums1[p1];
            i++;
            p1++;
        }

        while(p2<len2){
            sortedArray[i] = nums2[p2];
            i++;
            p2++;
        }

        int mod2 = (len1 + len2)%2;

        if(mod2 == 0){
            int a = (len1 + len2)/2;
            int b = a - 1;
            return (sortedArray[a]+sortedArray[b])/2.0;
        } else {
            return sortedArray[(len1+len2-1)/2];
        }
    }
}