import java.util.Scanner;

public class area {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.print("Side of Square:");
        int side=sc.nextInt();
        int area=side * side;
        System.out.print("The Area od Square is :"+area);
    }
}
