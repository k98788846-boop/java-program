import java.util.Scanner;
public class Zeromatrix{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[][]=new int[r][r];boolean zero=true;
    for(int i=0;i<r;i++){
      for(int j=0;j<r;j++){
         a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<r;j++){
        if(a[i][j]!=0){
         zero=false;
        }
    }
 }
 if(zero){
   System.out.print("zero matrix");
 }else{
   System.out.print(" not zero matrix");
 }
 sc.close();

}
}