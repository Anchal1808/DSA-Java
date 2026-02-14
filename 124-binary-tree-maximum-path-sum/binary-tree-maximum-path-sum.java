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
    private int calculateSum(TreeNode node,int[] max){
        if(node==null) 
        return 0;
        int left=calculateSum(node.left,max);
        int right=calculateSum(node.right,max);
        if(left<0){
            left=0;
        }
        if(right<0){
            right=0;
        }
        int curr=left+right+node.val;
        if(curr>max[0]){
            max[0]=curr;
        }
        return node.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int[] max=new int[]{Integer.MIN_VALUE};
        calculateSum(root,max);
        return max[0];

    }
}