/*
What I thought was that whatever will be the majority it must be more than mid of the array,
so return the mid index value of the array
*/

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}
