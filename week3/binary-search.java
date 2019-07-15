class Solution {
    public int search(int[] nums, int target) {
        int min=0, max=nums.length-1;
        return binary(nums, max, min, target);
        
    }
    public int binary(int[] nums, int max, int min, int target){
        int avg = (max+min)/2;
        System.out.println(max+" "+min);
        if(target==nums[avg])
            return avg;
        else if(max==min)
            return -1;
        else if(target<nums[avg]){
            max=avg-1>-1?avg-1:0;
            return binary(nums, max, min, target);
        }
        else{
            min=avg+1;
            return binary(nums, max, min, target);
        }
    }
}
