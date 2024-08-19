import java.util.Scanner;

public class positive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        if(number > 0){
            System.out.println("Number is positive");
        } else{
            System.out.println("Number is negative");
        }
    }
}
