class LRUCache {
    
    class Node {
        Node prev;
        Node next;
        int key;
        int val;
    }

    Node head;
    Node tail;
    int nodesInCache;
    int capacity;
    HashMap<Integer, Node> map;
    public LRUCache(int capacity) {
        nodesInCache = 0;
        this.capacity=capacity;
        map = new HashMap<>();
        
        head = new Node();
        head.prev = null;
        
        tail = new Node();
        tail.next = null;
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node ans = map.get(key);
        if(ans == null)
            return -1;
        moveToHead(ans);
        return ans.val;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node == null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            
            map.put(key, newNode);
            ++nodesInCache;
            if(nodesInCache>capacity){
                removeLRUEntryFromStructure();
            }
            addNode(newNode);            
        }
        else{
            node.val = value;
            moveToHead(node);
        }
    }
    
    public void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    public void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }
    
    public void addNode(Node node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }
    
    public void removeLRUEntryFromStructure(){
        Node node = popTail();
        map.remove(node.key);
        --nodesInCache;
    }
    
    public Node popTail(){
        Node node = tail.prev;
        removeNode(node);
        return node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
