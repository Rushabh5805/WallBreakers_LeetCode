class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals=0;
        for(int i=0;i<word.length();i++){
            int a = (int) word.charAt(i); 
            if(a>64&&a<91)
                capitals++;
        }
        System.out.println(capitals);
        if(capitals==0)
            return true;
        else if(capitals==word.length())
            return true;
        else if(word.charAt(0)>64&&word.charAt(0)<91&&capitals==1)
            return true;
        
        return false;
    }
}
