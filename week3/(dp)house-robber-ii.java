class Solution {
    public int rob(int[] nums) {
        int nums1, nums2;
        int[] numsX = nums.clone();
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return nums[0];
        else {
            nums1 = maxNum(numsX, 0, nums.length-1);
            nums2 = maxNum(nums, 1, nums.length);
        }
    return Math.max(nums1, nums2);
    }
    
    public int maxNum(int[] numsA, int start, int end){
        if(start==1)
            numsA[0]=0;
        for(int i=start;i<end;i++){
            if(i==1)
                numsA[i]=Math.max(numsA[0], numsA[1]);
            else if(i>=2)
                numsA[i] = Math.max(numsA[i-2]+numsA[i], numsA[i-1]);
        }
        if(start==0)
            return numsA[numsA.length-2];
        return numsA[numsA.length-1];
    } 
}
