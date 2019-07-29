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
    int len;
    public int diameterOfBinaryTree(TreeNode root) {
        len = 0;
        if(root==null) return 0;
        calLen(root);
        return len-1;
    }
    public int calLen(TreeNode node){
        if(node==null) return 0;
        int l=calLen(node.left);
        int r=calLen(node.right);
        len = Math.max(l+r+1, len);
        return Math.max(l,r)+1;
    }
}
