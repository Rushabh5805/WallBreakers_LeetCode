class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i),t.charAt(i));
            }
            else if(h1.containsKey(s.charAt(i))){
                if(h1.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            if(!h2.containsKey(t.charAt(i))){
                h2.put(t.charAt(i),s.charAt(i));
            }
            else if(h2.containsKey(t.charAt(i))){
                if(h2.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
