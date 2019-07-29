class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] needsForClass = new int[numCourses];
        int[] ans = new int[numCourses];
        int ansIndex=0;
        for(int i=0;i<prerequisites.length;i++){
            needsForClass[prerequisites[i][0]]++;
        }
        Queue<Integer> classAvailable = new LinkedList<Integer>();
        for(int i=0;i<needsForClass.length;i++){
            if(needsForClass[i]==0){
                classAvailable.add(i);
                ans[ansIndex]=i;
                ansIndex++;
            }
        }
        while(!classAvailable.isEmpty()){
            int classNo = classAvailable.poll();
            for(int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][1]==classNo){
                    needsForClass[prerequisites[i][0]]--;
                    if(needsForClass[prerequisites[i][0]]==0){
                        classAvailable.add(prerequisites[i][0]);
                        ans[ansIndex]=prerequisites[i][0];
                        ansIndex++;
                    }
                }
            }
        }
         for(int i=0;i<needsForClass.length;i++){
            if(needsForClass[i]!=0)
                return new int[0];
         }
        return ans;
    }
}
