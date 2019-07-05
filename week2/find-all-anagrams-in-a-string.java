class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int x=p.length();
        //HashMap<Integer, String> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        int r=s.length();
        p = new String(xy(p.toCharArray()));
        for(int i=0;i<r-x+1;i++){
            String y = new String(xy(s.substring(i,i+x).toCharArray()));
            if(y.equals(p))
                l.add(i);
        }        
        return l;
    }
    public char[] xy(char[] x){
        Arrays.sort(x);
        return x;
    }
}
