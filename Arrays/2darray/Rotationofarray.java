import java.util.Scanner;
public class Rotationofarray {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[][]=new int[r][r];
    System.out.print("enter number of rotation");
    int n=sc.nextInt();
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            a[i][j]=sc.nextInt();
        }
    }
     n=n%r;
     for(int k=0;k<n;k++){
        int last=a[r-1][r-1];
       for(int i=r-1;i>=0;i--){
         for(int j=r-1;j>=0;j--){
            a[i][j]=a[i][j-1];
       }
     }
    a[0][0]=last;
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
