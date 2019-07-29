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
    public int longestUnivaluePath(TreeNode root) {
        len=0;
        if(root==null)
            return 0;
        findLength(root, root.val);
        return len;
    }
    public int findLength(TreeNode node, int val){
        if(node==null) return 0;
        int leftLen=findLength(node.left, node.val);
        int rightLen=findLength(node.right, node.val);
        len=Math.max(len, leftLen+rightLen);
        if(node.val==val){
            return Math.max(leftLen, rightLen)+1;
        }
        
        return 0;
    }
}
