class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sA = s.toCharArray(); 
        char[] tA = t.toCharArray(); 
        Arrays.sort(sA);
        Arrays.sort(tA);
        s=new String(sA);
        t=new String(tA);
        if(s.equals(t))
            return true;
        return false;
    }
}
