class MyHashSet {
    ArrayList<Integer> ar;
    /** Initialize your data structure here. */
    public MyHashSet() {
        ar=new ArrayList<>();
    }
    
    public void add(int key) {
        for(int i:ar){
            if(i==key)
                return;
        }
        ar.add(key);
    }
    
    public void remove(int key) {
        ar.remove(new Integer(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i:ar){
            if(i==key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
