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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
     public boolean isMirror(TreeNode LeftNode,TreeNode RightNode){
        if(LeftNode==null && RightNode==null){
            return true;
        }
        if(LeftNode==null || RightNode==null){
            return false;
        }
        if(LeftNode.val != RightNode.val){
            return false;
        }
        return isMirror(LeftNode.left,RightNode.right) && isMirror(LeftNode.right,RightNode.left);
     }
}
