class Trie {

    private class TrieNode{
        
        HashMap<Character, TrieNode> hmap;
        boolean endOfWord;
        public TrieNode(){
            hmap=new HashMap<>();
            endOfWord=false;
        }
        
    }
    
    private final TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            TrieNode node=curr.hmap.get(c);
            if(node==null){
                node=new TrieNode();
                curr.hmap.put(c, node);
            }
            curr=node;
        }
        curr.endOfWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            TrieNode node = curr.hmap.get(c);
            if(node==null){
                return false;
            }
            else{
                curr=node;
            }
        }
        
        return curr.endOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            TrieNode node = curr.hmap.get(c);
            if(node==null){
                return false;
            }
            else{
                curr=node;
            }
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
