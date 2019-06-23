class Solution {
    public void reverseString(char[] s) {
        System.out.println(s.length/2);
        int j=s.length-1;
        char temp='a';
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
    }
}
