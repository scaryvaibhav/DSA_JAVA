package Sorting;

public class bubblesort {
    public static void sort(int nums[]){
        for(int i = 0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                // if(nums[i]>nums[i+j]){
                //     int temp = nums[i];
                //     nums[i]=nums[i+j];
                //     nums[i+j]=temp;
                //     //my condition works when j loop runs till j<nums.length-i;
                // }
                //mam's condition works till j<nums.length-1-i;

                if(nums[j]>nums[j+1]){
                     int temp = nums[j];
                     nums[j]=nums[j+1];
                      nums[j+1]=temp;
                }
            }
        }
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    // best case o(n) using swap

    public static void bubblebest(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<nums.length-1-i;j++){
                if (nums[j] > nums[j + 1]) {

                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }


    }



    public static void main(String []args){
        int nums[] = {5,4,1,3,2};
        int [] vbv ={2,3,4,5};
        sort(nums);
        bubblebest(vbv);
        
    }

    
}
