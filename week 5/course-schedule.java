class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] needsForClass = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            needsForClass[prerequisites[i][0]]++;
        }
        Queue<Integer> classAvailable = new LinkedList<Integer>();
        for(int i=0;i<needsForClass.length;i++){
            if(needsForClass[i]==0)
               classAvailable.add(i);
        }
        while(!classAvailable.isEmpty()){
            int classNo = classAvailable.poll();
            for(int i=0;i<prerequisites.length;i++){
                if(prerequisites[i][1]==classNo){
                    needsForClass[prerequisites[i][0]]--;
                    if(needsForClass[prerequisites[i][0]]==0)
                        classAvailable.add(prerequisites[i][0]);
                }
            }
        }
         for(int i=0;i<needsForClass.length;i++){
            if(needsForClass[i]!=0)
                return false;
         }
        return true;
    }
}
