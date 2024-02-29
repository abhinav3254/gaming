/*
What I thought was that whatever will be the majority it must be more than mid of the array,
so return the mid index value of the array.


Using boyer-moore-majority-voting-algorithm
time complexity of O(n) and a space complexity of O(1).

*/


class Solution {
    public int majorityElement(int[] nums) {

        // O(n log n) for sorting

        // Arrays.sort(nums);
        // return nums[nums.length/2];
        
        // Using boyer-moore-majority-voting-algorithm
        //  time complexity of O(n) and a space complexity of O(1)

        int candidate = nums[0];
        int count = 1;

        for (int i = 1;i<nums.length;i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) count++;
            else count--;
        }

        return candidate;

    }
}
