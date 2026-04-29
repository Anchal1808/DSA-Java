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
    static class Pair {
        TreeNode node;
        int index;
        Pair(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int max = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int start = q.peek().index;
            int end = start;

            for(int i = 0; i < size; i++){
                Pair curr = q.poll();
                end = curr.index;

                if(curr.node.left != null){
                    q.add(new Pair(curr.node.left, 2 * curr.index));
                }
                if(curr.node.right != null){
                    q.add(new Pair(curr.node.right, 2 * curr.index + 1));
                }
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}