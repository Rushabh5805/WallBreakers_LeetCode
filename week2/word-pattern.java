class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> h1 = new HashMap<>();
        HashMap<String, Character> h2 = new HashMap<>();
        String[] str1 = str.split(" ");
        if(str1.length!=pattern.length())
            return false;
        System.out.println(str1.length);
        for(int i=0;i<pattern.length();i++){
            if(!h1.containsKey(pattern.charAt(i))){
                h1.put(pattern.charAt(i),str1[i]);
                
            }
            else if(h1.containsKey(pattern.charAt(i))){
                if(!h1.get(pattern.charAt(i)).equals(str1[i])){
                    //System.out.println(pattern.charAt(i)+" "+h1.get(pattern.charAt(i))+" "+str1[i]);
                    return false;
                }
            }
            if(!h2.containsKey(str1[i])){
                h2.put(str1[i],pattern.charAt(i));
            }
            else if(h2.containsKey(str1[i])){
                if(h2.get(str1[i])!=pattern.charAt(i)){
                    //System.out.println("2");
                    return false;
                }
            }
        }
        return true;
    }
}
