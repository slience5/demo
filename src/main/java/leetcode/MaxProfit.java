package leetcode;

public class MaxProfit {

    public static void main(String[] args) {
        
    }
    
    public static int maxProfit(int[] prices) {
        if(prices.length <=0) {
            return 0;
        }
        
        int start = 0;
        int loc = 0;
        for(int i=0; i<prices.length; i++) {
            int profit = 0;
            while(i <= prices.length) {
                start = prices[0];
                loc = i+1;
                if(start < prices[loc]) {
                    profit += prices[loc] - start;
                    
                }
                
            }
        }
        
        return 0;
    }
}
