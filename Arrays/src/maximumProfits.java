/*Stock Buy and Sell – Multiple Transaction Allowed
The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

        Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.
Input: prices[] = [4, 2, 2, 2, 4]
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2. Maximum Profit = 2.*/

public class maximumProfits {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int[] prices) {
        int total = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }

    /*public static int maximumProfit(int[] prices) {
        int total=0;
        int localmin=prices[0];
        int localmax=prices[0];
        int n=prices.length;

        int i=0;
        while(i<n-1){
            while(i<n-1 && prices[i]>=prices[i+1]){
                i++;
            }
            localmin=prices[i];
            while(i<n-1 && prices[i]<=prices[i+1]){
                i++;
            }
            localmax=prices[i];

            total+=(localmax-localmin);
        }
        return total;
    }*/

    //Brute Force method
    /*public int maximumProfit(int prices[]) {
        return maxProfit(prices, 0, prices.length-1);
    }

    public int maxProfit(int prices[], int start, int end){
        int res=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end+1;j++){
                if(prices[j]>prices[i]){
                    int curr = (prices[j]-prices[i]) +
                        maxProfit(prices, start, i-1) +
                        maxProfit(prices, j+1, end);
                    res=Math.max(res,curr);
                }
            }
        }
        return res;
    }*/
}
