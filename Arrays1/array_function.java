package Arrays1;

public class array_function {
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main (String args[]){
        int marks[] = {98,95,89};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
       }
    }
    
}
