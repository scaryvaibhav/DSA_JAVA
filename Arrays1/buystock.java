package Arrays1;

public class buystock {
    public static void stock(int [] nums){
        int maxprofit = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                maxprofit = Math.max(maxprofit,(nums[j]-nums[i]));
            }
        }
        System.out.println("Maximum profit is : " + maxprofit);
    }
    public static void buystocks(int []nums){   //mam's app
       int buyprice = Integer.MAX_VALUE;
       int maxprofit = 0;

       for(int i = 0;i<nums.length;i++){
        if (buyprice<nums[i]) {
            int profit = nums[i]-buyprice;
            maxprofit = Math.max(maxprofit,profit);
        }
        else{
            buyprice = nums[i];
        }
       }
       System.out.println("max profit is : "+maxprofit);
    }
    public static void main (String args[]){
        int stocks[] = {7,1,5,3,6,4};
        stock(stocks);
        buystocks(stocks);

    }
    
    
}
