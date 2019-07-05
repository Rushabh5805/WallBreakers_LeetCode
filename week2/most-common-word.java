class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");

        List<String> al1 = new ArrayList<String>(Arrays.asList(words));
        List<String> al2 = new ArrayList<String>(Arrays.asList(banned));
        al1.removeAll(al2);
        HashMap<String, Integer> map = new HashMap<>();
        int maxn=0;
        String str="";
        for(String s: al1){
            map.put(s, map.getOrDefault(s,0)+1);
            if(map.get(s)>maxn){
                maxn=map.get(s);
                str=s;
            }
        }
        return str;
    }
}
