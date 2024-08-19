public class function {


   /*  public static boolean isPrime(int n){
        boolean isPrime= true;

        if(n == 2){
            return isPrime;
        }
        for(int i=2; i <=n-1; i++){   // Math.sqrt(n);
            if(n % i == 0){
                isPrime= false;
                break;
            }
        }
        return isPrime;

    }

    public static void prime(int n){
        for(int i=2; i<=n ; i++ ){
            if(isPrime(i)){
                System.out.println("prime number "+i);
            }
        }
        System.out.println();
    }*/

    /*public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum > 0){
            int lastDigit=binNum % 10;
            decNum =decNum + (lastDigit *(int) Math.pow(2,pow));
            pow++;
            binNum= binNum/10;
        }
        System.out.print("Decimal  of 101: " + decNum);
    }*/

    /*public static void decToBin(int n){
        int pow=0;
        int binNum=0;

        while(n > 0){
            int rem=n % 2;
            binNum=binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("Binary:"+binNum);
    }*/

    /*public static int isEven(int num){
       boolean isEven=true;
        if(num % 2==0){
           return isEven;
          
        }
    else{
       isEven =false;
    }
    return isEven;
}*/
/*public static boolean isPalindrome(int num){

    int rev=0;
    while(num != 0){
    int lastDigit=num%10;
     rev=(rev * 10) + lastDigit;
    num=num/10;
    }
    


return num==rev;

}*/
public static int CalculateSumsum(int num){
   int  sum=0;
   while( num > 0 ){
    int lastDigit=num%10;
    sum=sum+lastDigit;
    num=num/10;
   
}
return sum;
}




    public static void main(String args[]){
       // System.out.println(isPrime(2));
      // prime(20);
     // binToDec(101);
    //   decToBin(5);
    //System.out.println(isEven(7));
    /*int num=12321;
    if(isPalindrome(num)){
        System.out.println("The number "+num+" is a Palindrome");
    }else{
        System.out.println("The number "+num+" is not a Palindrome");
    }*/
   int sum=CalculateSumsum(123);
    System.out.print(sum);
    }
    
}
/*import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);

        int N, prev = 0, current = 1;
        N = scanner.nextInt();
        // Update your code below this line.
        System.out.print(prev + " "+ current +" ");
        for(int i=3; i<=N; i++){
            int next=prev + current;
            System.out.print(next +" ");
            prev=current;
            current=next;
        }
	}
}
 */

