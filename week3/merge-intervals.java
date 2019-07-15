class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][0];
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] f,int[] s){
                return f[0]-s[0];
            }
        });
        List<int[]> result = new ArrayList<int[]>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[i-1][1]){
                intervals[i][0]=intervals[i-1][0];
                intervals[i][1]=Math.max(intervals[i-1][1],intervals[i][1]);
            }
            else{
                result.add(intervals[i-1]);
            }
                    
        }
        result.add(intervals[intervals.length-1]);
        return result.toArray(new int[result.size()][]);
    }
}
