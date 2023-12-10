class Solution {
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int ans = 0;
    //     if (n%2==0) {
    //         ans = (n*(n+1))/2;
    //     } else {
    //         ans = (n*(n-1))/2;
    //     }
    //     int sum = 0;

    //     for (int i = 0;i<n;i++) {
    //         sum = sum+nums[i];
    //     }
    //     return ans-sum;
    // }
    public int missingNumber(int[] nums) {
        int m = nums.length;

        for (int i = 0; i < nums.length; i++) {
            m = m^(i ^ nums[i]);
        }

        return m;
    }

}