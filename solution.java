import java.util.Scanner;

public class solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature:");
        float temp=sc.nextFloat();
        if(temp > 100){
            System.out.println("You have a fever");
        } else{
            System.out.println("You don't have a fear");
        }
    }
}
