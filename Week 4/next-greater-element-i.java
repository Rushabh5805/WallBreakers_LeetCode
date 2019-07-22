class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int nums : nums2){
            while(!s.isEmpty()&&nums>s.peek()){
                map.put(s.pop(), nums);
            }
            s.push(nums);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i]=map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
