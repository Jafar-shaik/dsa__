package others;

public class StocksProblem {
    public static void main(String[] args ){
        int[] prices = {7,1,5,3,6,4};
        int ans = findMaxProfit(prices);
        System.out.println(ans);
    }

    static int findMaxProfit(int[] prices){
        int minPrize = prices[0];
        int maxProfit = 0;
        int currentPrize = 1;
        while(currentPrize < prices.length){
            int tempProfit = prices[currentPrize] - minPrize;
            if(tempProfit > maxProfit){
                maxProfit = tempProfit;
            }
            if(prices[currentPrize] < minPrize ){
                minPrize = prices[currentPrize];
            }
            currentPrize++;
        }
        return maxProfit;
    }
}

//7,1,5,3,6,4