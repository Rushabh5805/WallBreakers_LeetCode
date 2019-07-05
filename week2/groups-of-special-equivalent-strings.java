class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            String st=new String(sortSp(A[i].toCharArray()));
            set.add(st);
        }
        return set.size();
    }
    public char[] sortSp(char[] st){
        char temp;
        for(int i=0;i<st.length-1;i++){
            for(int j=i+1;j<st.length;j++){
                if(i%2==j%2&&st[i]>st[j]){
                    temp=st[i];
                    st[i]=st[j];
                    st[j]=temp;
                }
            }
        }
        return st;
    }
}
