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
    int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHt=ht(root.left);
        if(leftHt==-1){
            return -1;
        }
        int rightHt=ht(root.right);
        if(rightHt==-1){
            return -1;
        }
        if(Math.abs(leftHt-rightHt)>1){
            return -1;
        }
        return 1+Math.max(leftHt,rightHt);

    }
    public boolean isBalanced(TreeNode root) {
        return ht(root)!=-1;
    }
}