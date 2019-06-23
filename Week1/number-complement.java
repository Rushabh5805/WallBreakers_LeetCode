class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                c[i]='0';
            }
            else
                c[i]='1';
        }
        s = new String(c);
        System.out.println(s);
        return Integer.parseInt(s,2);
    }
}
