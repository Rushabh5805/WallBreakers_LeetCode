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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        getRootNodes(root1, l1);
        getRootNodes(root2, l2);
        return l1.equals(l2);
    }
    public void getRootNodes(TreeNode node, List<Integer> leaves){
        if(node!=null){
            if(node.right==null&&node.left==null)
                leaves.add(node.val);
            getRootNodes(node.left, leaves);
            getRootNodes(node.right, leaves);
        }
    }
}
