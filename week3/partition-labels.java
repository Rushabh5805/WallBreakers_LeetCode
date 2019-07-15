class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ar = new ArrayList<>();
        int i = S.lastIndexOf(S.charAt(0));
        int ans=0;
        int j=0;
        while(i<S.length()){
            i=partition(S, i, j);
            ar.add(i+1-j);
            if(i==S.length()-1)
                break;
            if(i+1<S.length()){
                j=i+1;
                i=S.lastIndexOf(S.charAt(i+1));
            }            
        }
        return ar;
    }
    public int partition(String S, int length, int j){
        int max=length;
        for(int i=j;i<length+1;i++){
            if(S.lastIndexOf(S.charAt(i))>max){
                max=S.lastIndexOf(S.charAt(i));
                length=S.lastIndexOf(S.charAt(i));
            }
        }
        return max;
    }
}
