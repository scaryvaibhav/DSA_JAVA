package Sorting;

public class countsort {
    public static void countingsort(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int count[] = new int [max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i = 0;i<count.length;i++){
           while(count[i]>0){
            nums[j]=i;
            j++;
            count[i]--;
           }
        }
    }
       public static void printarray(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
       }


    public static void main (String args[]){
        int nums[]  ={ 1,4,1,3,2,4,3,7};
        countingsort(nums);
        printarray(nums);

    }
    
}
