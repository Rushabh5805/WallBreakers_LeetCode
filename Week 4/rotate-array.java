class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0)return;
        Queue<Integer> q = new LinkedList<Integer>(); 
        for(int i=nums.length-1;i>=0;i--){
            q.add(nums[i]);
        }
        int x=0;
        while(k>0){
            x = q.peek();
            q.remove();
            q.add(x);
            k--;
        }
        for(int j=nums.length-1;j>=0;j--){
            nums[j] = q.poll();
        }
    }
}
