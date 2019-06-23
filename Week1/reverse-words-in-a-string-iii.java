class Solution {
    public String reverseWords(String s) {
        if(s.equals(""))
            return s;
        char[] c = s.toCharArray();
        int start=0;
        int end=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                c=reverseWord(start, i-1, c);
                start=i+1;
            }
        }
        c=reverseWord(start, s.length()-1,c);
        return new String(c);
    }
    public char[] reverseWord(int start, int end, char[] c){
        int j=start, k=end;
        int x=((k-j)/2);
        for(int i=0;i<=x;i++){
            char temp=c[j];
            c[j]=c[k];
            c[k]=temp; 
            j++;
            k--;
        }
        return c;
    }
}
