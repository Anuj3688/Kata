package kata.arrays;

/**
 * Problem: Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock
 * on the i-th day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * <p>
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 */
public class BestTimeToBuySellStock {

//    public int solve(int[] prices) {
//        int max = 0;
//        for (int left = 0 ; left< prices.length; left++){
//            for (int right = left+1 ; right< prices.length ; right++){
//                max = Math.max(max, prices[right]-prices[left]);
//            }
//        }
//        return max;
//    }

    public int solve(int[] prices) {
        int max = 0;
        int minSoFar = Integer.MAX_VALUE;
        for (int left = 0 ; left< prices.length; left++){
            if (prices[left]<minSoFar){
                minSoFar = prices[left];
            }
            max= Math.max(max, prices[left]-minSoFar);
        }
        return max;
    }
}
