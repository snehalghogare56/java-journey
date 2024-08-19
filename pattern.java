import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
       /*for(int i=1; i <=4; i++){
            for(int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();*/
            /*for(int i=1; i<=4; i++){
                for(int j=1; j<=4-i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/

           /*  for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();

            }*/

            /*char ch='A';

            for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(ch);
                    ch++;

                }
                System.out.println();
            }*/
            
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

           int row=1;
            int stars=n;
            int spaces =n-2;

            while(row <=n-1){
                if(row == 1 || row ==n-1){
                   for(int i=1; i <=stars; i++){
                    System.out.print("* ");

                   } 
                } else{ // 1 star
                    System.out.print("* ");

                    // spaces
                    for(int i=1; i<=n-2; i++){
                        System.out.print( "  ");
                    }
                   // 1 star
                    System.out.print("* ");

                }
                System.out.println();
                row++;
            }

            //Scanner sc=new Scanner(System.in);
           // int n=sc.nextInt();

           /*  int total_rows=n;
            int stars=1;
            int spaces=n-1;
            int row=1;

            while(row <=total_rows){
                //spaces
                for(int i=0; i<spaces; i++){
                    System.out.print(" ");
                }


                // stars
                for(int i=0; i<stars; i++){
                    System.out.print("*");
                }


                // go to next row
                System.out.println();
                row++;
                spaces--;
                stars++;
            }*/

            /*int row=1;
            int stars=n;
            int total_rows=n;
            int spaces=n+1;

            while(row <=total_rows){
                // numbers
                for(int i=1; i<=stars; i++){
                    System.out.print(i);
                }
                // spaces
                for(int i=2; i<=spaces; i++){
                    System.out.print(" ");
                }
                System.out.println();
                row++;
                stars--;
                spaces++;

            }*/
            /*int num=1;

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(num +" ");
                    num++;
                }
                System.out.println();
            }*/

           /*  int row=1;
            int total_rows=n;
            int stars=1;
            int spaces=n-1;
            int num=1;
            

            while(row <=total_rows){
                // stars
                for(int i=1; i<=stars; i++){
                    System.out.print(num+" ");
                    if(num==1){
                        num=0;
                    } else{
                        num=1;
                    }
                    
                
                }
                //spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print(" ");
                }
                System.out.println();
                row++;
                spaces--;
                stars++;


            }*/

          /*  int total_rows=n;
            int stars=1;
            int spaces=n-2;
            int row=1;

            while(row <=total_rows){
                //stars
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
        
                }
                //spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print("  ");
                }
                //stars
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
                }

                //go to next row
                System.out.println();
                if(row <(n/2)){
                    stars++;
                    spaces=spaces-2;
                    row++;

                }else if(row ==(n/2)){
                    row++;
                }
                    else{
                    stars--;
                    spaces=spaces+2;
                    row++;
                }

            }*/

            /*for(int i=1; i<=n; i++){
                for(int j=1; j <= n-i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
           */

           /*  int total_rows=n;
           int row=1;
           int stars=n;
           int spaces=0;

           while(row<=total_rows){
            //stars
            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }
            //spaces
            for(int i=1; i<=spaces; i++){
                System.out.print(" ");
            }
            System.out.println();
            row++;
            stars--;
            spaces++;

           }*/

          /*  int total_rows=n;
           int row=1;
           int spaces=0;
           int nums=n;

           while(row<=total_rows){
            //stars
            int num=1;
            for(int i=0; i<nums; i++){
                System.out.print(num+"  ");
                num++;
            
            }
            //spaces
            for(int i=0; i<spaces; i++){
                System.out.print("  ");
            }
            System.out.println();
            row++;
            nums--;
            spaces++;

           }*/

           /*int total_rows=n;
           int row=1;
           int stars=1;
           int spaces=n-1;

           while(row <= total_rows){
            for(int i=0; i<  stars; i++){
                System.out.print("* ");
            }
            for(int i=0; i < spaces; i++){
                System.out.print(" ");

            }
            System.out.println();
            row++;
            stars++;
            spaces--;
           }*/

           /*int total_rows=n;
           int row=1;
           int stars=1;
           int spaces=n-1;
           int num=1;

           while(row <= total_rows){
            for(int i=0; i<  stars; i++){
                System.out.print(num +" ");
                num++;
            }
            for(int i=0; i < spaces; i++){
                System.out.print(" ");

            }
            System.out.println();
            row++;
            stars++;
            spaces--;
            
           }*/

             /*int total_rows=n;
            int stars=1;
            int spaces=n-1;
            int row=1;

            while(row <=total_rows){
                //spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print(" ");
        
                }
                //stars
                for(int i=1; i<=stars; i++){
                    System.out.print("* ");
                }
                //spaces
                for(int i=1; i<=spaces; i++){
                    System.out.print("  ");
                }

                //go to next row
                System.out.println();
                if(row <(n/2)){
                    stars++;
                    spaces--;
                    row++;

                }else if(row ==(n/2)){
                    row++;
                }
                    else{
                    stars--;
                    spaces++;
                    row++;
                }

            }
        



        }*/
    }
}


