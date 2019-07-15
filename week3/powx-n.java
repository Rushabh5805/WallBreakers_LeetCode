class Solution {
    public double myPow(double x, int n) {
        if(n==-2147483648){
            if(x==1.0||x==-1.0)
                return 1.0;
            else 
                return 0.0;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        double res=0;
        if(n==0)
            return 1.0;
        else if(n==1)
            return x;
        else{
            if(n%2==0){
                res=myPow(x,n/2);
                res*=res;
                return res;
            }
            else{
                res=myPow(x,n-1);
                res*=x;
                return res;
            }
        }           
    }
}
