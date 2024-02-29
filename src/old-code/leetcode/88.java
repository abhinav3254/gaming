class Main {
	public static void main(String[] args) {

		int[] nums1 = new int[]{1,2,3,0,0,0};
		int[] nums2 = new int[]{2,5,6};
		int m = 3;
		int n = 3;

		merge(nums1,m,nums2,n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// Last index of nums1
	    int i = m - 1; 
	    // Last index of nums2
	    int j = n - 1; 
	    // Last index of the merged array
	    int k = m + n - 1; 

	    while (i >= 0 && j >= 0) {
	        if (nums1[i] >= nums2[j]) {
	            nums1[k--] = nums1[i--];
	        } else {
	            nums1[k--] = nums2[j--];
	        }
	    }

	    // Copy remaining elements from nums2 to nums1, if any
	    while (j >= 0) {
	        nums1[k--] = nums2[j--];
	    }
	}

}