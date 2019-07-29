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
    int val, maxDepth;
    public int findBottomLeftValue(TreeNode root) {
        val=root.val;
        maxDepth=0;
        leftTree(root, maxDepth);
        return val;
    }
    public void leftTree(TreeNode node, int depth){
        if(node==null) return;
        if(depth>maxDepth){
            maxDepth=depth;
            val=node.val;
        }
        leftTree(node.left, depth+1);
        leftTree(node.right, depth+1);
    }
}
