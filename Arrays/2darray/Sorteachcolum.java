import java.util.Scanner;
public class Sorteachcolum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r-1;j++){
                if(a[j][i]>a[j+1][i]){
                    int temp=a[j][i];
                    a[j][i]=a[j+1][i];
                    a[j+1][i]=temp;//column sort//
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[i][j]);
            }
        }
        sc.close();
    }
}
