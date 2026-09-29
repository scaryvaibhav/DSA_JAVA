package Arrays2D;
import java.util.*;

public class spiralmatrix {
    public static List<Integer> spiral(int nums[][]){
        int minRow = 0, maxRow = nums.length-1,minCol = 0,maxCol = nums[0].length-1;
        List<Integer> sprl = new ArrayList<>();
        while(minRow<=maxRow&&minCol<=maxCol){
            //upper part top
            for(int j = minCol ; j<=maxCol;j++){
                sprl.add(nums[minRow][j]);
            }
            //right partt
            for(int i = minRow+1;i<maxRow;i++){
                sprl.add(nums[i][maxCol]);
            }
            //bottom one
            if(minRow<maxRow){
                for(int i =maxCol;i>=minCol;i--){
                sprl.add(nums[maxRow][i]);
              }
            }
            
            //left part
            if(minCol<maxCol){
                for(int j = maxRow-1;j>minRow;j-- ){
                sprl.add(nums[j][minCol]);
              }
            }
            
            minRow++;
            minCol++;
            maxRow--;
            maxCol--;
        }
        return sprl;
    }
    public static void main(String [] args){
        int nums [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> result = spiral(nums);
        System.out.println(result);
    }
}
