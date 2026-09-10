package Arrays1;

public class binary_search {
    public static int binarysearch(int nums[],int x){
        int start = 0 , end = nums.length-1;
        while ( start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==x){
                return mid;
            }
            if(nums[mid]>x){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        

    }
    public static void main(String args[]){
        int nums[] = {2,5,7,9,13,17,19,23,28};
        int x = 2;
        System.out.println("The index of x is : " + binarysearch(nums,x));
    }

    
}
