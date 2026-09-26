
class Solution {
    static List<Integer> ans;
     private void preOrder(TreeNode root){
       if (root == null) return;
      ans.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
    ans = new ArrayList<>();

    preOrder(root);
    return ans;
        
    }
}