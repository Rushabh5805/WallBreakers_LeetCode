class Solution {
    //HashSet<Integer> h = new HashSet<Integer>();
    int x=0;
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        int sum=0;
        while(n > 0) {
            sum += Math.pow((n % 10),2);
            n /= 10;
            
            
            
            if(n == 0) {
                if(sum == 1) break;
                if(set.contains(sum)) return false;

                set.add(sum);
                
                n = sum;
                sum = 0;
            }
        }
        return true;
    }
    
}
