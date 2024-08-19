public class fpattern {

    /*public static void hollow_reactangle(int totalrows, int totalcols){
        for(int i=1; i<=totalrows; i++){
            for (int j=1; j<=totalcols; j++){
                if(i==1 || i==totalrows || j==1 || j==totalcols) {
                    //Condition to check the edges of rectangle.
                    System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    hollow_reactangle(4, 5);
}*/

/* public static void  printPattern(int n) {


            int total_rows=n;
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
            }
        }
            public static void main(String [] args){
            
           printPattern(4);
            }*/

/* public static void printpattern(int n){
    int total_rows=n;
    int row=1;
    int nums=n;
    int spaces=0;
    while(row<=total_rows){
        int num=1;

        for(int i=1; i<=nums; i++){
            System.out.print(num);
            num++;
        }
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        System.out.println();
        row++;
        spaces++;
        nums--;
}

}
public static void main(String [] args){
    printpattern(5);
}*/

/* public static void printpattern(int n){
    int total_rows=n;
    int num=1;
    int row=1;
    int nums=1;
    int spaces=n-1;
    while(row<=total_rows){
        

        for(int i=1; i<=nums; i++){
            System.out.print(num+" " );
            num++;
        }
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        System.out.println();
        row++;
        spaces--;
        nums++;
}

}
public static void main(String [] args){
    printpattern(5);
}*/
/* public static void printpattern(int n){
    int total_rows=n;
    int num=1;
    int row=1;
    int nums=1;
    int spaces=n-1;
    while(row<=total_rows){
        

        for(int i=1; i<=nums; i++){
            System.out.print(num+" ");
            if(num==1){
           num=0;
            }
            else{
                num=1;
            }
           }
            
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
        }
        System.out.println();
        row++;
        spaces--;
        nums++;
}

}
public static void main(String [] args){
    printpattern(5);
}*/

/* public static void printpattern(int n){
    int total_rows=n;
    int stars=1;
    int row=1;
    int spaces=n-2;
    while(row<=total_rows){
    
        for(int i=1; i<=stars; i++){
            System.out.print("* ");
           }
            
        for(int j=1; j<=spaces; j++){
            System.out.print("  ");
        }
        for(int i=1; i<=stars; i++){
            System.out.print("* ");
           }
        System.out.println();
        if(row< (n/2)){
        row++;
        spaces=spaces-2;
        stars++;
        }else if(row == (n/2)){
            row++;
        }else{
            row++; 
            spaces=spaces+2;
            stars--;
        }
}

}
public static void main(String [] args){
    printpattern(8);
}*/

/*public static void printpattern(int n){
    int total_rows=n;
    int stars=n;
    int row=1;
    int spaces=n-1;
    while(row<=total_rows){
    
        for(int i=1; i<=spaces; i++){
            System.out.print(" ");
           }
            
        for(int j=1; j<=stars; j++){
            System.out.print("*");
        }
        for(int i=1; i<=spaces; i++){
            System.out.print(" ");
           }
        System.out.println();
        row++;
        spaces--;
}

}
public static void main(String [] args){
    printpattern(5);
}*/
/* public static void printpattern(int n){
    int total_rows=n;
    int stars=n;
    int row=1;
    int spaces=n-1;
    while(row<=total_rows){
    
        for(int i=1; i<=spaces; i++){
            System.out.print(" ");
           }
            
           if(row == 1 || row ==n){
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
         for(int i=1; i<=spaces; i++){
            System.out.print(" ");
         }
        System.out.println();
        
        row++;
      spaces--;
}

}
public static void main(String [] args){
    printpattern(5);
}*/

/* public static void printpattern(int n){
    int row=1;
    int stars=n;
    int total_rows=n;
    int spaces=n-2;

    while(row<=n-1){

        if(row==1||row==n-1){
            for(int i=1; i<=stars; i++){
            System.out.print("*");
        }
    }else{
        System.out.print("*");

        for(int i=1; i<=spaces; i++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    System.out.println();
    row++;

}


}
public static void main(String[]  args) {
    printpattern(5);
}*/

/* public static void printpattern(int n){
    
    for(int i=1; i<=5; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(i);
            if(j!=i){
                System.out.print(" ");
            }
        }
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    }
    public static void main(String []args){
       printpattern(5);
}*/




}