public class Recursion {

    /*public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }*/

    /*public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }*/

    /*public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n * fact(n-1);
        return fn;
    }*/

   /*  public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1=sum(n-1);
       int  sumn=n + sum(n-1);
        return sumn;
    }*/

    /*public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibn=fibnm1 + fibnm2;
        return fibn;
    }*/
    /*public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return  sorted(arr, i+1);

    }*/
    /*public static int finf(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key ){
            return i;
        }
        return finf(arr, i+1, key);
    }*/

    /*public static int findl(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        int isfound=findl(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
        

    }*/

    /*public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        //    int xnm1= pow(x,n-1);
        //    int xn= x * xnm1;
        //    return xn;
        //return x * pow(x,n-1);
        int half= pow(x,n/2);
        int halfsq=half* half;
        if(n%2 !=0){
            halfsq=x*halfsq;
        }
        return halfsq;
    }*/

    


    public static void main(String[] args) {
        //int n=5;
        //printDec(n);
       // printInc(n);
       //System.out.println(fact(n));
       //System.out.println(sum(n));
       //System.out.println(fib(n));
    //    int arr[]={1,2,3,4,5,1};
    //    int i=0;
    //    int key=1;
       //System.out.println(sorted(arr, i));
       //System.out.println(finf(arr, i, key));
       //System.out.println(findl(arr, key, i));
       System.out.println(pow(2, 10));

    }

    
}
