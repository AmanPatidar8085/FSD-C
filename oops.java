// class pen{
//     String color;
//     String type;
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void print(){
//        System.out.println(this.color); 
//        System.out.println(this.type); 
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         pen pen1=new pen();
//         pen1.color = "blue";
//         pen1.type = "gel";
//         pen1.print();
        
//     }
    
// }
//                   non  perameterized constructer
//
// class student{
//     String name;
//     int age;
//     public void print(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     student(){
//         System.out.println("constructer called");
//     }
// }
// public class oops {
//          public static void main(String[] args) {
// student  s1=new student();
//          }
// 
//        }
//                              perameterized constructer
// class student{
//     String name;
//     int age;
//     public void print(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     student(String name,int age){
//         this.name =name;
//         this.age=age;
//     }
// }
// public class oops {
//          public static void main(String[] args) {
// student  s1=new student("aman",22);
// s1.print();
//          }
//         }
//                     copy constructer
class student{
    String name;
    int age;
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(student s2){
        this.name =s2.name;
        this.age=s2.age;
    }
    student(){

    }
}
public class oops {
 public static void main(String[] args) {
student  s1=new student();
s1.name="aman";
s1.age =21;
student  s2=new student(s1);
s2.print();
         }
        }