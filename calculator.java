import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter Operator:");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+': System.out.println("Addition:" + (a + b));
            break;
            case '-': System.out.println("Subtraction:"+(a - b));
            break;
            case '*': System.out.println("Multiplication:"+(a * b));
            break;
            case '/': System.out.println("Division:"+(a / b));
            break;
            case '%': System.out.println("Modula:"+(a % b));
            break;
            default: System.out.println("My calculator is not that advance");

        }
    }
}
