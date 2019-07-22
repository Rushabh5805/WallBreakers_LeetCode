class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        permute(nums, l, 0);
        return l;
    }
    public void permute(int[] nums, List<List<Integer>> l, int i){
        if(i==nums.length-1){
            ArrayList<Integer> ar = new ArrayList<>();
            for(int x=0;x<nums.length;x++){
                ar.add(nums[x]);
            }
            l.add(ar);
            return;
        }
        for(int x=i;x<nums.length;x++){
            swap(nums, i, x);
            permute(nums, l, i+1);
            swap(nums, i, x);
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
