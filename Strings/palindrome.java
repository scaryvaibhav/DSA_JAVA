package Strings;

public class palindrome {
    public static boolean check(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    } 
    //find shortest path : my app - cant travel diagonal 
    public static int shortest(String s){
        int h = 0;
        int v = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'e'){
                h++;
            }
            else if(s.charAt(i) == 'w'){
                h--;
            }
            else if(s.charAt(i) == 'n'){
                v++;
            }
            else{
                v--;
            }
        }
        return (h+v);
    }
    //along diagonal 
    public static float shortestdia(String s){
        int h = 0;
        int v = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'e'){
                h++;
            }
            else if(s.charAt(i) == 'w'){
                h--;
            }
            else if(s.charAt(i) == 'n'){
                v++;
            }
            else{
                v--;
            }
        }
        int x1 = h*h;
        int x2 = v*v;
        return (float)Math.sqrt(x1+x2);
    }
    public static void largeststring(String [] fruits ){
        String largest = fruits[0];
        for(int i = 1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
    public static void main(String [] args){
        String vbv = "racecar";
        String dire = "wneenesennn";
        System.out.println(check(vbv));
        System.out.println(shortest(dire));
        System.out.println(shortestdia(dire));
        String [] fruits = {"mango","apple","oranges","banana"};
        largeststring(fruits);

    }
    
}
