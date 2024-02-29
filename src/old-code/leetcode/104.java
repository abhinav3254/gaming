/*

How I solved this question :- 

In one line what I have done :- Compare left and right and get max 
then add 1 for the root node and return it.


Now in depth explanation :- 


int l = maxDepth(root.left);  --> This line will get the left value
int r = maxDepth(root.right); --> This line will get the right value

here only it will calculate the left and right and add 1 to it.
so every call will return 1 and from bottom 1 is comming and new 
comparison will done and then it will add more one's
due to which every time 1 value will be increased.

Don't overthink here recursion is used.

Just keep in mind :- compare left and right and add 1 to max value and return it.
 

*/


class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        // 1 for root node
        // Math.max(l,r) + 1;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l,r)+1;
        
    }
}