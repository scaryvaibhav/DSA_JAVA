package Sorting;

public class selectionsort {
    public static void selesort(int [] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minpos]){
                    minpos=j;
                }
            }
            //swap
            int temp = nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String [] args){
        int nums[] = {5,4,1,3,2};
        selesort(nums); 
    }
    
}
