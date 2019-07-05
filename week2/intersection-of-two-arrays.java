class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count=0; 
        for(int i=0;i<nums1.length;i++){
            if(!h.containsKey(nums1[i]))
                h.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(h.containsKey(nums2[i])){
                h.put(nums2[i],2);
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        //int[] arr =new int[count];
        for(Map.Entry<Integer, Integer> entry: h.entrySet()){
            if(entry.getValue()==2){
                a.add(entry.getKey());
            }
        }
        int x=0;
        int[] arr =new int[a.size()];
        for (Integer i : a) {
            arr[x]=i;
            x++;
        }
             
        return arr;
    }
}
