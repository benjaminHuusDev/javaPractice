class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m==0) {

            int i = 0;
            for (int x : nums2) {
                nums1[i] = x;
                i++;
            }
            return;
        }

        if (n==0) {
            return;
        }

        int [] arr = new int[m+n];

        int t = 0;
        int p1 = 0;
        int p2 = 0;

        while(p1 < m && p2 < n){

            if (nums1[p1] < nums2[p2]) {
                arr[t] = nums1[p1];
                p1++;
            }

            else {
                arr[t] = nums2[p2];
                p2++;
            }
            t++;
        }
        
        while(p2 < n && t<m+n ) {
            arr[t] = nums2[p2];
            t++;
            p2++;

        }

        while(p1 < m && t<m+n) {
            arr[t] = nums1[p1];
            t++;
            p1++;
        }

        int i = 0;
        for (int x : arr) {
            nums1[i] = x;
            i++;
        }
        
    }
}