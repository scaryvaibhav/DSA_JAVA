package Strings;
import java.util.*;

public class basic_string {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();  // just take a string word in input
        sc.nextLine();
        System.out.print("Enter your full name: ");
        String fullname = sc.nextLine(); //takes whole line of string
        System.out.println(name);
        System.out.println(fullname);
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+ " ");
        }
        sc.close();
    }
}
