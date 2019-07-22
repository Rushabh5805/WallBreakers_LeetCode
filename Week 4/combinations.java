class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combine(1, n, k, list, res);
        return res;
    }
    public void combine(int i, int n, int k, List<Integer> list, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList(list));
        }
        else{
            for(int j = i;j<=n;j++){
                list.add(j);
                combine(j+1, n, k-1, list, res);
                list.remove(list.size()-1);
            }
        }
    }
}
