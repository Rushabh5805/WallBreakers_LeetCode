class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total=0;
        for(int i : nums){
            total+=i;
        }
        if(k<=0||k>nums.length||total%k!=0)
            return false;
        //System.out.println("return");
        return canPartition(0, nums, k, new boolean[nums.length], 0, total/k);
    }
    public boolean canPartition(int start, int[] nums, int k, boolean[] used, int tempSum, int sum){
        if(k==1)
            return true;
        
        if(tempSum==sum)
            return canPartition(0, nums, k-1, used, 0, sum);
        
        for (int i = start; i < nums.length; i++) {
            if(!used[i]&&tempSum+nums[i]<=sum){
                used[i]=true;
                if(canPartition(i+1, nums, k, used, tempSum+nums[i], sum))
                    return true;
                used[i]=false;
            }
        }
        return false;
    }
}
