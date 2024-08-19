import java.util.Scanner;

public class functions {

    /*public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }
    public static void main(String args[]){
        printHelloWorld();

    }*/

    /*public static int CalculateSum(int num1, int num2){
        
        int sum=num1 + num2;
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        int sum=CalculateSum(a, b);
        System.out.printf("Sum is: "+ sum);
    }*/

   /*  public static void swap(int a, int b){
       int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after Swapping"+ a);
        System.out.println("Value of b after Swapping" + b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);

        // System.out.println("Value of a after Swapping"+ a);
        // System.out.println("Value of b after Swapping" + b);
    }*/

    /*public static int Product(int a, int b){
        int mul =a * b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=Product(a, b);
        System.out.println("Product:"+mul);
        mul=Product(20,20);
        System.out.println("Product is :"+mul);
    }*/

    /*public static int Factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
         fact= fact * i;
        }
        return fact;
        
    }
    public static int binCoeff(int n, int r){
        int  nfact=Factorial(n);
        int rfact=Factorial(r);
        int nmrfact=Factorial(n-r);
        int bincoeff=(nfact)/(rfact*nmrfact);
        return bincoeff;
     }
    public static void main(String args[]){
        int n=5;
        int fact=Factorial(n);
       // System.out.println("The factorial of is: "+fact); 
        System.out.println(binCoeff(5, 2));
    }*/

    
    

     public static int sum(int a, int b){
        return a+b;
    }
     public static int sum(int a, int b, int c){
        return a+b+c;
     }
    
    public static float sum(float a, float b, float c){
        return a+b+c;
    }

         public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(1.2f,2.4f,4.7f));
         }
}
