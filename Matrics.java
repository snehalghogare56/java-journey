import java.util.*;
public class Matrics {
    // public static void main(String[] args) {
    //     int matrix[][]=new int[3][3];
    //     int n=matrix.length;
    //     int m=matrix[0].length;

    //     Scanner sc=new Scanner(System.in);
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             matrix[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             System.out.print(matrix[i][j] +" ");

    //         }
    //         System.out.println();
    //     }

        
    // }

    /*public static boolean search(int matrix[][],int key){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println(" found at cell (" + i +"," + j + ")" );
                    return true;
                }
            }
        }System.out.println("Key not found.");
        return false;

    }

    public static void main(String[] args) { 

        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        matrix[i][j]=sc.nextInt();
                    }
                }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }
        search(matrix, 5);

        
    }*/

    /*public static void spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");

            }//right
            for(int i=startRow +1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");

            }
            //bottom
            for(int j=endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }
    public static void main(String[] args){
        int matrix[] []= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

    spiral(matrix);
    
    }*/

    /*public static int diagonalSum(int matrix[][]){

        int sum=0;
        // for(int i=0; i< matrix.length; i++){
        //     for(int j=0; j< matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == matrix.length -1){
        //             sum += matrix[i][j];

        //         }
        //     }
        // }
        for(int i=0; i< matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length -1 -i];
            }
        }
        return sum;




    }
    public static void main(String[] args){
        int matrix[] []= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
                         System.out.print(diagonalSum(matrix));
    
    }*/

    /*public static boolean search(int matrix[][],int key){
        int row=0, col=matrix[0].length -1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println(" found at cell (" + row +"," + col + ")" );
                return true;
            }
            else if(key <  matrix[row][col]){
                col--;

        }else{
            row ++;
        }


    }
    System.out.println("Key not Found");
    return false;
}
    public static void main(String[] args) {
        int matrix[] []= {{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        int key=33;
        search(matrix,key);
        
    }*/

    /*public static int searchElements(int arr[][]){
        int count = 0;
        for(int row=0; row < arr.length; row++) {
            for(int col=0; col < arr[0].length; col++){
                if(arr[row][col] == 7){
                    count++;

                }
            }

        }
        return count;
    }

   public static void main(String[] args) {
        int arr[][] = {{4,7,8},
                         {8,8,7}};
        
        System.out.print(searchElements(arr));

    }*/

    /*public static int sum(int arr[][]){
        int sum=0;
        int[] oneArray= arr[0];
        for(int i=0; i< oneArray.length; i++){
            sum =sum +oneArray[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int  arr[][] ={{4,7,8},{8,8,7}};
        System.out.println(sum(arr));
        
    }*/
    public static int[][]  transpose(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int ans[][]= new int[m][n];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j]=arr[j][i];
            }
        }return ans;


    }
    public static void main(String[] args) {
        int  arr[][] ={{4,7,8},{8,8,7}};
        int ans[ ][] =transpose(arr);
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
            }
        }

        
    }





    
    

