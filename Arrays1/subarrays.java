package Arrays1;

public class subarrays {
    public static void subarray(int nums[]){
        for (int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                    sum+=nums[k];
                }
                System.out.println("("+ sum+ ")");
            }

        }
    }
    public static void main (String args[]){
        int nums[] = {1,2,3,4};
        subarray(nums);
    }
    
}
