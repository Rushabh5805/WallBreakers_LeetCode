class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        if(total%2!=0)
            return false;
        return canPartition(nums, 0, 0, total, new HashMap<String, Boolean>());
    }
    public boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String, Boolean> state){
        String str = index+""+sum;
        if(state.containsKey(str))
            return state.get(str);
        if(sum==total/2)
            return true;
        if(sum>total/2||index>=nums.length)
            return false;
        boolean a = canPartition(nums, index+1, sum, total, state)||canPartition(nums, index+1, sum+nums[index], total, state);
        state.put(str, a);
        return a;
    }
}
