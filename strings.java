import java.util.Scanner;
public class strings {

    // public static void printlet(String str){
    //     for(int i=0; i<str.length(); i++){
    //         System.out.print(str.charAt(i) + " ");

    //     }
    // }

    // public static boolean isPalindrome(String str){
    //     for(int i=0; i<str.length()/2; i++){
    //         int n=str.length();
    //         if(str.charAt(i) != str.charAt(n-1-i)){
    //             return false;
    //         }
    //     }
    //     return true;


    // }

    // public static float spath(String path){
    //     int x=0, y=0;
    //     for(int i=0; i<path.length(); i++){
    //         char dir=path.charAt(i);
    //         if(dir == 'S'){
    //             y--;
    //         }else if(dir == 'N'){
    //             y++;
    //         }else if(dir == 'W'){
    //             x--;
    //         }else{
    //             x++;
    //         }
    //     }
    //     int x2=x*x;
    //     int y2=y*y;
    //     return (float)Math.sqrt(x2+y2);

    // }

    // public static String substring(String str, int si, int ei){
    //     String substr="";
    //     for(int i=si; i<ei; i++){
    //         substr+=str.charAt(i);
    //     }
    //     return substr;
    // }
    // public static String  toUpperCase(String str){
    //     StringBuilder sb=new StringBuilder("");
    //     char ch=Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for(int i=1; i<str.length(); i++){
    //         if(str.charAt(i)==' ' && i<str.length()-1){
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    //     }
    // public static String compress(String str){
    //     String newstr="";
    //     for(int i=0; i<str.length(); i++){
    //         Integer count=1;
    //         while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
            
    //         newstr+=str.charAt(i);
    //         if(count>1){
    //             newstr+=count.toString();

    //         }
    //     }
    //     return newstr;
    // }
    public static String compress(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
    
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count);
            }
        }
        return newstr.toString();
    }
    
    


    public static void main(String[] args) {
        
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");
        // // strings are immutable
         //Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);

        // String fullname="Tony Stark";
        // System.out.println(fullname.length());

        // String fn="Snehal";
        // String ln="Ghogare";
        // String fullname=fn + " "+ ln; 
        // // System.out.println(fullname);
        // //System.out.println(fullname.charAt(0));
        // // System.out.println(fullname + "is this");
        // printlet(fullname);
        // String str="racecar";
        // System.out.print(isPalindrome(str));
        // String s1="Tony";
        // String s2="Tony";
        // String s3=new String("Tony");
        // if(s1==s2){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }
        // if(s1.equals(s3)){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not equal");
        // }

        // String path="WNEENESENNN";
        // System.out.println(spath(path));
        // String str="HelloWorld";
        // System.out.println(str.substring(0,5));
       // System.out.println(substring(str, 0, 5));

//        String fruits[]={"apple","mango","banana"};
//        String largest=fruits[0];
//        for(int i=1; i<fruits.length; i++){
//         if(largest.compareTo(fruits[i]) < 0)
// {
//     largest=fruits[i];
// }       }

// System.out.print(largest);

    // StringBuilder sb=new StringBuilder("");
    // for(char ch='a'; ch <= 'z'; ch++){
    //     sb.append(ch);
    // }
    // System.out.println(sb);
    // System.out.println(sb.length());

    // String str="hi, i am snehal";
    // System.out.println(toUpperCase(str));

    String str="aabbbcc";
    System.err.println(compress(str));
    




    }
    

}
