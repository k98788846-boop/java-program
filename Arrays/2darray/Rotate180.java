import java.util.Scanner;
public class Rotate180 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r/2;i++){
            for(int j=0;j<r;j++){
               
              int temp=a[i][j];
              a[i][j]=a[r-1-i][j];
              a[r-1-i][j]=temp;// s1: interchange rows .s2;reverse row wise//
            }
        }// reverse of entire array//
        for(int i=0;i<r;i++){
            for(int j=0;j<r/2;j++){
                int temp =a[i][j];
                a[i][j]=a[i][r-1-j];
                a[i][r-1-j]=temp;
            }
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
