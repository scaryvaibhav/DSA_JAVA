package Arrays2D;

public class search_in_sorted {
    public static void search(int nums[][],int target){
        int r = 0;
        int c = nums[0].length-1;
        while(r<nums.length&&c>=0){
            //equal
            if(nums[r][c]==target){
                System.out.println("Found at: "+ r+","+c);
                break;
            }
            //small
            else if(nums[r][c]<target){
                //move down
                r++;
           }
           else{
                //move left
                c--;

           }

        }
        
        
    }
    public static void main(String[]args){
        int nums[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target = 10;
        search(nums,target);

    }
    
}
