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
    int cnt(TreeNode node,int max){
        if(node==null){
            return 0;
        }
        int cntt=0;
        if(node.val>=max){
            cntt=1;
        }
        int newMax=Math.max(max,node.val);
        cntt+=cnt(node.left,newMax);
        cntt+=cnt(node.right,newMax);
        return cntt;

    }
    public int goodNodes(TreeNode root) {
        return cnt(root,root.val);
    }
}