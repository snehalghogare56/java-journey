import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class JavaBasics {
//      public static String substring(String str,int si,int ei){
//         String substr="";
//         for(int i=si; i<ei; i++){
//             substr+=str.charAt(i);
//         }
        
// return substr;
//  }
public static String toUpperCase(String str){
    StringBuilder sb=new StringBuilder("");
    char ch= Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1; i<str.length(); i++){
        if(str.charAt(i)==' ' && i < str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
    

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        String str="hi, i am snehal";
         System.out.println(toUpperCase(str));
    



        
      
       

           
    }
}


