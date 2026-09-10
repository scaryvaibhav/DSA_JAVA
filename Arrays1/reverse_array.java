package Arrays1;

public class reverse_array {
    public static void reversearray(int nums[]){
        int start=0,end=nums.length-1;
        int temp = 0;
        while(end>start){
            temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    public static void main(String args[]){
        int nums[]={1,3,5,8,9,12,4,15,17};
        reversearray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
