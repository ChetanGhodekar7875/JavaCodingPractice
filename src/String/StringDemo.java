package String;

import java.util.Scanner;

//CHECK WHETHER THE STRING IS PALINDROME OR NOT
public class StringDemo {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENTER THE STRING");
        String originalString= scanner.next();
        String revString="";
        for(int i=0;i<originalString.length();i++){
            char ch= originalString.charAt(i);
            revString=ch+revString;
        }

        if(originalString.equals(revString)){
            System.out.println("BOTH STRINGS ARE PALINDROME");
        }else {
            System.out.println("BOTH STRINGS ARE NOT PALINDROME");
        }

    }

}
