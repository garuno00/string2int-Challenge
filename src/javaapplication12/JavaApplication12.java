package javaapplication12;
import java.util.*;

public class JavaApplication12 {

    public static void main(String[] args) {
        
       System.out.printf("Pls input your key : ");
       Scanner inp = new Scanner(System.in);
       
       String input = inp.nextLine();
       input.trim();
       
       System.out.println();
       
       for(int i=0;i<=input.length()-1;i++){
           char a = input.charAt(i);
           
           switch(a){
               case '0' : System.out.printf("%c",a); break;
               case '1' : System.out.printf("%c",a); break;
               case '2' : System.out.printf("%c",a); break;
               case '3' : System.out.printf("%c",a); break;
               case '4' : System.out.printf("%c",a); break;
               case '5' : System.out.printf("%c",a); break;
               case '6' : System.out.printf("%c",a); break;
               case '7' : System.out.printf("%c",a); break;
               case '8' : System.out.printf("%c",a); break;
               case '9' : System.out.printf("%c",a); break;
           };
       }
       
       System.out.println();
       System.out.println();
       
    }
}
