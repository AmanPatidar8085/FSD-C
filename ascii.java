//           A
//           B B
//           C C C
//           D D D D
//           E E E E E
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1,p='A';i<=n;i++,p++){
//         for(int j=1;j<=i;j++){
//             System.out.print((char)p+" ");
//         }
//         System.out.println();
//     }
//     }
// }
//     E
//     D D 
//     C C C
//     B B B B
//     A A A A A
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1,p='E';i<=n;i++,p--){
//         for(int j=1;j<=i;j++){
//             System.out.print((char)p+" ");
//         }
//         System.out.println();
//     }
//     }
// }
//          A
//          C C
//          E E E
//          G G G G
//          I I I I I
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1,p='A';i<=n;i++,p=p+2){
//         for(int j=1;j<=i;j++){
//             System.out.print((char)p+" ");
//         }
//         System.out.println();
//     }
//     }
// }
//                  A 
//                  B B 
//                  A A A 
//                  B B B B
//                  A A A A A
//                  B B B B B B
//                  A A A A A A A 
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             if(i%2==0){
//             System.out.print("B ");
//         }
//         else
//         System.out.print("A ");
//     }
//     System.out.println();
//     }
// }
// }
//             A
//             A B
//             A B C
//             A B C D
//             A B C D E

// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         int p='A';
//         for(int j=1;j<=i;j++){
//     System.out.print((char)p++ +" ");
//     }
//     System.out.println();
//     }
// }
// }
//       A
//       B C
//       D E F
//       G H I J
//       K L M N O
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     char ch='A';
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//     System.out.print(ch++);

//         }
//     System.out.println();
//     }
// }
// }
//             A
//             A B
//             A B C
//             A B C D
//             A B C D E
//             A B C D E
//             A B C D
//             A B C
//             A B
//             A
// import java.util.Scanner;
// public class ascii {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("entre a value");
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         int p='A';
//         for(int j=1;j<=i;j++){
//     System.out.print((char)p++ +" ");
//     }
//     System.out.println();
//     }
//     for(int i=n;i>=1;i--){
//         int p='A';
//         for(int j=1;j<=i;j++){
//     System.out.print((char)p++ +" ");
//     }
//     System.out.println();
// }
// }
//}
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("entre a value");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
    int ascii1 =65;
    int ascii2 =65+(i-1);
        for(int j=1;j<=(2*i-1);j++){
            if(i<j){
                char ch1=(char)ascii1;
                System.out.print(ch1);
                ascii1++;
            }
            else{
                char ch2=(char)ascii2;
                System.out.print(ch2);
                ascii2--;
            }
        }
    System.out.println();
    }
}
}