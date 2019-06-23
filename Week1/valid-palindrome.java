class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("\\p{Punct}", "").toLowerCase();
        s=s.replaceAll(" ", "");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        System.out.println(s);
        return true;
    }
}
