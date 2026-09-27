
class Solution {
    private  int level(TreeNode root) {
        if (root == null) return 0;
        return 1+ Math.max(level(root.left), level(root.right)) ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null ) return 0;
        int myDia = level(root.left) + level(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        return Math.max(myDia,Math.max(leftDia, rightDia));

        
    }
}