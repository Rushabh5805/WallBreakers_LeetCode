class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length();
        int x=0,y=0;
        while(i<j){
            if("AEIOUaeiou".indexOf(s.charAt(i)) >= 0){
                x=i;
                do{
                    j--;    
                }while("AEIOUaeiou".indexOf(s.charAt(j)) < 0);
                s=swap(s,i,j);            
            }   
            i++;
        }
        return s;
    }
    public String swap(String s, int i, int j){
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
        return new String(c);
    }
}
