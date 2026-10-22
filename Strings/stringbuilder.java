package Strings;

public class stringbuilder {
    public static String uppercase(String s){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==' '&& i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String args[]){
        String str = "hello there how are you ?";
        StringBuilder sb = new StringBuilder("vbv");
        for(char ch = 'a';ch<'e';ch++){
           sb.append(ch);
        }
        System.out.println(sb);
        System.out.print(uppercase(str));
    }
        
    
}
