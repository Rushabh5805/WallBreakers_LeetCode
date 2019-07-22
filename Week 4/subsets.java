class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        
        for(int num : nums){
            int len = res.size();
            for(int i=0;i<len;i++){
                ArrayList<Integer> tmp = new ArrayList(res.get(i));
                tmp.add(num);
                res.add(tmp);
            }
        }
        return res;
    }
}
