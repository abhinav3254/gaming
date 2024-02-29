/*

The sorting approach sorts the array in ascending order and then checks for adjacent elements that are the same. 
If any duplicates are found, it returns true. Sorting helps in bringing duplicates together, simplifying the check. However, sorting has a time complexity of O(n log n).

Used HashSet because it reduces the time complexity from O(nlogn) to O(n).

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // getting TLE error

        // for (int i =0;i<nums.length;i++) {
        //     for (int j = i+1;j<nums.length;j++) {
        //         if (nums[i] == nums[j]) return true;
        //     }
        // }

        // return false;


        // not full optomized
        // Arrays.sort(nums);

        // for (int i = 1;i<nums.length;i++) {
        //     if (nums[i] == nums[i-1]) return true;
        // }
        // return false;

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
