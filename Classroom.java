import java.util.Collections;
import java.util.ArrayList;
public class Classroom {

    // public static void swap(ArrayList<Integer> list,int idx1,int idx2){
    //     int temp=list.get(idx1);
    //     list.set(idx1,list.get(idx2));
    //     list.set(idx2,temp);


    // }

// public static int water(ArrayList<Integer> height){
//     int maxwater=0;
//     int lp=0;
//     int rp= height.size()-1;
//     while(lp < rp){
//         int ht= Math.min(height.get(lp),height.get(rp));
//         int width= rp-lp;
//         int currwater= ht * width;
//         maxwater=Math.max(maxwater,currwater);
//         if(height.get(lp) < height.get(rp)){
//             lp++;
//         }else{
//             rp--;
//         }

//     }
//     // for(int i=0; i<height.size(); i++){
//     //     for(int j=i+1; j<height.size(); j++){
//     //         int ht=Math.min(height.get(i), height.get(j));
//     //         int width= j-i;
//     //         int currwater= ht * width;
//     //         maxwater=Math.max(maxwater,currwater);
//     //     }
//     // }

//     return maxwater;
// }

// public static boolean pairsum(ArrayList<Integer> list,int target){
//     int lp=0;
//     int rp=list.size()-1;
//     // for(int i=0; i<list.size(); i++){
//     //     for(int j=i+1; j<list.size(); j++){
//     //         if(list.get(i) + list.get(j)==target){
//     //             return true;
//     //         }
//     //     }
//     // }
//     while(lp < rp){
//         if(list.get(lp) + list.get(rp) == target){
//             return true;
//         }else if(list.get(lp) + list.get(rp) < target){
//             lp++;
//         }else{
//             rp--;
//         }
//     }
//     return false;
    
// }

public static boolean pairsum(ArrayList<Integer> list,int target){
    int bp=-1;
    int n= list.size();
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp=i;
            break;
        
        }
    }
    int rp=bp;
    int lp=bp+1;
    while(lp != rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }else if(list.get(lp) + list.get(rp) < target){
            lp = (lp+1)%n;
        }else{
            rp = (n+rp-1)%n;
        }
    }
    return false;
}



    public static void main(String[] args) {
        //Java Collection Framework
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<String> list2=new ArrayList<>();
    //     ArrayList<Boolean> list3=new ArrayList<>();

    //     //Add element
    //     list.add(2);//O(1)
    //     list.add(5);
    //     list.add(9);
    //     list.add(3);
    //     list.add(6);
    //    // list.add(1,9);//O(n)

        // System.out.println(list.size());
        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        // System.out.println();

    //     //Get element
    //    int element= list.get(2);
    //    System.out.println(element);

       //Remove element
    //    list.remove(2);
    //    System.out.println(list);

    //    //Set element at index
    //    list.set(2,10);
    //    System.out.println(list);

    //    //Contains element
    //    System.out.println(list.contains(1));

    // //print reverse  O(n)
    // for(int i=list.size()-1; i>=0; i-- ){
    //     System.out.println(list.get(i));
    // }

    // //Find Maximum
    // int max = Integer.MIN_VALUE;

    // for(int i=0; i < list.size(); i++){
    // //     if(max < list.get(i)){
    // //         max=list.get(i);
    // //     }
    // max = Math.max(max,list.get(i));
    // System.out.println(max);
    // }

    //Swap numbers
    // int idx1=1; 
    // int idx2=3;
    // System.out.println(list);
    // swap(list,idx1,idx2);
    //System.out.println(list);

    //ArrayList Sorting
    // Collections.sort(list);//Ascending order
    // System.out.println(list);

    // Collections.sort(list,Collections.reverseOrder());//Descending Order
    // System.out.println(list);

    // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // mainlist.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(3);
    // list2.add(4);
    // mainlist.add(list2);

    // for(int i=0; i<mainlist.size(); i++){
    //     ArrayList<Integer> currlist = mainlist.get(i);
    //     for(int j=0; j<currlist.size(); j++){
    //         System.out.print(currlist.get(j)+" ");
    //     }
    //     System.out.println();

    // }
    //System.out.println(mainlist);

    // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3= new ArrayList<>();

    // for(int i=1; i<=5; i++){
    //     list.add(i*1);
    //     list2.add(i*2);
    //     list3.add(i*3);

    // }
    // mainlist.add(list);
    // mainlist.add(list2);
    // mainlist.add(list3);
    // System.out.println(mainlist);
    // for(int i=0; i<mainlist.size(); i++){
    //         ArrayList<Integer> currlist = mainlist.get(i);
    //         for(int j=0; j<currlist.size(); j++){
    //             System.out.print(currlist.get(j)+" ");
    //         }
    //         System.out.println();
    
    //     }

    // ArrayList<Integer> height=new ArrayList<>();
    // height.add(1);
    // height.add(8);
    // height.add(6);
    // height.add(2);
    // height.add(5);
    // height.add(4);
    // height.add(8);
    // height.add(3);
    // height.add(7);
    // System.out.println(water(height));

    ArrayList<Integer> list=new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // list.add(6);
    // int target=8;
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target=16;
    
    System.out.println(pairsum(list, target));












    

        




    }
    
}
