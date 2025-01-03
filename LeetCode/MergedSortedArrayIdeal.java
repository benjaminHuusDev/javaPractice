public class MergedSortedArrayIdeal {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;

        for (int x = m + n - 1; x >=0; x--){
            if (p1 >=0 && p2 >=0){
                nums1[x] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            }

            else if (p1 >=0) {
                nums1[x] = nums1[p1--];
            }

            else {
                nums1[x] = nums2[p2--];
            }
        }
    }
}
