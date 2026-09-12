package Arrays1;

public class maxsubarray {
    public static void maxsubarr_brute(int nums[]){
        
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length ; i++){
            for(int j = i+1;j<nums.length ;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                maxsum = Math.max(maxsum,sum);

            }
        }
        System.out.println("Maximum sum of the subarray by brute is: "+maxsum);
    }
    public static void maxsubarr_prefix(int nums[]){
        int sum = 0;

        int maxsum = Integer.MIN_VALUE;
        int pre[]= new int[nums.length];
        pre[0]=nums[0];

        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+nums[i];

        }
        for (int i = 0;i<nums.length ; i++){
            for(int j = i+1;j<nums.length ;j++){
                sum=i==0?pre[j]:pre[j]-pre[i-1];
                if(sum>maxsum){
                     maxsum=sum;
                }      
            }

        }
        System.out.println("Maximum sum of the subarray by prefix array is: "+maxsum);
        
    }
    public static void maxsubarr_kadane(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;
        //my method
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0&&cs>0){
                cs+=nums[i];
            }
            if(nums[i]>0){
                cs+=nums[i];
                ms=Math.max(ms,cs);
            }
        }
        //mam's method - before if loop inside for loop : cs = cs+nums[i] then : if(nums[i]<0):cs = 0; ms = math.max(ms.cs);
        // for(int i=0;i<nums.length;i++){
        //     cs=cs+nums[i];
        //     if(nums[i]<0){
        //         cs=0;
        //     }
        //     ms=Math.max(ms,cs);
        // }



        System.out.println("The max sum of subarray by kadane's is :  "+ms);

    }


    public static void main (String args[]){
        int nums[] = {1,-2,6,-1,3};
        int vbv[] = {-2,-3,4,-1,-2,1,5,-3};
        maxsubarr_brute(nums);
        maxsubarr_prefix(nums);
        maxsubarr_kadane(vbv);

    }
    
    
}
