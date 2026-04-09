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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        // loop till queue empty nh ho mtlb queue empty nh hai 
        while(!q.isEmpty()){
            // it decide the loop till the elements in one level
           int size=q.size();
        //    becoz its only one time poll if size is 2 thats why need to change so it shoulb be inside loop
        //    TreeNode curr=q.poll();
           List<Integer> levelElement=new ArrayList<>();
           for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            levelElement.add(curr.val);
            if(curr.left!=null){
            q.add(curr.left);
           }
           if(curr.right!=null){
            q.add(curr.right);
           }
           }
        //    kyuki curr change ho rha hai loop ke andr to value left right map nhnkar payega isliye ander hoga loop ke 
        //    if(curr.left!=null){
        //     q.add(curr.left);
        //    }
        //    if(curr.right!=null){
        //     q.add(curr.right);
        //    }
           res.add(levelElement);
        }
        return res;
    }
}