// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int max  = 0;
        int curr = prices[0];
        for(int i : prices) {
            if(i - curr > max) 
            max = i - curr;
            if(i - curr < 0) curr = i;
        }
        return max;
    }
}