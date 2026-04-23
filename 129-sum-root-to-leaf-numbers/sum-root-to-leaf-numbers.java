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
    int sum(TreeNode node,int curr){
        if(node==null){
            return 0;
        }
        curr=curr*10+node.val;
        if(node.left==null&&node.right==null){
            return curr;
        }
        int left=sum(node.left,curr);
         int right=sum(node.right,curr);
        return left+right;
    }
    public int sumNumbers(TreeNode root) {
        int totalSum=sum(root,0);
        return totalSum;
}
}