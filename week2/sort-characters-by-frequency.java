class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for(char ch : s.toCharArray()){        	
            map.put(ch,map.getOrDefault(ch, 0) + 1);
            if(map.get(ch)>max)
                max=map.get(ch);
        }
        
        StringBuilder ans= new StringBuilder();
        for(int i=max;i>0;i--){
            if(map.containsValue(i)){
                for(Map.Entry<Character, Integer> e : map.entrySet()){
                    if(e.getValue()==i){
                        for(int x=0;x<i;x++){
                            ans.append(e.getKey());
                        }
                    }
                }
            }
        }
        return ans.toString();
    }
}
