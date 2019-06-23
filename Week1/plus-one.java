class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        int temp=0;
        if(digits[last]!=9){
            digits[last]+=1;
        }
        else{
            while(last>=0&&digits[last]==9){
                digits[last]=0;
                last--;
                if(last<0){
                    temp=1;
                }
            }
            if(temp==0)
                digits[last]+=1;
            else{
                int[] copy = new int[digits.length+1];
                copy[0]=1;
                return copy;
            }
        }
        return digits;
    }
}
