import java.util.*;
public class helllo {
    // public static int linear(int arr[],int key){
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    // public static int largest(int arr[]){
    //     int getlarge=Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]> getlarge){
    //             getlarge=arr[i];
    //         }
    //     }
    //     return getlarge;
    // }

    // public static int binarys(int arr[],int key){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(arr[mid]==key){
    //             return mid;
    //         }
    //         else if(arr[mid]<key){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;

    // }

//     public static void reverse(int arr[]){
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//  }

// public static void pairs(int arr[]){
//     int tp=0;
//     for(int i=0; i<arr.length; i++){
//         int curr=i;
//         for(int j=i+1; j<arr.length; j++){
        
//             System.out.print("("+arr[curr]+","+arr[j]+")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("Pairs"+tp);
// }
// public static void subarray(int arr[]){

//     for(int i=0; i<arr.length; i++){
//         int curr=i;
//         for(int j=0; j<arr.length; j++){
//         int end=j;
//         for(int k=curr; k<=end; k++){
//             System.out.print(arr[k]+" ");

//         }
//         System.out.println();
            
//         }
//     }
// }
// public static void subarraysum(int arr[]){
//     int maxsum=Integer.MIN_VALUE;
//     int currsum=0;

//     for(int i=0; i<arr.length; i++){
//         int start=i;
//         for(int j=0; j<arr.length; j++){
//         int end=j;
//          currsum=0;
//         for(int k=start; k<=end; k++){
//             currsum+=arr[k];

//         }
//         if(maxsum<currsum){
//             maxsum=currsum;
//         }
            
//         }
//     }
//     System.out.println("Maximum sum of subarray is "+maxsum);
// }

// public static void subarraysum(int arr[]){
//     int maxsum=Integer.MIN_VALUE;
//     int currsum=0;
//     int prefix[]=new int[arr.length];
//     prefix[0]=arr[0];
//     for(int i=1; i<prefix.length; i++){
//         prefix[i]=prefix[i-1]+arr[i];
//     }


//     for(int i=0; i<arr.length; i++){
//         int start=i;
//         for(int j=0; j<arr.length; j++){
//         int end=j;
//          currsum=start==0 ? prefix [end] : prefix[end]-prefix[start-1];
       
//         if(maxsum<currsum){
//             maxsum=currsum;
//         }
            
//         }
//     }
//     System.out.println("Maximum sum of subarray is "+maxsum);
// }
// public static void subarraysum(int arr[]){
//     int maxsum=Integer.MIN_VALUE;
//     int currsum=0;
    
//     for(int i=0; i<arr.length; i++){
//         currsum+=arr[i];
//         maxsum=Math.max(maxsum, currsum);
//         if(currsum<0){
//             currsum=0;
//         }
        
        
//     }
//     System.out.println("Maximum sum of subarray is "+maxsum);
// }

//     public static int trapped(int height[]){
//         int trappedwater=0;
//         int n=height.length;
//         int leftmax[]=new int[n];
//         leftmax[0]=height[0];
//         for(int i=1; i<n; i++){
//             leftmax[i]=Math.max(leftmax[i-1],height[i]);
//         }
//         int rightmax[]=new int[n];
//         rightmax[n-1]=height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightmax[i]=Math.max(rightmax[i+1],height[i]);
//         }
//         for(int i=0; i<n; i++){
//             int waterlevel=Math.min(leftmax[i],rightmax[i]);
//             trappedwater+=waterlevel-height[i];
//         }
// return trappedwater;


//     }

    //   public static void buy(int prices[]){
    //     int buyprice=Integer.MAX_VALUE;
    //     int maxprofit=0;
    //     for(int i=0; i<prices.length; i++){
    //         if(buyprice < prices[i]){
    //             int profit=prices[i]-buyprice;
    //             maxprofit=Math.max(maxprofit,profit);
    //         }else{
    //             buyprice=prices[i];
    //         }


    //   }
    //   System.out.println(maxprofit);
    // }

    // public static void spiral(int matrix[][]){
    //     int startrow=0;
    //     int startcol=0;
    //     int endrow=matrix.length-1;
    //     int endcol=matrix[0].length-1;
    //     while(startrow<=endrow && startcol<=endcol){
    //         //top
    //         for(int j=startcol; j<=endcol; j++){
    //             System.out.print(matrix[startrow][j]+" ");
    //         }
    //         //right
    //         for(int i=startrow+1; i<=endrow; i++){
    //             System.out.print(matrix[i][endcol]+" ");
    //         }
    //         //bottom
    //         for(int j=endcol-1; j>=startcol; j--){
    //             if(startrow==endrow){
    //                 break;
    //             }
    //             System.out.print(matrix[endrow][j]+" ");
    //         }
    //         //left
    //         for(int i=endrow-1; i>=startrow+1; i--){
    //             if(startcol==endcol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startcol]+" ");
    //         }
    //         startrow++;
    //         startcol++;
    //         endrow--;
    //         endcol--;
    // }
    // }

    // public static int diagonal(int matrix[][]){
    //     int sum=0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

    //     for(int i=0; i<matrix.length; i++){
    //         sum+=matrix[i][i];
    //         if(i!=matrix.length-1-i){
    //         sum+=matrix[i][matrix.length-1-i];
    //         }
    //     }
    //     return sum;
    // }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[]={1,-2,6,-1,3};
        //int key=8;
        // System.out.println(linear(arr, key));
        // System.out.println(largest(arr));
        // System.out.println(binarys(arr, key));
        // reverse(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        //pairs(arr);
        // subarray(arr);
        //subarraysum(arr);
        // int height[]={4,2,0,6,3,2,5};
        // System.out.println(trapped(height));
    //     int prices[]={7,1,5,3,6,4};
    // //    buy(prices);
    //       int matrix[][]={
    //                     {1,2,3,4,},
    //                     {5,6,7,8},
    //                     {9,10,11,12},
    //                     {13,14,15,16}
    //                     };
    //                     //spiral(matrix);
    //     System.out.println(diagonal(matrix));



        
    }
    
}
