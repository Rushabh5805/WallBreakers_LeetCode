class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char a = 'A';
        for(int i=1;i<=26;i++){
            map.put(a, i);
            a++;
        }
        int col =0;
        for(int i=0;i<s.length();i++){
            col = col*26+map.get(s.charAt(i));
        }
        return col;
    }
}
