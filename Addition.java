//           with parameter without retun value
//public class Addition {
//     void add(int a,int b){
//         int sum=a+b;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Addition a=new Addition();
//         a.add(6,9);
//     }
// }
//            static keyword use object is not creation
// public class Addition {
//     static void add(int a,int b){
//         int sum=a+b;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
        
//         add(6,9);
//     }
// }
// public class Addition {
//     static int add(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
        
//        int res= add(6,9);
//        System.out.println(res);
//     }
// }
public class Addition{
    static void fibb(int n){
    int a=0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    for(int i=3;i<=n;i++){
        int c=a+b;
        a=b;
        b=c;
    System.out.println(c);
    }
}
    public static void main(String [] args){

    }
}
