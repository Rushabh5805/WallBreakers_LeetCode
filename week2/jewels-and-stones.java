class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> h = new HashSet<Character>();  
        int count=0;
        for(int i=0;i<J.length();i++){
            h.add(J.charAt(i));
        }
        for(int j=0;j<S.length();j++){
            if(h.contains(S.charAt(j))){
                count++;
            }
        }
        return count;
    }
}
