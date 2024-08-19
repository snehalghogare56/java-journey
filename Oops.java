public class OOPS {
   
        public static void main(String args[]){

           // Student s1= new Student();
            // Student s2= new Student("Snehal");
            // System.out.println(s1.name);
            // Student s3=new Student(123);
            // s1.name="Snehal";
            // s1.rollno=123;
            // s1.marks[0]=100;
            // s1.marks[1]=50;
            // s1.marks[2]=87;

            // Student s2=new Student(s1);
            // System.out.println(s2.name);
            // s1.marks[2]=100;
            // for(int i=0; i<3; i++){
            //     System.out.println(s2.marks[i]);
            // }

            // Pen p1=new Pen();//pen object
            // p1.setColor("Blue");
            // System.out.println(p1.getColor());

            // p1.setTip(5);
            // System.out.println(p1.getTip());

            // p1.setColor("Yellow");
            // System.out.println(p1.getColor());
            
            // Bank b1= new Bank();
            // b1.username="Snehal";
            // b1.setPassword("123456");

            Fish shark=new Fish();
            shark.eat();
            

            
        }
}
// class Bank{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }
//     class Pen{
//         //pro + fun
//        private  String color;
//         private int tip;
//         String getColor(){
//             return this.color;
//         }
//         int getTip(){
//             return this.tip;
//         }
//         void setColor(String newColor){
//             color=newColor;
//         }
//         void setTip(int newTip){
//             tip=newTip;
//         }
//     }
    // class Student{
    //     String name;
    //     int age;
    //     float percentage;
    
    //     void calPercentage(int phy,int chem,int maths){
    //         percentage=(phy+chem+maths)/3;
    //     }
// }
// class Student{
//     String name;
//     int rollno;
//     int marks[];

//     // deep copy constructor
//     Student(Student s1){
//         marks=new int[3];
//             this.name=s1.name;
//             this.rollno=s1.rollno;
//             for(int i=0; i<marks.length; i++){
//                 this.marks[i]=s1.marks[i];
//             }
//     }

// //shallow copy constructor
//     // Student(Student s1){
//     //     marks=new int[3];
//     //     this.name=s1.name;
//     //     this.rollno=s1.rollno;
//     //     this.marks=s1.marks;
//     // }
// //Non-paramterized constructor
//     Student(){
//         marks=new int[3];
//         System.out.println("Constructor called");
//     }
// //paramterized constructor
//     Student(String name){
//         marks=new int[3];
//         this.name=name;

//     }
//     Student(int rollno){
//         marks=new int[3];
//         this.rollno=rollno;
//     }
// }
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
//Dervied class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}

