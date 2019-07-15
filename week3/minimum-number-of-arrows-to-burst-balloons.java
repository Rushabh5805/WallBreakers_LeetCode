class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[] f,int[] s){
                return f[1]-s[1];
            }
        });
        if(points.length==0)
            return 0;
        int up=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>up){
                count++;
                up=points[i][1];
            }
        }
        return count;
    }
}
