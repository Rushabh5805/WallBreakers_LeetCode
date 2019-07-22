class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2) -> map.get(n1)-map.get(n2));
        List<Integer> l = new ArrayList<>();
        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size()>k)
                pq.poll();
        }
        
        while(!pq.isEmpty()){
            l.add(pq.poll());
        }
        Collections.reverse(l);
        
        return l;
    }
}
