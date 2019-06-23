class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
           if(selfDividing(i)){
               list.add(i);
           } 
        }
        return list;
    }
    public boolean selfDividing(int num){
        int r=0;
        for(int j=num;j>0;j=j/10){
            r=j%10;
            if(r==0){
                return false;
            }
            if(num%r!=0){
                return false;
            }
        }
        return true;
    }
}
