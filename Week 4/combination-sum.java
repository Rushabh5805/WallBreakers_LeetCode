class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        dfs(candidates, target, 0, ans, temp);
        return ans;
    }
    public void dfs(int[] candidates, int target, int i, List<List<Integer>> ans, List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList(temp));
        }    
        else{
            for(int j=i;j<candidates.length;j++){
                if(target<candidates[j])
                    return;
                temp.add(candidates[j]);
                dfs(candidates, target-candidates[j], j, ans, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
