/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null)
            return new ArrayList<>();
        createList(root);
        arr.add(root.val);
        return arr;
    }
    public void createList(Node node){
        List<Node> l = node.children;
        if(l!=null){
            
            for(int i=0;i<l.size();i++){
                createList(l.get(i));
                arr.add(l.get(i).val);
            }
        }
        
    }
    
}
