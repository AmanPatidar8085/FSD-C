// import java.util.Scanner;
// public class numb3{
// public static void main(String [] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("entre the value ");
// int sum=0;
// int num =sc.nextInt();
// for(int i=1; i<=num;i++){
//     sum=sum+i;
// }
// System.out.println(sum);
// }
// }
// import java.util.Scanner;
// public class numb3{
// public static void main(String [] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("entre the value ");
// int sum=0;
// int average=0;
// int num =sc.nextInt();
// for(int i=1; i<=num;i++){
//     sum=sum+i;
//     average=sum/num;
// }
// System.out.println(average);
// }
// }
// import java.util.Scanner;
// public class numb3{
// public static void main(String [] args){
//  Scanner sc=new Scanner(System.in);
//  System.out.println("entre the value");
//  int num=sc.nextInt(); 
//  int sum=0;
//  while(num>0){
//     int rem=num%10;
//     sum=sum+rem;
//     num=num/10;
//  }  
//  System.out.println(sum);
// }
// }

// import java.util.Scanner;
// public class numb3{
// public static void main(String [] args){
//  Scanner sc=new Scanner(System.in);
//  System.out.println("entre the value");
//  int num=sc.nextInt(); 
//  int rev=0;
//  while(num>0){
//     int rem=num%10;
//     rev=rev*10+rem;
//     num=num/10;
//  }  
//  System.out.println(rev);
// }
// }

// import java.util.Scanner;
// public class numb3{
// public static void main(String [] args){
//  Scanner sc=new Scanner(System.in);
//  System.out.println("entre the value");
//  int num=sc.nextInt(); 
//  int n,r,c,s=0;
//  c=num;
//  while(num>0){
//   r=num%10;
//   s=(s*10)+r;
//   num=num/10;  
//  }  
//  if(c==s){
//     System.out.println("palindrome number");
//  }
//  else{
//  System.out.println("not palindrome number");
// }
// }
//}
// import java.util.Scanner;
// public class numb3{
//    public static void main(String [] args){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("entre a number");   
//   int num=sc.nextInt();
//   for(int i=1;i<=num;i++){
//    if(num%i==0){
//       System.out.println(i);
//    }
//   } 
//  }
// }
// import java.util.Scanner;
// public class numb3{
//    public static void main(String [] args){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("entre a number");
//   int sum=0;   
//   int num=sc.nextInt();
//   for(int i=1;i<num;i++){
//    if(num%i==0){
//       sum=sum+i;
//   } 
// }
//   if(num==sum)
//    System.out.println("perfect number");
  
//   else
//    System.out.println("not perfect number");
//   }
//  }

import java.util.Scanner;
public class numb3{
   public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("entre a first number");
  int num1=sc.nextInt();
  System.out.println("entre a second number");
  int num2=sc.nextInt();
  for(int i=num1;i<num2;i++){
   int num,sum=0;
   while(i<num1){
   if((num1%i)==0){
      sum=sum+i;
  } 
  i++;
}
  if(i==sum)
   System.out.println(i+" ");
  
  else
   System.out.println("not perfect number");
  }
 }

}