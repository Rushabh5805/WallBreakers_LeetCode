class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        while(n%2==0){
            n=n/2;
            System.out.println(n);
            if(n==1)
                return true;
        }
        return false;
    }
}
