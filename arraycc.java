import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class arraycc {

    // public static void update(int marks[],int nonchangable){
    //     nonchangable=10;
    //     for(int i=0; i<marks.length; i++){
    //         marks[i]=marks[i]+1;
    //     }
    // }


//     public static void main(String [ ] args) {
//         // int marks[]=new int[100];
//         // // int numbers[]={1,2,3};
//         // // String fruits[]={apple,mango,orange};
//         // Scanner sc=new Scanner(System.in);
//         // marks[0]=sc.nextInt();
//         // marks[1]=sc.nextInt();
//         // marks[2]=sc.nextInt();
//         // System.out.println("Length:"+marks.length);

//         // System.out.println("Physics:"+marks[0]);
//         // System.out.println("Chemistry:"+marks[1]);
//         // System.out.println("Maths:"+marks[2]);
//         // marks[2]=100;
//         // System.out.println("Maths:"+marks[2]);
//         // marks[2]=marks[2]+1;
//         // System.out.println("Maths:"+marks[2]);
//         // int percentage=(marks[0]+marks[1]+marks[2])/100;
//         // System.out.print(percentage);

//         // int marks[]={45,56,67};
//         // int nonchangable=5;
//         // update(marks,nonchangable);
//         // System.out.println(nonchangable);
//         // for(int i=0; i<marks.length; i++){
//         //     System.out.print(marks[i]+" ");
//         // }System.out.println();
// }

// public static int linearSearch(String  menu[],String key){
//     for(int i=0; i<menu.length; i++){
//         if(menu[i]==key){
//             return i;
//         }
// }
// return -1;
// }

// public static void main(String[] args) {
//     //int numbers[]={2,4,6,8,10,12,14,16};
//     String menu[]={"vadapao","buger","pizza","dosa"};
//            String  key="pizza";
//            int index = (int) linearSearch(menu,key);
//            if(index==-1){
//             System.out.print("Not Found");
//            }else{
//             System.out.print("Found at index: "+index);
//            }
// }

/*public static int get_largest(int numbers[]){
   // int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0; i<numbers.length ; i++ ){
        // if(largest<numbers[i]){
        //     largest=numbers[i];
    //}
        if(smallest>numbers[i]){
           smallest=numbers[i];

}
    }
//return largest;
return smallest;
}

public static void main(String[] args) {
    int numbers[]={3,9,12,56,78,45,23};
    //int largest=get_largest(numbers);
   // System.out.println("The Largest number is :"+largest);
   int smallest=get_largest(numbers);
   System.out.println("The Smallest number is :"+smallest);
}*/

/* public static int binarySearch(int numbers[],int key){
    int start=0;
    int end=numbers.length-1;
    while(start<=end){
        int mid=(start+end)/2;

        if(numbers[mid ]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
return -1;
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10,12,14,16};
     int key=10;
     System.out.println("Index at:"+ binarySearch(numbers,key));
}*/

/* public static void  Reverse(int numbers[]){
    int first=0;
    int last=numbers.length-1;
    while(first <last ){
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;
    }
}
public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    Reverse(numbers);

    for(int i=0; i<numbers.length ; i++){
        System.out.print(numbers[i]+" ");
}
System.out.println();
}*/

/* public static void pair(int numbers[]){
    int total_pairs=0;
    for(int i=0; i<numbers.length; i++){
        int curr=numbers[i];
        for(int j=i+1; j<numbers.length; j++){
            System.out.print("(" + curr + ","+ numbers[j] +")");
            total_pairs++;
        }
        System.out.println();
    }
    System.out.println("Total number of pairs are : "+total_pairs);

}
public static void main(String[] args) {//total paris= n(n-1) /2
    int numbers[]={2,4,6,8,10};
    pair(numbers);
}*/

/* public static void subarray(int numbers[]){
    int ts=0;
    
    for(int i=0; i<numbers.length; i++){
        int start= i;
        for(int j=i; j<numbers.length; j++){
            int end= j;
            for(int  k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
        }
        ts++;
        System.out.println();
    }System.out.println();
}
System.out.println(ts+" Sub arrays are available.");
}
public static void main(String[] args) { // sybarrays =n(n+1)/2
    int numbers[]={2,4,6,8,10};
    subarray(numbers);


}*/


/* public static int  lsearch(int numbers[],int key){
    int index=-1;
    for(int i=0; i< numbers.length; i++){
    if(numbers[i]==key){
        index=i;
    }
}
return index;

}
public  static void main(String[] args) {
   int numbers[] = {2,4,6,8,10};
   int key=6;
   int index=lsearch(numbers,key);
   System.out.println(index + " is the first occurance of "+key);

}*/

/*  public static void maxSubarraySum(int numbers[]){
    int currSum = 0;
    int maxSum=Integer.MIN_VALUE;
    
    for(int i=0; i<numbers.length; i++){
        int start= i;
        for(int j=i; j<numbers.length; j++){
            int end= j;
           currSum=0;
            for(int  k=start;k<=end;k++){
                currSum+=numbers[k];
               
        }
        System.out.println(currSum);
        if(maxSum < currSum ){
           maxSum=currSum;
        }
        
    }
}
System.out.println("Max Sum =" + maxSum);
}
public static void main(String[] args) { // sybarrays =n(n+1)/2
    int numbers[]={1,-2,6,-1,3};
    maxSubarraySum(numbers);


}*/

 /*public static void maxSubarraySum(int numbers[]){
    int currSum = 0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]= new int[numbers.length];
    prefix[0]=numbers[0];

    for(int i=1; i<prefix.length; i++){
        prefix[i]=prefix[i-1] + numbers[i];

    }
    
    for(int i=0; i<numbers.length; i++){
        int start= i;
        for(int j=i; j<numbers.length; j++){
            int end= j;
    
            currSum = start == 0 ? prefix[end] :prefix[end] - prefix[i-1];
        //System.out.println(currSum);
        if(maxSum < currSum ){
           maxSum=currSum;
        }
        
    }
}
System.out.println("Max Sum =" + maxSum);
}
public static void main(String[] args) { // sybarrays =n(n+1)/2
    int numbers[]={1,-2,6,-1,3};
    maxSubarraySum(numbers);


}*/

/*public static void kadanes(int numbers[]){
    int currSum = 0;
    int maxSum=Integer.MIN_VALUE;
    
    for(int i=0; i<numbers.length; i++){
            currSum= currSum + numbers[i];
            if(currSum <0){
                currSum=0;
            } 
     }
   // if(maxSum < currSum ){
    //     maxSum=currSum;
    //  }
    maxSum= Math.max(currSum,maxSum);

System.out.println("Max Sum =" + maxSum);
}
public static void main(String[] args) { // sybarrays =n(n+1)/2
    int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    kadanes(numbers);


}*/


/*public static int trappedRainwater(int height[]){
    // calculate left max boundry-array
    // calculate right max boundary-array

    int n = height.length;
    int trappedWater=0;
    int leftMax[] = new int[n];
     leftMax[0 ]= height[0];
    for(int i=1; i<n; i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }

    int rightMax[]=new int[n];
     rightMax[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    //loop

    for(int i=0; i<n; i++){
        int  waterLevel = Math.min(leftMax[i],rightMax[i]);
        trappedWater += waterLevel -height[i];

    }
    return trappedWater;
    //waterlevel=min(leftmax bound, rightmax bound)
    //trapped water=( waterlevel -height[i] ) *width
}

public static void main(String[] args) { 
    int height[]={4,2,0,6,3,2,5};
   System.out.println( trappedRainwater(height));


}
*/

/*public static int buyAndSell(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0; i<prices.length ; i++ ){
        if (buyPrice < prices[i]){
            int profit=prices[i]-buyPrice;
            maxProfit=Math.max(maxProfit,profit);

}else{
    buyPrice=prices[i];
}
    }
return maxProfit;
    
}



public static void main(String[] args) {
    int prices[ ] ={7,1,5,3,6,4};
    System.out.println("The maximum possible profit is : " + buyAndSell(prices));
    
}*/

/*public static int trappedRainwater(int height[]){
    int n=height.length;
    int leftMax[]=new  int[n];
    leftMax[0]=height[0];
    for(int i=1; i<n; i++){
        leftMax[i]= Math.max(height[i],leftMax[i-1]);
    }

    int  rightMax[]=new int[n];
    rightMax[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
    }
    int water;
    int trappedWater=0;
    for(int i=0; i<n; i++){
        water=Math.min(leftMax[i],rightMax[i]);
        trappedWater+=water-height[i];

    }
    return trappedWater;
}
public static void main(String []args){
    // int height[]={3,0,2,0,4};
    int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trappedRainwater(height));

}*/

// Monotonic arr[i]<=arr[i+1]

/*public static boolean Monotonic(int arr[],int n){
    boolean monotonic=true;
    for(int i=0; i<n-1; i++){
         if(arr[i] > arr[i+1]){ //is increasing
            return false;
         }
        if(arr[i] < arr[i+1]){
            return false; //is decreasing 
        }
    }
    return monotonic;

}
public static void main(String args[]) {
    int arr[]={1,6,5,7,6};
    System.out.print(Monotonic(arr, 4));
}*/

/*public static boolean isIncreasing(int arr[],int n){
    for(int i=0; i<n-1; i++){
        if(arr[i] > arr[i+1]){ //is increasing
           return false;
        }

}
return true;
}
public static boolean  isDecreasing(int arr[],int n){
    for(int i=0; i<n-1; i++){
    if(arr[i] < arr[i+1]){
        return false; //is decreasing 
    }

}
return  true;
}
public static boolean  isMonotonic(int arr[],int n) {
    boolean isIncreasing= isIncreasing(arr,n);
    boolean isDecreasing=  isDecreasing(arr,n);
    return isDecreasing || isIncreasing;
}
public  static void main (String[] args){
    int arr[]={6,5,4,4};
    System.out.print(isMonotonic(arr, 4));
}*/

// find lonely numbers x-1, x, x+1 not exist

/*public static void  printLonelyNumbers(int arr[], int n) {
   // Arrays.sort(arr);
    for(int i=0; i<n; i++){
        if(i == 0){
            if( arr[i+1] - arr[i] > 1){
                System.out.println(arr[i]);
            }

        }else if(i == n-1){
            if(arr[i] - arr[i-1] > 1){
                System.out.println(arr[i]);
            }

        }else{
            if(arr[i+1] - arr[i] > 1 && arr[i] - arr[i-1] > 1){
                System.out.println(arr[i]);
            }

        }
    }
}
public static void main(String[] args){
    int arr[]={10,6,5,8,4,13};
    System.out.println(printLonelyNumbers(arr,6));
}*/

//Bubble Sort
 /*public static void bubbleSort(int arr[]){
    int swaps =0;
    for(int turn=0; turn< arr.length-1; turn++){
          swaps=0;
        for(int j=0; j < arr.length-1-turn; j++){
            if(arr[j]> arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swaps++;

                if( swaps== 0){
                    break;
                }
            }
        } 
    }
    System.out.print("Total swaps"+ swaps);
        System.out.println();
}
  public static void printArr(int arr[]){
    for(int i=0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    

  }System.out.println();
    

 }
 public static void main(String[] args){
    int arr[]={1,2,3,4,5};
    bubbleSort(arr);
    printArr(arr);
 }*/

 // Selection Sort
 /*public static void selectionSort(int arr[]){
    for(int i=0; i < arr.length; i++){
        int minpos=i;
        for(int j=i+1;  j< arr.length; j++){
            if(arr[minpos]> arr[j]){
                minpos=j;
            }

        }
    int temp=arr[minpos];
    arr[minpos]=arr[i];
    arr[i]=temp;
    }
}

    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        
    
      }System.out.println();
        
    
     }


 public static void main(String[] args){
    int arr[]={5,4,1,3,2};
    selectionSort(arr);
    printArr(arr);
 }*/

 // Insetion Sort

 /*public static void insertionSort(int arr[]){

    for(int i=1; i <arr.length; i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev +1]=curr;
    }

 }
 public static void printArr(Integer arr[]){
    for(int i=0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    

  }System.out.println();
    

 }
public static void main(String[] args){
    Integer arr[]={5,4,1,3,2};
   // Arrays.sort(arr , 0,2);
   Arrays.sort(arr ,Collections.reverseOrder());
  // insertionSort(arr);
    printArr(arr);
}*/


/*public static void countSort(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0 ; i < arr.length ; i++) {
        largest=Math.max(largest,arr[i]);

}int count[]=new int[largest + 1];
for(int i=0; i<arr.length; i++){
    count[arr[i]] ++;
}
int j=0;
for(int i=0; i<count.length; i++){
    while(count[i] > 0){
        arr[j]=i;
        j++;
        count[i]--;
    }
}
}
public static void printArr(int arr[]){
    for(int i=0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    

  }System.out.println();
    

 }

public static void main(String[] args) {
    int arr[]={1,4,1,3,2,4,3,7};
    countSort(arr);
    printArr(arr);
}*/






}






