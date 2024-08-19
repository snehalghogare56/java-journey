import java.util.Scanner;

public class cost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("The Cost of Pencil:");
        float Pencil=sc.nextFloat();

        System.out.print("The Cost of Pen:");
        float Pen=sc.nextFloat();

        System.out.print("The Cost of Eraser:");
        float Eraser=sc.nextFloat();

        float cost= Pencil + Pen + Eraser ;
        System.out.print("Total Cost is:"+cost);

        float newcost= cost + (0.18f * cost);
        System.out.print("Newcost:"+newcost);

    
    }
}
