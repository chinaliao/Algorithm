package greedy;

/**
 * ClassName:BestToBuyAndSell
 * Description:
 */
public class BestToBuyAndSell {
    public int maxProfit(int[] prices) {
        if (prices == null||prices.length==0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price<minPrice){
                minPrice = price;
            }
            else if (price-minPrice>maxProfit){
                maxProfit = price-minPrice;
            }
        }
        return maxProfit;
    }
}
