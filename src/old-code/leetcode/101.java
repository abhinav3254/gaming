/*

To check if a binary tree is symmetric, we need to compare its left subtree 
and right subtree. To do this, we can traverse the tree recursively and 
compare the left and right subtrees at each level. If they are symmetric, 
we continue the traversal. Otherwise, we can immediately return false.



Approach
We can define a recursive helper function that takes two nodes as input, 
one from the left subtree and one from the right subtree. The helper 
function returns true if both nodes are null, or if their values are equal 
and their subtrees are symmetric.


Time complexity:The time complexity of the algorithm is O(n)O(n)O(n), 
where n is the number of nodes in the binary tree. We need to visit 
each node once to check if the tree is symmetric.


Space complexity:
The space complexity of the algorithm is O(h)O(h)O(h), 
where h is the height of the binary tree. In the worst case, 
the tree can be completely unbalanced, and the recursion stack can go 
as deep as the height of the tree.


*/



class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;
        return helper(root.left,root.right);
        
    }

    private boolean helper(TreeNode l,TreeNode r) {
        if (l == null && r == null) return true;
        else if (l == null || r == null || l.val != r.val ) return false;
        if (helper(l.left,r.right) && helper(l.right,r.left)) return true;
        else return false;
    }
}