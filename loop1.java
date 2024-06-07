import java.util.Scanner;
public class loop1{
   public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("entre a row value");
  int row=sc.nextInt();
  for(int i=1;i<=row;i++){
for(int k=1;k<=(row-i+1);k++){
 System.out.print(" ");   
}
for(int j=1;j<=i;j++){
    System.out.print("*"); 
}
System.out.println(" ");
 }
 }
}