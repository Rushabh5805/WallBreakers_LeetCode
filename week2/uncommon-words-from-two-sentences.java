class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        String[] result1 = new String[200];
        //String[] result = new String[10];
        int r=0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<arrayA.length;i++){
            if(!map.containsKey(arrayA[i])){
                map.put(arrayA[i],1);
            }
            else{
                map.put(arrayA[i],map.get(arrayA[i])+1);
            }
        }
        for(int j=0;j<arrayB.length;j++){
            if(!map.containsKey(arrayB[j])){
                map.put(arrayB[j],1);
            }
            else{
                map.put(arrayB[j],map.get(arrayB[j])+1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if(entry.getValue()==1){
                result1[r] = entry.getKey();
                r++;
            }
		}
        String[] result = new String[r];
        for(int y=0;y<r;y++){
            result[y]=result1[y];
        }
        return result;
    }
}
