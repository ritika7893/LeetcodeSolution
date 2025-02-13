/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight=Depth(root.left);
        int rightHeight=Depth(root.right);
        if(Math.abs(leftHeight-rightHeight)<=1 && isBalanced(root.left)&&isBalanced(root.right)){
            return true;
        }
        return false;
    }
    public int Depth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int maxLeft=Depth(root.left);
        int maxRight=Depth(root.right);
        return Math.max(maxLeft,maxRight)+1;
    }
}
