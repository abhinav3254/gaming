class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }

    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        helper(root.right);
        list.add(root.val);
    }
}
