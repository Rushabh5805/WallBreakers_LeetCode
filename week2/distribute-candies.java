class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<candies.length;i++){
                h.add(candies[i]);
        }
        return Math.min(candies.length/2, h.size());
    }
}
