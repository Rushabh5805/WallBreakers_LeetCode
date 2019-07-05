class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int[] ar =new int[2];
        for(int i: nums){
            if(!h.contains(i))
                h.add(i);
            else{
                ar[0]=i;
            }
        }
        int x=nums.length;
        for(int i=1;i<=x;i++)
        {
            if(!h.contains(i)){
                ar[1]=i;
                break;
            }
            
        } 
        return ar;
    }
}
