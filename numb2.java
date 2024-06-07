// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     Scanner sc=new Scanner(System.in);
// System.out.println("entre the value");
// int n=sc.nextInt();
// for(int i=1;i<=n;i++){
// System.out.println(2*i-1);
// }
//  }   
// }
// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     Scanner sc =new Scanner(System.in);
//     System.out.println("entre the first value");
//     int num1=sc.nextInt();
//     System.out.println("entre the second value");
//     int num2=sc.nextInt(); 
//     for(int i=num1;i<=num2;i++){
//         System.out.println(i + " ");
//     }
//  }   
// }
// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     Scanner sc =new Scanner(System.in);
//     System.out.println("entre the first value");
//     int num1=sc.nextInt();
//     System.out.println("entre the second value");
//     int num2=sc.nextInt(); 
//     for(int i=num1;i<=num2;i++){
//         if(i%2==0){
//             System.out.println(i);
//         }
//     else{
//         System.out.println();
//     }
//     }
//  }   
// }
// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     Scanner sc =new Scanner(System.in);
//     System.out.println("entre the first value");
//     int num1=sc.nextInt();
//     System.out.println("entre the second value");
//     int num2=sc.nextInt(); 
//     for(int i=num1;i<=num2;i++){
//         if(i%2-1==0){
//             System.out.println(i);
//         }
//     else{
//         System.out.println();
//     }
//     }
//  }   
// }
// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     int sum=0;
//     Scanner sc =new Scanner(System.in);
//     System.out.println("entre the  value");
//     int num=sc.nextInt();
//     for(int i=1;i<=num;i++){
//         sum=sum+i;
//     }
//             System.out.println(sum);
    
//  }   
// }
// import java.util.Scanner;
// public class numb2{
//  public static void main(String [] args){
//     int sum=0;
//     Scanner sc =new Scanner(System.in);
//     System.out.println("entre the  value");
//     int num=sc.nextInt();
//     while(num>0){
//         int rem=num%10;
//         sum=sum+rem;
//         num=num/10;
//     }
//  System.out.println(sum);
// }
// }
// import java.util.Scanner;
// class numb2 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//              System.out.println("entre the  value");
//             int strlength=sc.nextInt();
//       String str = "Radar", reverseStr = "";
      
//       int strLength = str.length();
  
//       for (int i = (strLength - 1); i >=0; --i) {
//         reverseStr = reverseStr + str.charAt(i);
//       }
  
//       if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//         System.out.println(str + " is a Palindrome String.");
//       }
//       else {
//         System.out.println(str + " is not a Palindrome String.");
//       }
//     }
//   }
import java.util.Scanner;
 public class numb2{
  public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("entre the  value");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
         if(num%i==0)
         System.out.println(i);
     }
   }
 }