package Arrays1;

public class assgn1 {


//ques 1
  public static boolean distinct(int[ ] nums ){
    for(int i = 0;i<nums.length;i++){
        for(int j = i;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
    return false;
  }
//ques 2
  public static int targetindex(int nums[],int target){
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            return i;
        }
    }
    return -1;
  }
//ques3
  //done in buy and sell stocks

//ques 4
  //done in rainwater trapping 
//ques 5
  // public List<List<Integer>> threesum(int nums[]){

  // }

  
  public static void main (String args[]){
    int nums[] = {1,2,3,4,5,4};
    System.out.println(distinct(nums));
    System.out.println(targetindex(nums,4));
  }
    
}
