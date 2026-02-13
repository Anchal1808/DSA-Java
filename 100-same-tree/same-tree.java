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
    public static List<Integer> preorder(TreeNode root,List<Integer> ans){
        if(root==null){
            ans.add(null);
            return ans;
        }
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
        return ans;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p1=new ArrayList<>();
         List<Integer> q1=new ArrayList<>();
         p1=preorder(p,p1);
         q1=preorder(q,q1);
         if(p1.equals(q1)){
            return true;
         }
         return false;
    }
}