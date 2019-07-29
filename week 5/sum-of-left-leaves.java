/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        //int sum=0;
        if(root==null)
            return 0;
        add(root);
        return sum;
    }
    public void add(TreeNode node){
        if(node.left!=null){
            if(node.left.left==null&&node.left.right==null)
                sum=sum+node.left.val;
            add(node.left);
        }
        if(node.right!=null){
            add(node.right);
        }
    }
}
