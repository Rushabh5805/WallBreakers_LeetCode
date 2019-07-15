class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int min=0, max=A.length-1;
        return binary(A, max, min);
    }
    public int binary(int[] A, int max, int min){
        int avg = (max+min)/2;
        if(A[avg]>A[avg+1]&&A[avg]>A[avg-1])
            return avg;
        else if(A[avg]>A[avg+1]){
            max=avg-1;
            return binary(A, max, min);
        }
        else if(A[avg]<A[avg+1]){
            min=avg+1;
            return binary(A, max, min);
        }
        else 
            return -1;
        
       // return 0;
            
    }
}
