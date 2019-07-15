class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int[] arr = new int[prices.length];
        int min=prices[0];
        for(int i = 1;i<prices.length;i++){
            arr[i] = Math.max(arr[i-1], prices[i]-min);
            min=Math.min(min, prices[i]);
        }
        return arr[arr.length-1];
    }
}
