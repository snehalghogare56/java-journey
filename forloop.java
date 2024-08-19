import java.util.Scanner;

public class forloop {
    public static void main(String args[]){
        /*int i;
        for(i=1; i <=10; i++){
            System.out.println("Hello World");
        }*/
        /*int line;
        for(line=1; line <=4; line ++){
            System.out.println("****");
        }*/

       /*  Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int n=sc.nextInt();
        while(n > 0){
            int lastDigit= n % 10;
            System.out.print(lastDigit);
            n=n/10;*/

           /* Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int n=sc.nextInt();
        int rev=0;
        while(n > 0){
            int lastDigit= n % 10;
            rev=(rev * 10) + lastDigit;
           n=n/10;
        }System.out.print(rev);*/

       /*  for(int i=1; i <=5; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);*/ 

           /*  int i;
            for(i=2; i<100; i+=2){
                System.out.println(i);
            }*/

            /*int i;
            for(i=0; i<5; i++){
                System.out.println("Hello");
                i+=2;
            }*/

            Scanner sc=new Scanner(System.in);
           /*  int n=sc.nextInt();
            int  fact=1;
            int i=1;
            while(i <= n){
                fact=fact *i;
                i++;
            }
            System.out.println(fact);*/


             /* int m=1;
             System.out.print("Enter the number to print multiplication table");
            int number=sc.nextInt();
            for(int i=1; i<=10; i++){
                m= number *i;
            
                System.out.println(number+" x " + i +" = " +m);

            }*/
             // Prime or not
             int n=9;
             int flag=1;
             for(int i=2; i<n; i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
                  
                }if(flag == 1){
                    System.out.println("Prime");
                }else{
                System.out.println(n +" not Prime");
                }


            

    
        }

    }

