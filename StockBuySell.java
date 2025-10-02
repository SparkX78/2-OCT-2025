public class StockBuySell {
    public static int profit(int[] nums){
        int buyPrice = nums[0];
        int cur_profit = 0;
        int profit1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < buyPrice){
                buyPrice = nums[i];
            }
            else{
                cur_profit = nums[i] - buyPrice;
                profit1 = Math.max(cur_profit, profit1);
            }

        }
        return profit1;
    }
    public static void main(String[] args) {
        int[] nums = {2,6,7,8,1,9,12,15};
        System.out.println(profit(nums));
    }
}
