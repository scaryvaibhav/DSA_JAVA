package Arrays1;

public class pairs_array {
    public static void pairs(int nums[]){
        int n = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print(nums[i]+","+nums[j]+" ");
                n++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + n);
    }
    public static void main (String args[]){
        int nums[] = {1,4,3,7};
        pairs(nums);
    }
    
}
