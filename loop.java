// import java.util.Scanner;
// public class loop4{
//   public static void main(String [] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("entre a value");
// int row=sc.nextInt();
// for(int i=1;i<=row;i++){
// for(int j=1;j<=(row-i+1);j++){
//     System.out.print("*");
// }
// }
// System.out.println();
// }
// }
//                        perfect number between two given range
// import java.util.Scanner;
// public class loop{
//    public static void main(String [] args){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("entre a number");
//   int a=sc.nextInt();
//   int b =sc.nextInt();
//   for(int i=a; i<=b; i++){
//   int sum=0;   
//     for(int j=1;j<i;j++){
//      if(i%j==0){
//         sum=sum+j;
//     } 
//   }
//   if(sum == i){
//     System.out.println(i);

//   }
//   }
// }
//}
//              prime number or not
// import java.util.Scanner;
// public class loop{
//    public static void main(String [] args){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("entre a number");
//   int n=sc.nextInt();
//   int count=0;
//   for(int i=1; i<=n; i++){
//   if(n%i==0){
//     count++;
//   }
    
//   }
//   if(count==2)
//      System.out.println("prime number");
 
//  else
//    System.out.println("not a prime number");
// }
// }
import java.util.Scanner;
public class loop{
   public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("entre a number");
  int a=sc.nextInt();
  int b =sc.nextInt();
  for(int i=a; i<=b; i++){
  int count=0;   
    for(int j=1;j<i;j++){
     if(i%j==0){
        count++;
    } 
  }
  if(count==2){
    System.out.println(i);

  }
  }
}
}
