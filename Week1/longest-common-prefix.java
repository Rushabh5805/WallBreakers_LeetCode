class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String ans="";
        for(int i=0;i<strs[0].length();i++){
            char c= strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()>i){
                    if(c!=strs[j].charAt(i))
                        return ans;
                }
                else{
                    return ans;
                }
            }
            ans=ans+c;
        }
        return ans;
    }
}
