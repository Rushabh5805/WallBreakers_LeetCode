class MyHashMap {
    public static class KeyVal{
        int key;
        int val;
        
        KeyVal (int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    /** Initialize your data structure here. */
    KeyVal[] map;
    public MyHashMap() {
        map = new KeyVal[1000000];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key] = new KeyVal(key, value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(map[key]!=null)
            return map[key].val;
        else
            return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key]=null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

// class MyHashMap {
    
//     KeyVal[] map;
    
//     /** Initialize your data structure here. */
//     public MyHashMap() {
//         map = new KeyVal[1000000];
//     }
    
//     /** value will always be non-negative. */
//     public void put(int key, int value) {
//         map[key] = new KeyVal(key, value);
//     }
    
//     /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
//     public int get(int key) {
//         if(map[key] != null)
//             return map[key].val;
//         else 
//             return -1;
//     }
    
//     /** Removes the mapping of the specified value key if this map contains a mapping for the key */
//     public void remove(int key) {
//         map[key] = null;
//     }

//     public static class KeyVal{
//         int key;
//         int val;
        
//         KeyVal (int key, int val){
//             this.key = key;
//             this.val = val;
//         }
//     }
// }
