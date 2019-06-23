class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] finalArray = new int[A.length];
        int x=0;
        for(int i=0;i<A.length;i++){
            if((A[i] & 1)==0){
                finalArray[x]=A[i];
                x++;
            }
        }
        for(int i=0;i<A.length;i++){
            if((A[i] & 1)==1){
                finalArray[x]=A[i];
                x++;
            }
        }
        return finalArray;
    }
}
