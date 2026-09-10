package Arrays1;

public class linear_search {
    public static int search(int nums[],int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                return i;
            }
        }
        return -1;

    }
    public static int largest_elem(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    } 
    public static int smallest_elem(int nums[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest = nums[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int nums[]={1,2,5,8,9,4,3};
        int x = 5;

        int index = search(nums,x);
        if (index==-1){
            System.out.println("not found");

        }
        else {
            System.out.println("found at index = " + index);
        }
        System.out.println("Largest element is : " + largest_elem(nums));
        System.out.println("Smallest element is : " + smallest_elem(nums));
        

    }
    
}
