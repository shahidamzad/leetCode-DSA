
class Solution {
    private int dia ;
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        dfs(root);
        return dia;
        
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

       int leftD = dfs(root.left);
       int  rightD = dfs(root.right);
        dia = Math.max(dia,leftD+rightD);
        return 1 + Math.max(leftD , rightD);
    }
}