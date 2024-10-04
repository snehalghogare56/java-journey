import java.util.*;

public class BasicSorting {
    // public static void bubble(int arr[]){
    //     int n=arr.length;
    //     int swap=0;

    //     for(int turn=0; turn<n-1; turn++){

    //         for(int j=0; j<n-1-turn; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //                 swap++;

    //             }
                   
    //         }
           
    //     }
    //     System.out.println(swap);
        
    // }


    // public static void selection(int arr[]){
    //     for(int i=0; i<arr.length-1; i++ ){
    //         int minPos=i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[minPos] > arr[j]){
    //                 minPos=j;
    //             }
    //         }//swap
    //         int temp=arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=temp;
    //     }
    // }

    // public static void insertion(int arr[]){
    //     for(int i=1; i<arr.length; i++){
    //         int curr=arr[i];
    //         int prev=i-1;
    //         //Finding out correct position
    //         while(prev >=0 && arr[prev] > curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;

    //         }
    //         // insertion
    //         arr[prev+1]= curr;
    //     }
    // }

//     public static void counting(int arr[]){
//         int largest=Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest=Math.max(largest,arr[i]);
//         }
//         int count[]=new int[largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while(count[i] >0){
//                 arr[j]=i;
//                 j++;
//                 count[i]--;

//             }
//         }
//     }

    

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

  }
//   public static void mergeSort(int arr[],int si,int ei){
//     //base case
//     if(si>= ei){
//         return;
//     }
//     //kaam
//     int mid=si+(ei-si)/2;
//     mergeSort(arr, si, mid);//left part
//     mergeSort(arr, mid+1, ei);//rightpart
//     merge(arr,si,mid,ei);

//   }
//   public static void merge(int arr[],int si,int mid,int ei){
//     //left(0,3)=4 right(4,6)=3 0+6+1=7
//     int temp[]=new int[ei-si+1];
//     int i=si; //left part
//     int j=mid+1;//right part
//     int k=0; //temp arr

//     while(i<=mid && j<=ei){
//         if(arr[i] < arr[j]){
//             temp[k]=arr[i];
//             i++;
            

//         }else{
//             temp[k]=arr[j];
//             j++;
          
//         }
//         k++;
//     }
//     //left
//     while(i<=mid){
//         temp[k++]=arr[i++];
//     }
//     //right
//     while(j<=ei){
//         temp[k++] = arr[j++];
//     }
//     //copy
//     for(k=0,i=si; k<temp.length; k++,i++){
//         arr[i]=temp[k];
//     }



//   }
    //  public static void quickSort(int arr[], int si,int ei){
    //     if(si>=ei){
    //         return;
    //     }

    //     int pidx= partition(arr,si,ei);
    //     quickSort(arr, si, pidx-1);
    //     quickSort(arr, pidx+1, ei);

    //  }
    //  public static int partition(int arr[], int si, int ei) {
    //     int pivot=arr[ei];
    //     int i=si-1;
    //     for(int j=si; j<ei; j++){
    //         if(arr[j] <=pivot){
    //             i++;
    //             int temp=arr[j];
    //             arr[j]=arr[i];
    //             arr[i]=temp;
    //         }
    //     }
    //            i++;
    //             int temp=pivot;
    //             arr[ei]=arr[i];
    //             arr[i]=temp;
    //             return i;

    //  }
        public static int search(int arr[],int target,int si,int ei){
            if(si>ei){
                return -1;
            }
            int mid=si+(ei-si)/2;
            if(arr[mid] == target){
                return mid;
            }
            //mid on l1
            if(arr[si] <= arr[mid]){
                //case a: left
                if(arr[si] <= target && target <= arr[mid]){
                    return search(arr, target, si, mid-1);
                } else{
                //case b;
                return search(arr, target, mid+1, ei);
            }
            } else{
                //case c
                if(arr[mid] <= target && target <=arr[ei]){
                    return search(arr,target,mid+1,ei);
                }else{
                    //case d
                    return search(arr,target,si,mid-1);
                }
            }


        }
    

    public static void main(String args[]){

        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int targetindex= search(arr, target, 0, arr.length-1);
        System.out.println(targetindex);

       // int arr[]={6,3,9,5,2,8};
        //int arr[]={1,4,1,3,2,4,3,7};
        //bubble(arr);
        //selection(arr);
       //insertion(arr);
       
      // Arrays.sort(arr);
     // Arrays.sort(arr,Collections.reverseOrder());
    // counting(arr);
        //quickSort(arr, 0, arr.length-1);


        //printArr(arr);
       


    }
}
