class Solution {
    private class TrieNode{
        
        HashMap<Character, TrieNode> hmap;
        boolean endOfWord;
        public TrieNode(){
            hmap=new HashMap<>();
            endOfWord=false;
        }
        
    }
    
    private TrieNode root;
    
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
    
    public String longestWord(String[] words) {
        root=new TrieNode();
        for(String w:words){
            insert(w);
        }
        Arrays.sort(words, Collections.reverseOrder());
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int len=0;
        String retword="";
        int flag;
        for(int i=words.length-1;i>=0;i--){
            flag=0;
            for(int j=words[i].length()-1;j>0;j--){
                String s = words[i].substring(0, j);
                if(!search(s)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return words[i];
            }
                
        }
        return retword;
    }
}
