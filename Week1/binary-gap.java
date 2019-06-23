class Solution {
    public int binaryGap(int N) {
        char[] c = Integer.toBinaryString(N).toCharArray();
        int flag=0,idx1=0,ans=0;
        for(int i=0;i<c.length;i++){
            if(flag==0&&c[i]=='1'){
                idx1=i;
                flag=1;
            }
            else if(c[i]=='1'){
                ans=Math.max(ans, i-idx1);
                idx1=i;
                
            }                
        }
        return ans;
    }
}
