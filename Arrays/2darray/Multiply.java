import java.util.Scanner;
public class Multiply {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[r][r];
        for(int i=0;i<r;i++){
          for(int j=0;j<r;j++){
            b[i][j]=sc.nextInt();
          }
        }
        int c[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                int m=0;
                for(int k=0;k<r;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
      sc.close();
    }
}
